/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Monoplaza;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author sala a
 */
@Named(value = "wsMonoplazaBean")
@ManagedBean
public class wsMonoplazaBean {

    /**
     * Creates a new instance of wsMonoplazaBean
     */
    private List<Monoplaza> monoplazas=new ArrayList<>();
    
    Monoplaza monoplaza;
    
    
    
    public wsMonoplazaBean() {
    }

    public List<Monoplaza> getMonoplazas() {
        return monoplazas;
    }

    public void setMonoplazas(List<Monoplaza> monoplazas) {
        this.monoplazas = monoplazas;
    }

    public Monoplaza getMonoplaza() {
        return monoplaza;
    }

    public void setMonoplaza(Monoplaza monoplaza) {
        this.monoplaza = monoplaza;
    }
 
    
    
    
}
