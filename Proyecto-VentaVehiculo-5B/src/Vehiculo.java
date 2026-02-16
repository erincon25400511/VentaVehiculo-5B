/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Vehiculo {
        //Atributos
    private String marca;
    private int precio;
    private String motor;
    private String etiqueta;

    //Constructor
    public Vehiculo(String marca, int precio, String motor, String etiqueta) {
        this.marca = marca;
        this.precio = precio;
        this.motor = motor;
        this.etiqueta = etiqueta;
    }

    @Override
    //toString()
    public String toString() {
        return etiqueta + "Marca del vehiculo: " + this.marca + "\n Precio del vehiculo: " +
                this.precio + "\n Motor del vehiculo: " + this.motor;
    }
}
