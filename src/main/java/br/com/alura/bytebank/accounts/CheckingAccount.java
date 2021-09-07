package br.com.alura.bytebank.accounts;

public class CheckingAccount extends Account {

    public CheckingAccount(int agency, int number){
        super(agency, number);
    }

    @Override
    public void withdraw(double value) throws InsufficientFundsException{
        double valueWithdraw = value + 0.20;
        super.withdraw(valueWithdraw);
    }
}
