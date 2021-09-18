package br.com.alura.callstack.model;

public class Flow {

    public static void main(String[] args) {

        System.out.println("Ini do main");
        try{
            metodo1();
        } catch(Exception ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1()  throws TestException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws TestException {
        System.out.println("Ini do metodo2");
        throw new NullPointerException	("Did not work");
        //System.out.println("Fim do metodo2");
    }
}


