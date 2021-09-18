package br.com.alura.bytebank.tests.accounts;

import br.com.alura.bytebank.model.employees.Administrator;
import br.com.alura.bytebank.model.employees.Manager;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager nico = new Manager();
        nico.setName("Nico Steppat");
        nico.setCpf("223355646-9");
        nico.setWage(2600.00);

        System.out.println(nico.getName());
        System.out.println(nico.getBonification());

        Administrator adm = new Administrator();
        System.out.println(adm.getBonification());
    }
}
