package com.unida.practicaestudiante;

/**
 *
 * @author ortiz
 */
public class PracticaEstudiante {

    public static void main(String[] args) {
        Estudiante Estudiante1 = new Estudiante("Carlos Ortiz", 20, 2.4);
        Estudiante1.MostrarFicha();
        Estudiante1.setPromedio(4.8);
        System.out.println("El promedio actualizado es: " + Estudiante1.getPromedio());
    }
}
    