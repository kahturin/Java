package br.com.bytebank.employees;

public class Client implements Autetication {

    private Login login;

    public Client() {
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
}
