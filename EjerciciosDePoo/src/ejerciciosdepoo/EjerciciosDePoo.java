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
public class EjerciciosDePoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona2 persona1 = new Persona2("Juan", 15, false);
        Persona2 persona2 = new Persona2("María", 30, true);

        System.out.println(persona1.saludar());
        System.out.println(persona2.saludar());

        System.out.println(persona1.calcularEdadEnAños());
        System.out.println(persona2.calcularEdadEnAños());

        System.out.println(persona1.esMayorDeEdad());
        System.out.println(persona2.esMayorDeEdad());
    }
    
}
