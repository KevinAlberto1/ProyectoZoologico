/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectozoologico;
import java.util.Calendar;
import static javax.swing.JOptionPane.showInputDialog;
/**
 *
 * @author Kevin Alberto Perez
 */
public class Compra implements java.io.Serializable{
    protected int total;
    protected Calendar fecha;
    protected Cliente cliente;
    private int folio;
    public static int ffolio;
    
    public Compra() {
        total = 0;
        fecha = new java.util.GregorianCalendar();
    }

    public Compra(int total, Calendar fecha, Cliente cliente) {
        this.total = total;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Compra{" + "total=" + total + ", fecha=" + fecha + ", cliente=" + cliente + ", folio=" + folio + '}';
    }

    public void leer() {
        total = Integer.parseInt(showInputDialog("Ingrese el total: "));
    }
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public static int getFfolio() {
        return ffolio;
    }

    public static void setFfolio(int ffolio) {
        Compra.ffolio = ffolio;
    }
    
}
