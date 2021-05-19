/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectozoologico;

import java.util.Arrays;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author Kevin Alberto Perez
 */
public class Boletos implements java.io.Serializable{
    private String boleto;
    private int cantidad, fecha,precio;

    public Boletos(){
    this.boleto="";
    this.cantidad=0;
    this.fecha=0;
    this.precio=0;
    }
    
    
    public Boletos(String boleto, int cantidad, int fecha, int precio) {
        this.boleto = boleto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.precio = precio;
    }
    
    public void leer(){
    boleto=showInputDialog("tu boleto es normal");
    cantidad=Integer.parseInt(showInputDialog("Tienes"+cantidad+"boletos"));
    precio=Integer.parseInt(showInputDialog("El costo de tu boleto es de 250$"));
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

}

