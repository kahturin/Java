package org.example;

public class CreateAccountTest {

    public static void main(String[] args) {
        Account c1 = new Account(31321, 3213213);
        System.out.println("O saldo da primeira conta é " + c1.getBalance());
        c1.deposit(200);
        System.out.println("O saldo da primeira conta é " + c1.getBalance());

        Account c2 = new Account(8985, 564654);
        c1.transfer(200, c2);
        System.out.println("O saldo da segunda conta é " + c2.getBalance());
    }
}
