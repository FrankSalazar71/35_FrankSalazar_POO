/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._franksalazar;

/**
 *
 * @author Lab25
 */
public class persona2_35 {

    public String nombre;
     public int edad;

     public persona2_35(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    

    }

  public String getNombre() {
        return nombre;
    

    }

  public int getEdad() {
         return edad;
    

    }

  public String saludar() {
        return "Hola, soy " + nombre + " y tengo " + edad + " años.";
    
    }
}


