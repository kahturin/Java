package br.com.alura.javaio;

import java.io.*;

public class FileWriterTest {

    public static void main(String[] args) throws IOException {

        BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\Users\\Karina\\IdeaProjects\\Java\\src\\main\\java\\br\\com\\alura\\javaio\\lorem4.txt"));

        fw.write("this is a test, let's go see if works");
        fw.write(System.lineSeparator());
        fw.write("works");

        fw.close();
    }
}
