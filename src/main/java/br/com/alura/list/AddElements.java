package br.com.alura.list;

public class AddElements implements Runnable{
    private Listt lista;
    private int numeroDaThread;

    @Override
    public void run() {
        synchronized (lista) { //novo, obtendo a chave da lista
            try { //novo try-catch
                System.out.println("esperando, aguardando notificacao");
                lista.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < lista.tamanho(); i++) {
                System.out.println(i + " - " + lista.pegaElemento(i));
            }
        }
    }
}
