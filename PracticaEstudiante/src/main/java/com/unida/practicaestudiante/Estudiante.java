package com.unida.practicaestudiante;

/**
 *
 * @author ortiz
 */
public class Estudiante {
    private String Nombre;
    private int Edad;
    private double Promedio;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }

    public Estudiante(String Nombre, int Edad, double Promedio) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Promedio = Promedio;
    }
    public void MostrarFicha() {
        System.out.println("nombre:" + Nombre);
        System.out.println("edad:" + Edad);
        System.out.println("promedio:" + Promedio);
        
    }
}
