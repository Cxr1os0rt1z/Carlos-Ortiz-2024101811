package com.unida.holamundo;

/**
 *
 * @author ortiz
 */
public class Holamundo {
    public static int contador=0;
        
    public static void incrementarContador(){
       contador++;
    }
    public static void main(String[] args) {
        Holamundo.incrementarContador();
        System.out.println("Contador: " + Holamundo.contador);
    }
  
}
