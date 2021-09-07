package br.com.alura.bytebank.accounts;

public class MethodTest {

    public static void main(String[] args) {
        //Testando método de depositar
        Account marceloAccounts = new SavingsAccount(1325, 54555);
        marceloAccounts.deposit(199);
        String deposited = marceloAccounts.deposit(100);
        System.out.println(deposited);

        //Testando método de sacar
        Account isabelaAccounts = new SavingsAccount(1321, 54683);
        isabelaAccounts.deposit(100);
        try {
            isabelaAccounts.withdraw(10.0);
        } catch(InsufficientFundsException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }
        System.out.println(isabelaAccounts.getBalance());

        //Testando método de transferir
        Account marciaAccounts = new SavingsAccount(1254, 45875);
        marciaAccounts.deposit(100);
        System.out.println(marciaAccounts.getBalance());
        System.out.println(isabelaAccounts.getBalance());
        marciaAccounts.transfer(50, isabelaAccounts);
        System.out.println("your balance is: " + marciaAccounts.getBalance());
        System.out.println("your balance is: " + isabelaAccounts.getBalance());
    }
}
