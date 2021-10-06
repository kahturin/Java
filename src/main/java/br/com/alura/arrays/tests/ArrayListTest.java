package br.com.alura.arrays.tests;

import br.com.alura.bytebank.model.accounts.Account;
import br.com.alura.bytebank.model.accounts.SavingsAccount;

import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        //Generics
        List<Account> list = new LinkedList<>();

        Account ac = new SavingsAccount(2222, 56552);
        list.add(ac);

        Account ac2 = new SavingsAccount(2252, 56555);
        list.add(ac2);

        Account ac3 = new SavingsAccount(2252, 56555);
        boolean exists = list.contains(ac3);

        System.out.println("This account exists? " + exists);

        for (Account account: list){
            System.out.println(account);
        }
    }
}
