package br.com.alura.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8 {

    //if you use the "default" declaration in the method declaration, it can have a body in one interface

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("hhhh");
        words.add("pineapple");

        words.sort((String o1, String o2) -> {
            System.out.println(Integer.compare(o1.length(), o2.length()));
            //System.out.println(words);

            for (String w : words) {
                System.out.println(w);
            }
            return 0;
        });
        words.forEach(s -> {
            System.out.println(s);
        });
    }
}

