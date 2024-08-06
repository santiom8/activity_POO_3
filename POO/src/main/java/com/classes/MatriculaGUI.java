package main.java.com.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatriculaGUI {
    private JFrame frame;
    private JTextField txtNumeroInscripcion;
    private JTextField txtNombres;
    private JTextField txtPatrimonio;
    private JTextField txtEstratoSocial;
    private JLabel lblPagoMatricula;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MatriculaGUI window = new MatriculaGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public MatriculaGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(6, 2));

        JLabel lblNumeroInscripcion = new JLabel("Número de Inscripción:");
        frame.getContentPane().add(lblNumeroInscripcion);

        txtNumeroInscripcion = new JTextField();
        frame.getContentPane().add(txtNumeroInscripcion);
        txtNumeroInscripcion.setColumns(10);

        JLabel lblNombres = new JLabel("Nombres:");
        frame.getContentPane().add(lblNombres);

        txtNombres = new JTextField();
        frame.getContentPane().add(txtNombres);
        txtNombres.setColumns(10);

        JLabel lblPatrimonio = new JLabel("Patrimonio:");
        frame.getContentPane().add(lblPatrimonio);

        txtPatrimonio = new JTextField();
        frame.getContentPane().add(txtPatrimonio);
        txtPatrimonio.setColumns(10);

        JLabel lblEstratoSocial = new JLabel("Estrato Social:");
        frame.getContentPane().add(lblEstratoSocial);

        txtEstratoSocial = new JTextField();
        frame.getContentPane().add(txtEstratoSocial);
        txtEstratoSocial.setColumns(10);

        JButton btnCalcular = new JButton("Calcular");
        frame.getContentPane().add(btnCalcular);

        lblPagoMatricula = new JLabel();
        frame.getContentPane().add(lblPagoMatricula);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularPagoMatricula();
            }
        });
    }

    private void calcularPagoMatricula() {
        int numeroInscripcion = Integer.parseInt(txtNumeroInscripcion.getText());
        String nombres = txtNombres.getText();
        double patrimonio = Double.parseDouble(txtPatrimonio.getText());
        int estratoSocial = Integer.parseInt(txtEstratoSocial.getText());

        Estudiante estudiante = new Estudiante(numeroInscripcion, nombres, patrimonio, estratoSocial);
        lblPagoMatricula.setText("Pago de Matrícula: $" + estudiante.calcularPagoMatricula());
    }
}
