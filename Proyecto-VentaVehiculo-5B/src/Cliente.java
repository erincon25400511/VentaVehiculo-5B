/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Cliente {

    //Atributos
    private String rs;
    private String rfc;
    private String email;
    private String etiqueta;

    //Constructor
    public Cliente(String rs, String rfc, String email, String etiqueta) {
        this.rs = rs;
        this.rfc = rfc;
        this.email = email;
        this.etiqueta = etiqueta;
    }

    @Override
    //toString()
    public String toString() {
        return etiqueta + "Razón Social del cliente: " + this.rs + "\n RFC del cliente: " +
                this.rfc + "\nEmail del cliente: " + this.email;
    }

}
