/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectozoologico;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Kevin Alberto Perez
 */
public abstract class Persona implements java.io.Serializable {
    protected String nombre;
    protected int edad;
    protected String correo;

    public Persona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }//constructor
    public void leer(){
        nombre=showInputDialog("Dame tu nombre");
        edad=Integer.parseInt(showInputDialog("Dime tu edad"));
        correo=showInputDialog("Ingresa tu correo");
    }//leer

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + '}';
    }

    
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    
    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}
    
}
