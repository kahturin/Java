package br.com.alura.bytebank.tests.accounts;

import java.util.Locale;

public class StringTest {

    public static void main(String[] args) {

        String name = "Karina";
        //para deixar tudo em mínusculo
        // String otherName = name.toLowerCase();

        //para deixar tudo em maíusculo
        String otherName = name.toUpperCase();

        //para fazer uma alteraração
        String other = name.replace("Ka", "kA");

        //denominação de um único caractere representado por char e ''
        char b = 'c';
        char c = 'd';
        System.out.println(b);

        //mostra o resultado da posição especificada no parametro
        char d = name.charAt(2);
        System.out.println(d);

        //mostra o começo do que foi especificado no parametro
        int pos = name.indexOf("ri");
        System.out.println(pos);

        //irá imprimir o resultado total após a especificação do parametro
        String sub = name.substring(1);
        System.out.println(sub);

        //neste caso, mostrará a quantidade de caracteres existentes na varável
        System.out.println(name.length());
        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        //retorna um booleano, true se for vazio, false se conter caractere
        String empty = "   Karina     ";
        System.out.println(empty.isEmpty());

        //podemos perguntar se a String está vazia.
        String anotherEmpty = empty.trim();
        System.out.println(anotherEmpty.isEmpty());

        //remove os espaços
        String oneMoreEmpty ="    Alura    ";
        String otherEmpt = oneMoreEmpty.trim();
        System.out.println(otherEmpt);

        //contains, para validar se existe aquele valor onde está buscando o mesmo
        System.out.println(oneMoreEmpty.contains("Alu"));

        System.out.println(other);


    }
}
