package br.com.alura.bytebank.employees;

abstract class Employee {
    private String name;
    private String cpf;
    private double wage;

    public abstract double getBonification();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}

