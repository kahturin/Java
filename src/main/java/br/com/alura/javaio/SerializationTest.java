package br.com.alura.javaio;

import java.io.*;

public class SerializationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //String name = "Karina";

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
//        oos.writeObject(name);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.bin"));
        String name = (String) ois.readObject();
        ois.close();
        System.out.println(name);
    }
}
