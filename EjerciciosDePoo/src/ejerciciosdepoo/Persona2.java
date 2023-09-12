/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdepoo;

/**
 *
 * @author frank
 */
public class Persona2 {
    private String nombre;
    private int edad;
    private boolean casado;

    public Persona2(String nombre, int edad, boolean casado) {
        this.nombre = nombre;
        this.edad = edad;
        this.casado = casado;
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

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String saludar() {
        return "Hola, soy " + nombre;
    }

    public int calcularEdadEnAños() {
        return edad * 1;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static Persona2 crearPersona(String nombre, int edad) {
        return new Persona2(nombre, edad, false);
    }

    public static Persona2 crearPersonaCasada(String nombre, int edad) {
        return new Persona2(nombre, edad, true);
    }

}
