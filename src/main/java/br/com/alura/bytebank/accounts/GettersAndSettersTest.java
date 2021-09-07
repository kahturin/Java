package br.com.alura.bytebank.accounts;

public class GettersAndSettersTest {

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1234, 46555);
        account.setNumber(9022);
        System.out.println(account.getNumber());

        Client isadora = new Client();
        isadora.setName("Isadora Barbosa");

        account.setHolder(isadora);
        System.out.println(account.getHolder().getName());
        account.getHolder().setCpf("458745874587");

        Client holderOfAccount = account.getHolder();

        System.out.println(holderOfAccount);
        System.out.println(isadora);
        System.out.println(account.getHolder());
    }
}
