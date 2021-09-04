package br.com.bytebank.accounts;

public class CreateAccountTest {

    public static void main(String[] args) {
        CheckingAccount c1 = new CheckingAccount(31321, 3213213);
        System.out.println("O saldo da primeira conta é " + c1.getBalance());
        c1.deposit(200);
        System.out.println("O saldo da primeira conta é " + c1.getBalance());

        CheckingAccount c2 = new CheckingAccount(8985, 564654);
        c1.transfer(200, c2);
        System.out.println("O saldo da segunda conta é " + c2.getBalance());
    }
}
