package br.com.alura.bytebank.employees;

public class Manager extends Employee implements Autetication{

    private Login login;

    public Manager() {
        this.login = new Login();
    }

    @Override
    public void setPassword(int password){
        this.login.setPassword(password);
    }

    @Override
    public boolean authentic(int password) {
        return this.login.authentic(password);

    }

    public double getBonification(){
        return super.getWage();
    }
}
