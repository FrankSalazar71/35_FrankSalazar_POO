/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._franksalazar;

/**
 *
 * @author Lab25
 */
public class Main_S7_35FrankSalazar {

    public static void main(String[] args) {
    persona1_35 persona1 = new persona1_35("Juan", 30);
persona1_35 persona2 = new persona1_35("María", 25);

persona1.saludar();
persona2.saludar();

persona2_35 persona3 = new persona2_35("Juan", 30);
persona2_35 persona4 = new persona2_35("María", 25);
System.out.println(persona3.saludar());
System.out.println(persona4.saludar());
       
    }
}
