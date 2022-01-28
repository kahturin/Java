package br.com.alura.threads.bathroom;

public class Bathroom {

    public void number1(){
        String nome = Thread.currentThread().getName();

        synchronized (this){
            System.out.println("entrando no banheiro");
            System.out.println("fazendo coisa rapida");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("dando descarga");
            System.out.println("lavando a mao");
            System.out.println("saindo do banheiro");
        }
    }

    public void number2() {
        synchronized (this) {
            System.out.println("entrando no banheiro");
            System.out.println("fazendo coisa rapida");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("dando descarga");
            System.out.println("lavando a mao");
            System.out.println("saindo do banheiro");
        }
    }
}
