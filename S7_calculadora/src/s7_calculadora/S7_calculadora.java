/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s7_calculadora;

/**
 *
 * @author frank
 */
public class S7_calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        s7_calculadora1 calculadora = new s7_calculadora1();

        // Suma
        int suma = calculadora.sumar(15, 20);
        System.out.println("15 + 20 = " + suma);

        // Resta
        int resta = calculadora.restar(15, 20);
        System.out.println("15 - 20 = " + resta);

        // Multiplicación
        int multiplicacion = calculadora.multiplicar(15, 20);
        System.out.println("15 * 20 = " + multiplicacion);

        // División
        int division = calculadora.dividir(15, 20);
        System.out.println("15 / 20 = " + division);
    }

    }
    

