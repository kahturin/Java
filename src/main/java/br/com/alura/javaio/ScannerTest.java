package br.com.alura.javaio;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("C:\\Users\\Karina\\IdeaProjects\\Java\\src\\main\\java\\br\\com\\alura\\javaio\\contas.csv"));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String typeAccount = linhaScanner.next();
            int agency = linhaScanner.nextInt();
            int number = linhaScanner.nextInt();
            String holder = linhaScanner.next();
            double balance = linhaScanner.nextDouble();

            System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f%n",
                    typeAccount, agency, number, holder, balance);

            linhaScanner.close();
        }

        scanner.close();
    }
}
