package br.com.alura.threads;

public class PrintString extends Thread{

    public void run() {
        System.out.println("answer");
    }
}
 class RespostaMain {

    public static void main(String[] args) {
        PrintString task = new PrintString();
        task.start();
    }
}