/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11_35_e01;

/**
 *
 * @author frank
 */
public class Persona_35_E01 {

    //atributos 
    public Persona_35_E01(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    String nombre;
    int edad;

    
    
    //metodos 
    
    public void hablar(){
        System.out.println("hola " + nombre + " que tal");
    }
    
    public void escuchar(){
        
    }
    
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
