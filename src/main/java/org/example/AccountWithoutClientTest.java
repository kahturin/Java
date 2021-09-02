package org.example;

public class AccountWithoutClientTest {

    public static void main(String[] args) {
        Account pauloAccount = new Account(21113, 45114);
        System.out.println(pauloAccount.getBalance());

        pauloAccount.setHolder(new Client());
        System.out.println(pauloAccount.getHolder());

        pauloAccount.getHolder().setName("Paulo Brexcha");
        System.out.println(pauloAccount.getHolder().getName());
    }
}
