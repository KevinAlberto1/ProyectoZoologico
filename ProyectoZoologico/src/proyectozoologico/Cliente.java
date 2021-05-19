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
public class Cliente extends Persona implements java.io.Serializable {
    private String cop;
    private String text;
    
public Cliente(String cop, String nombre, int edad, String correo) {
        super(nombre, edad, correo);
        this.cop = cop;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cop=" + cop + '}';
    }

    public String getCop() {
        return cop;
    }

    public void setCop(String cop) {
        this.cop = cop;
    }

   
}
