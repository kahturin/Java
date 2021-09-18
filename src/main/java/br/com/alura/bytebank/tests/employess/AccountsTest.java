package br.com.alura.bytebank.tests.employess;

import br.com.alura.bytebank.model.accounts.CheckingAccount;
import br.com.alura.bytebank.model.accounts.Client;
import br.com.alura.bytebank.model.accounts.SavingsAccount;

public class AccountsTest {

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(4654, 65465);
        sa.deposit(200);
        System.out.println(sa.getBalance());

        CheckingAccount ca = new CheckingAccount(4658, 65468);
        ca.deposit(200);
        System.out.println(ca.getBalance());

        sa.transfer(100, ca);

        System.out.println(sa.getBalance());
        System.out.println(ca.getBalance());

        ca.withdraw(90);
        System.out.println(ca.getBalance());

        Client yan = new Client();
        yan.setCpf("165466516");
        yan.setProfession("programmer");
        System.out.println(yan.getProfession());
        System.out.println(yan.getCpf());
    }
}
