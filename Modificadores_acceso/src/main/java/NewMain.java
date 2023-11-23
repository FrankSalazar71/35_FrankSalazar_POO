/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author frank
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto de la subclase
        Coche miCoche = new Coche("toyota");

        // Accedemos a los métodos y variables desde el objeto creado
        System.out.println("Modelo del coche: " + miCoche.getModelo());

        // Intentar acceder a la variable privada de la superclase Vehiculo(no es posible)
        //System.out.println(miCoche.modelo); // Esto generaría un error

        // Utilizar métodos de la superclase
        miCoche.arrancar();

        // Acelerar el coche
        miCoche.acelerar(39);
}
}
    
    

