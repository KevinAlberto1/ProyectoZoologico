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
public class Cuenta implements java.io.Serializable{
    private String nickName, contrasena;
    private Cliente usuario;
    private int tipo;
    
    public static final int Administrador=0,CLIENTE=1;

    public Cuenta (){
        nickName = "";
        contrasena = "";
      
        this.tipo=CLIENTE;
       
    }
    public Cuenta(String nickName, String contrasena, Cliente usuario) {
        this.nickName = nickName;
        this.contrasena = contrasena;
        this.usuario = usuario;
    }
    public Cuenta(String nickName, String contrasena, Cliente usuario, int tipo) {
        this.nickName = nickName;
        this.contrasena = contrasena;
        this.usuario = usuario;
        this.tipo = tipo;
    }
    public Cuenta(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void leer() {
        nickName = showInputDialog("Ingresa tu nombre");
        contrasena = showInputDialog("Ingresa tu password");
        usuario.leer();
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nickName=" + nickName + ", contrasena=" + contrasena + ", usuario=" + usuario + ", tipo=" + tipo + '}';
    }

    public String getNickName() {return nickName;}

    public void setNickName(String nickName) { this.nickName = nickName;}

    public String getContrasena() {return contrasena;}

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
