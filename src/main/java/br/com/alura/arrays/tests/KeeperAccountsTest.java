package br.com.alura.arrays.tests;

import br.com.alura.arrays.model.KeeperAccounts;
import br.com.alura.bytebank.model.accounts.Account;
import br.com.alura.bytebank.model.accounts.SavingsAccount;

public class KeeperAccountsTest {
    public static void main(String[] args) {

        KeeperAccounts keeper = new KeeperAccounts();

        Account ac = new SavingsAccount(2222, 56555);
        keeper.add(ac);

        Account ac2 = new SavingsAccount(2252, 56555);
        keeper.add(ac2);

        int syze = keeper.getQuantity();
        System.out.println(syze);

        Account ref = keeper.getReference(0);
        System.out.println(ref.getNumber());
    }
}
