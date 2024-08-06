package main.java.com.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeGUI {
    private JFrame frame;
    private JTextField txtEmployeeCode;
    private JTextField txtNames;
    private JTextField txtHoursWorked;
    private JTextField txtHourlyRate;
    private JTextField txtTaxPercentage;
    private JLabel lblGrossSalary;
    private JLabel lblNetSalary;
    private JLabel lblEmployeeCodeResult;
    private JLabel lblNamesResult;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                EmployeeGUI window = new EmployeeGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public EmployeeGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(10, 2));

        JLabel lblEmployeeCode = new JLabel("Employee Code:");
        frame.getContentPane().add(lblEmployeeCode);

        txtEmployeeCode = new JTextField();
        frame.getContentPane().add(txtEmployeeCode);
        txtEmployeeCode.setColumns(10);

        JLabel lblNames = new JLabel("Names:");
        frame.getContentPane().add(lblNames);

        txtNames = new JTextField();
        frame.getContentPane().add(txtNames);
        txtNames.setColumns(10);

        JLabel lblHoursWorked = new JLabel("Hours Worked Per Month:");
        frame.getContentPane().add(lblHoursWorked);

        txtHoursWorked = new JTextField();
        frame.getContentPane().add(txtHoursWorked);
        txtHoursWorked.setColumns(10);

        JLabel lblHourlyRate = new JLabel("Hourly Rate:");
        frame.getContentPane().add(lblHourlyRate);

        txtHourlyRate = new JTextField();
        frame.getContentPane().add(txtHourlyRate);
        txtHourlyRate.setColumns(10);

        JLabel lblTaxPercentage = new JLabel("Withholding Tax Percentage:");
        frame.getContentPane().add(lblTaxPercentage);

        txtTaxPercentage = new JTextField();
        frame.getContentPane().add(txtTaxPercentage);
        txtTaxPercentage.setColumns(10);

        JButton btnCalculate = new JButton("Calculate");
        frame.getContentPane().add(btnCalculate);

        JLabel lblEmployeeCodeLabel = new JLabel("Employee Code:");
        frame.getContentPane().add(lblEmployeeCodeLabel);

        lblEmployeeCodeResult = new JLabel();
        frame.getContentPane().add(lblEmployeeCodeResult);

        JLabel lblNamesLabel = new JLabel("Names:");
        frame.getContentPane().add(lblNamesLabel);

        lblNamesResult = new JLabel();
        frame.getContentPane().add(lblNamesResult);

        JLabel lblGrossSalaryLabel = new JLabel("Gross Salary:");
        frame.getContentPane().add(lblGrossSalaryLabel);

        lblGrossSalary = new JLabel();
        frame.getContentPane().add(lblGrossSalary);

        JLabel lblNetSalaryLabel = new JLabel("Net Salary:");
        frame.getContentPane().add(lblNetSalaryLabel);

        lblNetSalary = new JLabel();
        frame.getContentPane().add(lblNetSalary);

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateSalaries();
            }
        });
    }

    private void calculateSalaries() {
        String employeeCode = txtEmployeeCode.getText();
        String names = txtNames.getText();
        int hoursWorked = Integer.parseInt(txtHoursWorked.getText());
        double hourlyRate = Double.parseDouble(txtHourlyRate.getText());
        double taxPercentage = Double.parseDouble(txtTaxPercentage.getText());

        Employee employee = new Employee(employeeCode, names, hoursWorked, hourlyRate, taxPercentage);
        lblEmployeeCodeResult.setText(employee.getEmployeeCode());
        lblNamesResult.setText(employee.getNames());
        lblGrossSalary.setText(String.format("%.2f", employee.calculateGrossSalary()));
        lblNetSalary.setText(String.format("%.2f", employee.calculateNetSalary()));
    }
}
