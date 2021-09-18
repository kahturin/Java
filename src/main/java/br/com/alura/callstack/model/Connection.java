package br.com.alura.callstack.model;

public class Connection implements AutoCloseable{

    public Connection() {
        System.out.println("opening connection");
        throw new IllegalStateException();
    }

    public void leDados() {
        System.out.println("receiving data");
        throw new IllegalStateException();
    }

    @Override
    public void close() {
        System.out.println("closing connection");

    }
}
