package main.java.com.classes;

public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String calcularSoluciones() {
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "Dos soluciones reales: x1 = " + x1 + ", x2 = " + x2;
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return "Una solución real: x = " + x;
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            return "Dos soluciones complejas: x1 = " + parteReal + " + " + parteImaginaria + "i, x2 = " + parteReal + " - " + parteImaginaria + "i";
        }
    }
}
