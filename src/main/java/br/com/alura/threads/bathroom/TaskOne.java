package br.com.alura.threads.bathroom;

public class TaskOne implements Runnable {

    private Bathroom bat;

    public TaskOne(Bathroom bathroom) {
        this.bat = bathroom;
    }

    @Override
    public void run() {
        this.bat.number1();
    }
}
