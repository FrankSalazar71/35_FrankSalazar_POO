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
public class Alumno_35_E01 extends Persona_35_E01 {

    public Alumno_35_E01(String carrera, int cliclo, int numeroDeorden, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.cliclo = cliclo;
        this.numeroDeorden = numeroDeorden;
    }
    
    //atributos 
    
    String carrera;
    int cliclo;
    int numeroDeorden;





    public void estudiar(){
        
    }
    
    public void caminar(){
        
    }
}
