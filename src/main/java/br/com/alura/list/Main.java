package br.com.alura.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Listt lista = new Listt();

        for (int i = 0; i < 10; i++) {
            new Thread(new AddElements(lista, i)).start();
        }

        new Thread(new AddElements(lista)).start();
    }
}
