package br.com.alura.javaio;

import java.io.*;

public class WriterTest {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Karina\\IdeaProjects\\Java\\src\\main\\java\\br\\com\\alura\\javaio\\lorem2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter buf = new BufferedWriter(osw);

        buf.write("this is a test, let's go see if works");
        buf.newLine();
        buf.write("works");

        buf.close();
    }
}
