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
public class trabajador_35_E01 extends Persona_35_E01 {

    public trabajador_35_E01(String categoria, int salario, int HorasTrabajo, String nombre, int edad) {
        super(nombre, edad);
        this.categoria = categoria;
        this.salario = salario;
        this.HorasTrabajo = HorasTrabajo;
    }
    
    String categoria;
    int salario;
    int HorasTrabajo;



 
    
    
    public void trabajar(){
        
    }
    
    public void comer(){
        
    }
}
