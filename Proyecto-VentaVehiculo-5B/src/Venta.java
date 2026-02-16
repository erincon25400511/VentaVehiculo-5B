/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */

public class Venta {
        //Atributos
    private int cantidad;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private String etiqueta;

    //Constructor
    public Venta(int cantidad, Vehiculo vehiculo, Cliente cliente, String etiqueta) {
        this.cantidad = cantidad;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.etiqueta = etiqueta;
    }

    @Override
    //toString()
    public String toString() {
        return etiqueta + "Cantidad: " + this.cantidad + "\n Vehiculo: " +
                this.vehiculo + "\n Cliente: " + this.cliente;
    }
}
