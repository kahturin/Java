package br.com.bytebank.employees;

public class ManagerTest {

    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setName("Nico");
        m1.setWage(5000.0);

        double bonus = m1.getBonification();
        System.out.println(bonus);

        boolean authenticated = m1.authentic(2121);
        System.out.println(authenticated);

        m1.getBonification();
        System.out.println(bonus);
    }
}
