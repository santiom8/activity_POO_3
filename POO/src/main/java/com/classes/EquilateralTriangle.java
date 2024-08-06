package main.java.com.classes;

public class EquilateralTriangle {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculatePerimeter() {
        return 3 * side;
    }

    public double calculateHeight() {
        return (Math.sqrt(3) / 2) * side;
    }

    public double calculateArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }
}
