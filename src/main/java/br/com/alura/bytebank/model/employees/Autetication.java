package br.com.alura.bytebank.model.employees;

public interface Autetication {

    void setPassword(int password);

     boolean authentic(int password);

}
