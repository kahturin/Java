package br.com.alura.javaio;

import java.io.*;

public class ReadTest {

    public static void main(String[] args) throws IOException {

        FileInputStream fir = new FileInputStream("C:\\Users\\Karina\\IdeaProjects\\Java\\src\\main\\java\\br\\com\\alura\\javaio\\lorem.txt");
        InputStreamReader inp = new InputStreamReader(fir);
        BufferedReader buf = new BufferedReader(inp);

        String line = buf.readLine();
        while(line != null) {
            System.out.println(line);
            line = buf.readLine();
        }

        buf.close();
    }
}
