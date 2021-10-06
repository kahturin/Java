package br.com.alura.arrays.tests;

import java.util.*;

public class WrapperIntegerTest {

    public static void main(String[] args) {
        Integer ageRef = 29; //autoboxinng
        int primitive = new Integer(29); //unboxing

        List<Integer> list = new ArrayList<>();
            list.add(ageRef);
            list.add(primitive); //autoboxing

            int i1 = list.get(0); //unboxing
            Integer i2 = list.get(1);

        System.out.println(i1);
        System.out.println(i2);

        Integer refValue = Integer.valueOf(33); // delegando a criação para método valueOf
        int primitiveValue = refValue.intValue(); //desembrulhando, pegando o valor primitivo do objeto wrapper

        System.out.println(primitiveValue);

        Integer iParseado1 = Integer.valueOf("42"); //parseando e devolvendo referencia
        int iParseado2 = Integer.parseInt("44");  //parseando e devolvendo primitivo

        System.out.println(iParseado1); //42
        System.out.println(iParseado2); //44

        System.out.println(Integer.MAX_VALUE); // 2^31 - 1
        System.out.println(Integer.MIN_VALUE); //-2^31

        System.out.println(Integer.SIZE); // 32 bits
        System.out.println(Integer.BYTES);
    }
}
