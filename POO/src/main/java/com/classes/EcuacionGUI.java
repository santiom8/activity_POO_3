package main.java.com.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcuacionGUI {
    private JFrame frame;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                EcuacionGUI window = new EcuacionGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public EcuacionGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(5, 2));

        JLabel lblA = new JLabel("Valor de A:");
        frame.getContentPane().add(lblA);

        txtA = new JTextField();
        frame.getContentPane().add(txtA);
        txtA.setColumns(10);

        JLabel lblB = new JLabel("Valor de B:");
        frame.getContentPane().add(lblB);

        txtB = new JTextField();
        frame.getContentPane().add(txtB);
        txtB.setColumns(10);

        JLabel lblC = new JLabel("Valor de C:");
        frame.getContentPane().add(lblC);

        txtC = new JTextField();
        frame.getContentPane().add(txtC);
        txtC.setColumns(10);

        JButton btnCalcular = new JButton("Calcular");
        frame.getContentPane().add(btnCalcular);

        lblResultado = new JLabel();
        frame.getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularSoluciones();
            }
        });
    }

    private void calcularSoluciones() {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double c = Double.parseDouble(txtC.getText());

        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(a, b, c);
        lblResultado.setText(ecuacion.calcularSoluciones());
    }
}

