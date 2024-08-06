package main.java.com.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpleadoGUI {
    private JFrame frame;
    private JTextField txtNombre;
    private JTextField txtSalarioBasicoPorHora;
    private JTextField txtHorasTrabajadas;
    private JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                EmpleadoGUI window = new EmpleadoGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public EmpleadoGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(5, 2));

        JLabel lblNombre = new JLabel("Nombre:");
        frame.getContentPane().add(lblNombre);

        txtNombre = new JTextField();
        frame.getContentPane().add(txtNombre);
        txtNombre.setColumns(10);

        JLabel lblSalarioBasicoPorHora = new JLabel("Salario Básico por Hora:");
        frame.getContentPane().add(lblSalarioBasicoPorHora);

        txtSalarioBasicoPorHora = new JTextField();
        frame.getContentPane().add(txtSalarioBasicoPorHora);
        txtSalarioBasicoPorHora.setColumns(10);

        JLabel lblHorasTrabajadas = new JLabel("Horas Trabajadas:");
        frame.getContentPane().add(lblHorasTrabajadas);

        txtHorasTrabajadas = new JTextField();
        frame.getContentPane().add(txtHorasTrabajadas);
        txtHorasTrabajadas.setColumns(10);

        JButton btnCalcular = new JButton("Calcular");
        frame.getContentPane().add(btnCalcular);

        lblResultado = new JLabel();
        frame.getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularSalario();
            }
        });
    }

    private void calcularSalario() {
        String nombre = txtNombre.getText();
        double salarioBasicoPorHora = Double.parseDouble(txtSalarioBasicoPorHora.getText());
        int horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());

        Empleado empleado = new Empleado(nombre, salarioBasicoPorHora, horasTrabajadas);
        double salarioMensual = empleado.calcularSalarioMensual();

        if (salarioMensual > 450000) {
            lblResultado.setText(nombre + " - Salario Mensual: $" + salarioMensual);
        } else {
            lblResultado.setText(nombre);
        }
    }
}
