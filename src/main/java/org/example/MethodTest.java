package org.example;

public class MethodTest {

    public static void main(String[] args) {
        //Testando método de depositar
        Account marceloAccounts = new Account(1325, 54555);
        marceloAccounts.deposit(199);
        String deposited = marceloAccounts.deposit(100);
        System.out.println(deposited);

        //Testando método de sacar
        Account isabelaAccounts = new Account(1321, 54683);
        isabelaAccounts.deposit(100);
        boolean Withdrawing = isabelaAccounts.withdraw(20);
        if(Withdrawing){
            System.out.println(Withdrawing + " Você sacou");
        } else {
            System.out.println(Withdrawing + " Não foi possível sacar");
        }

        //Testando método de transferir
        Account marciaAccounts = new Account(1254, 45875);
        marciaAccounts.deposit(100);
        System.out.println(marciaAccounts.getBalance());
        System.out.println(isabelaAccounts.getBalance());
        String transferred = marciaAccounts.transfer(50, isabelaAccounts);
        System.out.println(transferred);
        System.out.println("Seu saldo é: " + marciaAccounts.getBalance());
        System.out.println("Seu saldo é: " + isabelaAccounts.getBalance());
    }
}
