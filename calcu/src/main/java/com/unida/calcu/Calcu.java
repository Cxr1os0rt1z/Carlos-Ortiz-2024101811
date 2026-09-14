package com.unida.calcu;
import java.util.Scanner;
public class Calcu {

    public static void main(String[] args) {
        Scanner Datos = new Scanner(System.in);
        int a, b, c = 0;
        calculadoraprivate CalculadoraPriv = new calculadoraprivate();
        int resultado;
        int resultadoR;
        System.out.println("numero1:");
        a = Datos.nextInt();
        System.out.println("numero2:");
        b = Datos.nextInt();
        System.out.println("1 sumar\n2 restar");
        c = Datos.nextInt();
        if (c == 1){
            resultado = CalculadoraPriv.Sumar(a,b);
            System.out.println("resultado de la suma:" + resultado);
        }else if(c == 2){
            resultadoR = CalculadoraPriv.restar(a,b);
            System.out.println("resultado de la resta:" + resultadoR);
        }else{
            System.out.println("opcion invalida:");
        }
        
        
    }
}
