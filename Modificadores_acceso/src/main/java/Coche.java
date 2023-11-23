/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frank
 */   

 // Clase derivada (subclase)
    public class Coche extends Vehiculo{

    // Variable privada específica de la subclase
    private int velocidadActual;

    // Constructor que llama al constructor de la superclase que seria vehiculo
    public Coche(String modelo) {
        super(modelo);
        this.velocidadActual = 0;
    }

    // Método público para obtener la velocidad actual
    public int getVelocidadActual() {
        return velocidadActual;
    }

    // Método público para acelerar
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadActual += incremento;
            System.out.println("El coche aceleró a " + velocidadActual + " km/h.");
        } else {
            System.out.println("La aceleración debe ser mayor que cero.");
        }
    }

    // Método específico de la subclase que sobrescribe el método de la superclase
    @Override
    protected void arrancar() {
        System.out.println("El coche está arrancando.");
        super.arrancar(); // Llamada al método
    }
}

