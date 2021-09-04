package br.com.bytebank.accounts;

public class CheckingAccount extends Account {

    public CheckingAccount(int agency, int number){
        super(agency, number);
    }

    @Override
    public boolean withdraw(double value){
        double valueWithdraw = value + 0.20;
        return super.withdraw(valueWithdraw);
    }
}
