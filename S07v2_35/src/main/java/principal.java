/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author frank
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear los objetos
        PERSONA persona1 = new PERSONA("Juan", 25, 'M');
        PERSONA persona2 = new PERSONA("María", 30, 'F');

        // Utilizar métodos
        persona1.saludar();
        persona2.cumplirAnios();
        persona1.presentarse();
        persona2.presentarse("Hola");

        // Obtener valores de retorno
        System.out.println("Nombre de persona1: " + persona1.getNombre());
        System.out.println("Edad de persona2: " + persona2.getEdad());
        System.out.println("Género de persona1: " + persona1.getGenero());

        // Utilizar métodos con los  parámetros
        persona1.asignarEdad(26);
        persona2.asignarGenero('F');

        // Verificar cambios
        System.out.println("Nueva edad de persona1: " + persona1.getEdad());
        System.out.println("Nuevo género de persona2: " + persona2.getGenero());
    }
}
    
    

