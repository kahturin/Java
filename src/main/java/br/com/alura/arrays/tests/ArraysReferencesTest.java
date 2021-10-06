package br.com.alura.arrays.tests;

import br.com.alura.bytebank.model.accounts.CheckingAccount;
import br.com.alura.bytebank.model.accounts.Client;
import br.com.alura.bytebank.model.accounts.SavingsAccount;

public class ArraysReferencesTest {

    public static void main(String[] args) {

        Object[] references = new Object[5];
        SavingsAccount ca1 = new SavingsAccount(2144, 5455);
        references[0] = ca1;

        CheckingAccount ca2 = new CheckingAccount(2154, 5455);
        references[1] = ca2;

        Client client = new Client();
        client.setName("Jordan");
        references[2] = client;

        Client ref3 = (Client) references[2];
        System.out.println(ref3.getName());

        CheckingAccount ref2 = (CheckingAccount) references[1];
        System.out.println(ref2.getAgency());

        SavingsAccount ref = (SavingsAccount) references[0];
        System.out.println(ref.getAgency());

        int number = 3;
        double value = (double) number; //cast explícito
        System.out.println(value);

        int number1 = 3;
        double value1 = number1; //cast implícito
        System.out.println(value1);

        double value2 = 3.56;
        int number2 = (int) value2; //cast explicito é exigido pelo compilador
        System.out.println(number2);


    }
}
