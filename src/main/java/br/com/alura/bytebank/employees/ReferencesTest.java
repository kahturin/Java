package br.com.alura.bytebank.employees;

public class ReferencesTest {
    public static void main(String[] args) {

        Manager g1 = new Manager();
        g1.setName("Marcos");
        g1.setWage(5000.0);

        VideoEditor ev = new VideoEditor();
        ev.setWage(2500.0);

        Designer d = new Designer();
        d.setWage(2000.0);

        BonusControl bonus = new BonusControl();
        bonus.register(g1);
        bonus.register(ev);
        bonus.register(d);

        System.out.println(bonus.getSum());
        System.out.println(d.getBonification());
    }



}
