package org.example;

public class Account {
    private double balance;
    private int agency;
    private int number;
    private Client holder;
    private static int total;

    public Account(int agency, int number) {
        Account.total++;
        System.out.println("O total de contas é " + Account.total);
        this.agency = agency;
        this.number = number;
    }

    public String deposit(double value){
        this.balance += value;
        return "\n" +
                "the value of " + value + "has been deposited";
    }

    public boolean withdraw(double value){
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        }else{
            return false;
        }
    }

    public String transfer(double value, Account destination){
        if (this.balance >= value){
            this.balance -= value;
            destination.deposit(value);
            return "You transferred " + value + "R$";
        }
        return "could not transfer";
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
