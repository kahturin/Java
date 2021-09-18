package br.com.alura.callstack.tests;

import br.com.alura.callstack.model.Account;
import br.com.alura.callstack.model.TestException;

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
