package br.com.alura.bytebank.model.employees;

public class BonusControl {

    private double sum;

    public void register(Employee e){
        double employeeBonus = e.getBonification();
        this.sum = this.sum + employeeBonus;
    }

    public double getSum(){
        return sum;
    }
}
