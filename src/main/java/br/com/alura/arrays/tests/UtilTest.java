package br.com.alura.arrays.tests;

import br.com.alura.arrays.model.KeeperReferences;
import br.com.alura.bytebank.model.accounts.Account;
import br.com.alura.bytebank.model.accounts.SavingsAccount;

import java.util.ArrayList;
import java.util.LinkedList;

public class UtilTest {
    public static void main(String[] args) {

        LinkedList<Account> list = new LinkedList<Account>();

        Account ac = new SavingsAccount(2222, 56552);
        list.add(ac);

        Account ac2 = new SavingsAccount(2252, 56555);
        list.add(ac2);

        System.out.println("Tamanho: " + list.size());

        Account ref = list.get(0);
        System.out.println(ref.getNumber());

        list.remove(0);
        System.out.println(list.size());

        Account ac3 = new SavingsAccount(2222, 56552);
        list.add(ac3);

        Account ac4 = new SavingsAccount(2252, 56555);
        list.add(ac4);

        for(int i = 0; i < list.size(); i++){
            Account refe = list.get(i);
            System.out.println(refe);
        }
        System.out.println("=========");

        for (Account account: list){
            System.out.println(account);
        }
    }
}
