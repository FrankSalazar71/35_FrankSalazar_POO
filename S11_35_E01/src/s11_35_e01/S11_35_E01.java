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
public class S11_35_E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alumno_35_E01 objalumno = new Alumno_35_E01("analisis de sistemas", 7, 6, "Matias", 8);
        
       Profesor_35_E01 objprofe = new Profesor_35_E01("programacion", 5, "POO");
       
       trabajador_35_E01 objtrabajador = new trabajador_35_E01("obrero", 8, 4, "marcos", 2);
       
       Persona_35_E01 objpersona = new Persona_35_E01("jose", 40);
       
       
       
       objpersona.hablar();
       objalumno.hablar();
       objprofe.hablar();
       objtrabajador.hablar();
    }
    
   
    
    
}
