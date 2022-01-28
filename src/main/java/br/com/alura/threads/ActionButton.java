package br.com.alura.threads;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class ActionButton implements ActionListener {

    Thread thred = new Thread();

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public ActionButton(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MultiplicationTask task = new MultiplicationTask(primeiro, segundo, resultado);
        Thread threadMultiplication = new Thread(task);
        threadMultiplication.start();
    }
}
