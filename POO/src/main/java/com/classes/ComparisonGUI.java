package main.java.com.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComparisonGUI {
    private JFrame frame;
    private JTextField txtA;
    private JTextField txtB;
    private JLabel lblResult;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ComparisonGUI window = new ComparisonGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public ComparisonGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(4, 2));

        JLabel lblA = new JLabel("Enter value for A:");
        frame.getContentPane().add(lblA);

        txtA = new JTextField();
        frame.getContentPane().add(txtA);
        txtA.setColumns(10);

        JLabel lblB = new JLabel("Enter value for B:");
        frame.getContentPane().add(lblB);

        txtB = new JTextField();
        frame.getContentPane().add(txtB);
        txtB.setColumns(10);

        JButton btnCompare = new JButton("Compare");
        frame.getContentPane().add(btnCompare);

        lblResult = new JLabel();
        frame.getContentPane().add(lblResult);

        btnCompare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                compareValues();
            }
        });
    }

    private void compareValues() {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());

        Comparison comparison = new Comparison(a, b);
        lblResult.setText(comparison.compareValues());
    }
}
