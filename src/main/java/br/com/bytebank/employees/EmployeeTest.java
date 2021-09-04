package br.com.bytebank.employees;

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
