package br.com.alura.arrays.tests;

import br.com.alura.bytebank.model.accounts.Account;
import br.com.alura.bytebank.model.accounts.CheckingAccount;
import br.com.alura.bytebank.model.accounts.Client;
import br.com.alura.bytebank.model.accounts.SavingsAccount;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LambdasTest {
    public static void main(String[] args) {
        List<Account> list = new LinkedList<>();

        Account cc1 = new SavingsAccount(2222, 3333);
        Client c1 = new Client();
        cc1.deposit(333.0);
        cc1.getHolder().setName("alisson");
        list.add(cc1);

        Account cc2 = new SavingsAccount(2252, 4444);
        Client c2 = new Client();
        cc2.deposit(444.0);
        cc2.getHolder().setName("marlon");
        list.add(cc2);

        Account cc3 = new CheckingAccount(22, 1111);
        Client c3 = new Client();
        cc3.deposit(111.0);
        cc3.getHolder().setName("marisa");
        list.add(cc3);

        Account cc4 = new CheckingAccount(22, 2222);
        Client c4 = new Client();
        cc4.deposit(222.0);
        cc4.getHolder().setName("jonas");
        list.add(cc3);

        Comparator<Account> comp = new Comparator<Account>() {

            @Override
            public int compare(Account c1, Account c2) {
                String nomeC1 = c1.getHolder().getName();
                String nomeC2 = c2.getHolder().getName();
                return nomeC1.compareTo(nomeC2);
            }
        };
    }
}
