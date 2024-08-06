package main.java.com.classes;

public class Comparison {
    private double a;
    private double b;

    public Comparison(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String compareValues() {
        if (a > b) {
            return "A is greater than B";
        } else if (a == b) {
            return "A is equal to B";
        } else {
            return "A is less than B";
        }
    }
}

