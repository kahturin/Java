package br.com.alura.bytebank.tests.employess;

import br.com.alura.bytebank.model.accounts.Account;
import br.com.alura.bytebank.model.accounts.SavingsAccount;

public class NumberOfCreatedAccountsTest {

    public static void main(String[] args) {
        Account c1 = new SavingsAccount(165, 6546);
        Account c2 = new SavingsAccount(164, 6546);
        Account c3 = new SavingsAccount(166, 6546);

        System.out.println(Account.getTotal());
    }


}
