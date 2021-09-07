package br.com.alura.bytebank.accounts;

public class ReferenceTest {

    public static void main(String[] args) {
        CheckingAccount c1 = new CheckingAccount(4545,21545);
        c1.deposit(300);

        System.out.println("Saldo da primeira conta" + c1.getBalance());

        Account c2 = c1;
        System.out.println("Saldo da segunda conta" + c2.getBalance());

        c2.deposit(200);
        System.out.println("Saldo da segunda conta" + c2.getBalance());
        System.out.println("Saldo da primeira conta" + c2.getBalance());

        if(c1 == c2){
            System.out.println("mesma conta");
        } else {
            System.out.println("contas diferentes");
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}
