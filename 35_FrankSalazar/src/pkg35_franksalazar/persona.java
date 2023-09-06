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
public class persona {
     //atributos
    String nombre;
    int edad;
   
   //metodos
   
public void hablar(){
 
    System.out.println( nombre + " dice hola");
   
}

public void orden() {
   
    System.out.println(nombre + " tiene " + edad + " años");
}
 public void ingresarNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la persona: ");
        nombre = scanner.nextLine();
    }

    public void ingresarEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la edad de la persona: ");
        edad = scanner.nextInt();
    }
}


