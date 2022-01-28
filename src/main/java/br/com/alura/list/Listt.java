package br.com.alura.list;

public class Listt {

    private String[] elementos;

    public synchronized void adicionaElementos(String elemento) {
        this.elementos[indice] = elemento;
        this.indice++;

        try{
            Thread.sleep(10);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        if (this.indice == this.tamanho()) { //novo if
            System.out.println("lista tá cheia, notificando");
            this.notify();
        }
    }
}
