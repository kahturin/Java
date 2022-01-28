package br.com.alura.threads.search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NameSearch implements Runnable {

    private String archiveName;
    private String name;


    public NameSearch(String arquivo, String name) {
        this.archiveName = arquivo;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(archiveName));

            int numberLine = 1;

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                if (line.contains(name)){
                    System.out.println(archiveName + " - " + numberLine + line);
                }
                numberLine++;
            }
            scanner.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
