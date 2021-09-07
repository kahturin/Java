package br.com.alura.bytebank.employees;

public class Login {
    private int password;

    public void setPassword(int password){
        this.password = password;
    }

    public boolean authentic(int password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }
    }
}
