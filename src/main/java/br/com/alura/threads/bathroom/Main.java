package br.com.alura.threads.bathroom;

public class Main{

    public static void main(String[] args) {

        Bathroom bathroom = new Bathroom();

        Thread user1 = new Thread(new TaskOne(bathroom), "joao");
        Thread user2 = new Thread(new TaskOne(bathroom), "loana");
        Thread user3 = new Thread(new TaskOne(bathroom), "paulo");

        user1.start();
        user2.start();
        user3.start();
    }
}
