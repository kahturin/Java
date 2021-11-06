package br.com.alura.javaio;

import java.io.*;

public class PrintStreamTest {

    public static void main(String[] args) throws IOException {

        //PrintStream ps = new PrintStream("lorem3");
        PrintWriter pw = new PrintWriter("C:\\Users\\Karina\\IdeaProjects\\Java\\src\\main\\java\\br\\com\\alura\\javaio\\lorem3.txt");
        pw.println("this is a test, let's go see if works");
        pw.print(System.lineSeparator());

        pw.close();
    }
}
