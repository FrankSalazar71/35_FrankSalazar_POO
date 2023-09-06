/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35_franksalazar;

import java.util.Scanner;


/**
 *
 * @author frank
 */
public class calculadora {
     //atributos
    int a;
    int b;
    int totalSU;
    int totalRE;
    int totalMUL;
 //metodo multiplicar
   
public void multiplicar() {
    totalMUL = a*b;
    System.out.println("la multiplicacion sale: " + totalMUL);
}
public void sumar(){
    totalSU = a+b;
    System.out.println("la suma sale: " +  totalSU);
}
public void restar(){
    totalRE = a-b;
    System.out.println("la resta sale: " + totalRE);
}
public void ingresarA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        a = scanner.nextInt();
    }

    public void ingresarB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el segundo número: ");
        b = scanner.nextInt();
    }

}