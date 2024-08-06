package main.java.com.classes;

public class Empleado {
    private String nombre;
    private double salarioBasicoPorHora;
    private int horasTrabajadas;

    public Empleado(String nombre, double salarioBasicoPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioBasicoPorHora = salarioBasicoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBasicoPorHora() {
        return salarioBasicoPorHora;
    }

    public void setSalarioBasicoPorHora(double salarioBasicoPorHora) {
        this.salarioBasicoPorHora = salarioBasicoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioMensual() {
        return salarioBasicoPorHora * horasTrabajadas;
    }
}
