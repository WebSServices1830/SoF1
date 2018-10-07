/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
@Named(value = "wsSessionBean")
@SessionScoped
public class wsSessionBean implements Serializable {

    /**
     * Creates a new instance of wsSessionBean
     */
    public wsSessionBean() {
    }
    private boolean estado=false;
    private String usuario;
    private String clave;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String registro(){
        System.out.println("registro.");
        estado=true;
        return "index";
    } 

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public boolean getEstadoSession(){
        return estado;
    }
    
    public String salir(){
    estado=false;
        System.out.println("salir");
    return null;
    }
    public String login(){
        estado=true;
    
        return null;
    } 
    
}
