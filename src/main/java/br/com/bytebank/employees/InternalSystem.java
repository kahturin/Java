package br.com.bytebank.employees;

public class InternalSystem {

    private int senha = 2222;

    public void authenticates(Autetication a) {

        boolean autenticou = a.authentic(this.senha);

        if (autenticou) {
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");

        }
    }
}
