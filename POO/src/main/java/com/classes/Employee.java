package main.java.com.classes;

public class Employee {
    private String employeeCode;
    private String names;
    private int hoursWorkedPerMonth;
    private double hourlyRate;
    private double withholdingTaxPercentage;

    public Employee(String employeeCode, String names, int hoursWorkedPerMonth, double hourlyRate, double withholdingTaxPercentage) {
        this.employeeCode = employeeCode;
        this.names = names;
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
        this.withholdingTaxPercentage = withholdingTaxPercentage;
    }

    // Getters and Setters
    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getWithholdingTaxPercentage() {
        return withholdingTaxPercentage;
    }

    public void setWithholdingTaxPercentage(double withholdingTaxPercentage) {
        this.withholdingTaxPercentage = withholdingTaxPercentage;
    }

    public double calculateGrossSalary() {
        return hoursWorkedPerMonth * hourlyRate;
    }

    public double calculateNetSalary() {
        double grossSalary = calculateGrossSalary();
        return grossSalary - (grossSalary * withholdingTaxPercentage / 100);
    }
}
