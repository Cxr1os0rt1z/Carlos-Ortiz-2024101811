package com.unida.calcu;

/**
 *
 * @author ortiz
 */
public class calculadoraprivate {
    private int numero1;
    private int numero2;

    public calculadoraprivate() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public calculadoraprivate(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public int Sumar(int numero1, int numero2){
        return numero1 + numero2;
    }
    public int restar(int numero1, int numero2){
        return numero1 - numero2;
    }
}
