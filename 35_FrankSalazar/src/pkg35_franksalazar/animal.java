/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35_franksalazar;

import javax.swing.JOptionPane;

/**
 *
 * @author frank
 */
public class animal {
   
    //atributos
   
    String nombre;
    String especie;
    int edad;
   
    //metodos
public void comer(){    
   System.out.println("el " + nombre + " come ");
}

public void correr(){
    System.out.println("el " + especie + " corre");
}

public void dormir(){
   System.out.println("el " + nombre + " de " + edad + " años duerme ");
}

public void preguntar(){
    nombre = JOptionPane.showInputDialog("Ingresa el nombre del animal: ");
    especie = JOptionPane.showInputDialog("Ingresa la especie del animal: ");
    String edadString = JOptionPane.showInputDialog("Ingresa la edad del animal: ");
        this.edad = Integer.parseInt(edadString);
}
}

