package br.com.alura.callstack;

public class AccountWithExceptionTest {

    public static void main(String[] args) {

        Account c = new Account();
        try {
            c.deposit();
        } catch(TestException ex) {
            System.out.println("tratamento ....");
        }

    }
}
