package org.example;

public class NumberOfCreatedAccountsTest {

    public static void main(String[] args) {
        Account c1 = new Account(165, 6546);
        Account c2 = new Account(164, 6546);
        Account c3 = new Account(166, 6546);

        System.out.println(Account.getTotal());
    }


}
