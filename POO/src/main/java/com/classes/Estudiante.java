package main.java.com.classes;

public class Estudiante {
    private int numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estratoSocial;

    public Estudiante(int numeroInscripcion, String nombres, double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(int numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public int getEstratoSocial() {
        return estratoSocial;
    }

    public void setEstratoSocial(int estratoSocial) {
        this.estratoSocial = estratoSocial;
    }

    public double calcularPagoMatricula() {
        double pagoBase = 50000;
        if (patrimonio > 2000000 && estratoSocial > 3) {
            pagoBase += patrimonio * 0.03;
        }
        return pagoBase;
    }
}
