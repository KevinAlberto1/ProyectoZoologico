/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectozoologico;

/**
 *
 * @author Kevin Alberto Perez
 */
public  class Zoologico implements java.io.Serializable {
    String app;

    public Zoologico(String app) {
        this.app = app;
    }

    @Override
    public String toString() {
        return "Zoologico{" + "app=" + app + '}';
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }
    
    
}
