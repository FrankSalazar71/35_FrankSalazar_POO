/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frank
 */
public class PERSONA {
   
    // Atributos
    private String nombre;
    private int edad;
    private char genero;

    // Constructor
    public PERSONA(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Métodos
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ".");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
    }

    // Sobrecarga de métodos
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años.");
    }

    public void presentarse(String saludo) {
        System.out.println(saludo + ", soy " + nombre + ".");
    }

    // Métodos con valores de retorno
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    // Métodos con parámetros y argumentos
    public void asignarEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    public void asignarGenero(char nuevoGenero) {
        genero = nuevoGenero;
    }
}
