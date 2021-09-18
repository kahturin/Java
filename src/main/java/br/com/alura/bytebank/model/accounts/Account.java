package br.com.alura.bytebank.model.accounts;

/**
 * This class represents the modeling of an Account.
 *
 * @author Karina
 * @version 1.0
 */

public abstract class Account {

    private double balance;
    private int agency;
    private int number;
    private Client holder;
    private static int total;

    /**
     * This constructor represents the request to include the agency and number when it is invoked.
     *
     * @param agency;
     * @param number;
     */

    public Account(int agency, int number) {
        Account.total++;
        System.out.println("The total of accounts is " + Account.total);
        this.agency = agency;
        this.number = number;
    }

    /**
     *  This method represents
     * @param value
     * @return
     */

    public String deposit(double value){
        this.balance += value;
        return "the value of " + value + "has been deposited";
    }

    public void withdraw(double value) throws InsufficientFundsException{
        if (this.balance < value) {
            throw new InsufficientFundsException("Balance: " + this.balance + ", value:" + value);
        }
        this.balance -= value;
    }

    public void transfer(double value, Account destiny) throws InsufficientFundsException {
        this.withdraw(value);
        destiny.deposit(value);
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public static int getTotal() {
        return Account.total;
    }

    public double getBalance() {
        return balance;
    }
}
