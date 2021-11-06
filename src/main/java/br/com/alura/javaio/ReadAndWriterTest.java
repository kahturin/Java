package br.com.alura.javaio;

import java.io.*;

public class ReadAndWriterTest {

    public static void main(String[] args) throws IOException {
        /**
         *
         * the classes that are alternatives to establish the same output are:
         * java.io.PrintWriter
         * java.io.PrintStream
         * java.io.FileWriter
         */

        InputStream fir = System.in; //new FileInputStream("C:\\Users\\Karina\\IdeaProjects\\Java\\src\\main\\java\\br\\com\\alura\\javaio\\lorem.txt");
        InputStreamReader inp = new InputStreamReader(fir);
        BufferedReader buf = new BufferedReader(inp);

        OutputStream fos = System.out;//new FileOutputStream("C:\\Users\\Karina\\IdeaProjects\\Java\\src\\main\\java\\br\\com\\alura\\javaio\\lorem4.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = buf.readLine();

        while (line != null && !line.isEmpty()) {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = buf.readLine();
        }

        buf.close();
        bw.close();
    }
}
