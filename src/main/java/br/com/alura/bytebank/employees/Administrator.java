package br.com.alura.bytebank.employees;

public class Administrator implements Autetication {

    private Login login;

    public Administrator() {
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
        return 300;
    }
}
