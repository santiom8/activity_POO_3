package main.java.com.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TriangleGUI {
    private JFrame frame;
    private JTextField txtSide;
    private JLabel lblPerimeter;
    private JLabel lblHeight;
    private JLabel lblArea;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                TriangleGUI window = new TriangleGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public TriangleGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(5, 2));

        JLabel lblSide = new JLabel("Side Length:");
        frame.getContentPane().add(lblSide);

        txtSide = new JTextField();
        frame.getContentPane().add(txtSide);
        txtSide.setColumns(10);

        JButton btnCalculate = new JButton("Calculate");
        frame.getContentPane().add(btnCalculate);

        JLabel lblPerimeterLabel = new JLabel("Perimeter:");
        frame.getContentPane().add(lblPerimeterLabel);

        lblPerimeter = new JLabel();
        frame.getContentPane().add(lblPerimeter);

        JLabel lblHeightLabel = new JLabel("Height:");
        frame.getContentPane().add(lblHeightLabel);

        lblHeight = new JLabel();
        frame.getContentPane().add(lblHeight);

        JLabel lblAreaLabel = new JLabel("Area:");
        frame.getContentPane().add(lblAreaLabel);

        lblArea = new JLabel();
        frame.getContentPane().add(lblArea);

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateTriangleProperties();
            }
        });
    }

    private void calculateTriangleProperties() {
        double side = Double.parseDouble(txtSide.getText());

        EquilateralTriangle triangle = new EquilateralTriangle(side);
        lblPerimeter.setText(String.format("%.4f", triangle.calculatePerimeter()));
        lblHeight.setText(String.format("%.4f", triangle.calculateHeight()));
        lblArea.setText(String.format("%.4f", triangle.calculateArea()));
    }
}
