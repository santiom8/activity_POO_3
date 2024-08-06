package main.java.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FigurasGeometricasGUI {
    private JFrame frame;
    private JComboBox<String> comboFiguras;
    private JPanel panelParametros;
    private JTextField txtParam1;
    private JTextField txtParam2;
    private JLabel lblParam1;
    private JLabel lblParam2;
    private JButton btnCalcular;
    private JLabel lblResultadoArea;
    private JLabel lblResultadoPerimetro;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                FigurasGeometricasGUI window = new FigurasGeometricasGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public FigurasGeometricasGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(6, 2));

        JLabel lblSeleccionFigura = new JLabel("Seleccione la figura:");
        frame.getContentPane().add(lblSeleccionFigura);

        comboFiguras = new JComboBox<>(new String[]{"Circulo", "Rectangulo", "Cuadrado", "Triangulo Rectangulo"});
        frame.getContentPane().add(comboFiguras);

        lblParam1 = new JLabel();
        frame.getContentPane().add(lblParam1);

        txtParam1 = new JTextField();
        frame.getContentPane().add(txtParam1);
        txtParam1.setColumns(10);

        lblParam2 = new JLabel();
        frame.getContentPane().add(lblParam2);

        txtParam2 = new JTextField();
        frame.getContentPane().add(txtParam2);
        txtParam2.setColumns(10);

        btnCalcular = new JButton("Calcular");
        frame.getContentPane().add(btnCalcular);

        lblResultadoArea = new JLabel("Área: ");
        frame.getContentPane().add(lblResultadoArea);

        lblResultadoPerimetro = new JLabel("Perímetro: ");
        frame.getContentPane().add(lblResultadoPerimetro);

        comboFiguras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarParametros();
            }
        });

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        actualizarParametros();
    }

    private void actualizarParametros() {
        String figuraSeleccionada = (String) comboFiguras.getSelectedItem();
        if (figuraSeleccionada.equals("Circulo")) {
            lblParam1.setText("Radio:");
            lblParam2.setText("");
            txtParam2.setVisible(false);
        } else if (figuraSeleccionada.equals("Rectangulo")) {
            lblParam1.setText("Base:");
            lblParam2.setText("Altura:");
            txtParam2.setVisible(true);
        } else if (figuraSeleccionada.equals("Cuadrado")) {
            lblParam1.setText("Lado:");
            lblParam2.setText("");
            txtParam2.setVisible(false);
        } else if (figuraSeleccionada.equals("Triangulo Rectangulo")) {
            lblParam1.setText("Base:");
            lblParam2.setText("Altura:");
            txtParam2.setVisible(true);
        }
    }

    private void calcular() {
        String figuraSeleccionada = (String) comboFiguras.getSelectedItem();
        try {
            double param1 = Double.parseDouble(txtParam1.getText());
            double param2 = txtParam2.isVisible() ? Double.parseDouble(txtParam2.getText()) : 0;
            double area = 0;
            double perimetro = 0;

            if (figuraSeleccionada.equals("Circulo")) {
                Circulo circulo = new Circulo((int) param1);
                area = circulo.calcularArea();
                perimetro = circulo.calcularPerimetro();
            } else if (figuraSeleccionada.equals("Rectangulo")) {
                Rectangulo rectangulo = new Rectangulo((int) param1, (int) param2);
                area = rectangulo.calcularArea();
                perimetro = rectangulo.calcularPerimetro();
            } else if (figuraSeleccionada.equals("Cuadrado")) {
                Cuadrado cuadrado = new Cuadrado((int) param1);
                area = cuadrado.calcularArea();
                perimetro = cuadrado.calcularPerimetro();
            } else if (figuraSeleccionada.equals("Triangulo Rectangulo")) {
                TrianguloRectangulo triangulo = new TrianguloRectangulo((int) param1, (int) param2);
                area = triangulo.calcularArea();
                perimetro = triangulo.calcularPerimetro();
            }

            lblResultadoArea.setText("Área: " + area);
            lblResultadoPerimetro.setText("Perímetro: " + perimetro);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Por favor ingrese valores numéricos válidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
