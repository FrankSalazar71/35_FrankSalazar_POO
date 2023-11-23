/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frank
 */
public class Vehiculo {
    // Variable con modificador de acceso **privada** encapsulada
    private String modelo;
   //Variable sin modificador de acceso **Default** 
    String nombre;

    // Constructor
    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    // Método con modificador de acceso **público** para obtener el modelo
    public String getModelo() {
        return modelo;
    }

    // Método con modificador de acceso  **protegido**
    protected void arrancar() {
        System.out.println("El vehículo está arrancando.");
    }
}


