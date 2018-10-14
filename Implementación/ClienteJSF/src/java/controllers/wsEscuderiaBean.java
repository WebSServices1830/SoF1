/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.xml.ws.WebServiceRef;
import ws.Campeonato;
import ws.Escuderia;
import ws.Gestor_Service;
import ws.Monoplaza;
import ws.Piloto;

/**
 *
 * @author USUARIO
 */
@Named(value = "wsEscuderiaBean")
@ManagedBean
public class wsEscuderiaBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Gestor/Gestor.wsdl")
    private Gestor_Service service;

    /**
     * Creates a new instance of wsEscuderiaBean
     */
    public wsEscuderiaBean() {
    }
    List<Escuderia> escuderias = new ArrayList<>();
    Escuderia escuderia=new Escuderia();
    List<Piloto> pilotos = new ArrayList<>();
    Piloto piloto = new Piloto();
    Piloto piloto2 = new Piloto();

    Monoplaza m1 = new Monoplaza();
    Monoplaza m2 = new Monoplaza();
    int mid2 ;//= new Monoplaza();
    int mid1 ;//= new Monoplaza();

    public int getMid1() {
        return mid1;
    }
   

    public void setMid1(int mid1) {
        this.mid1 = mid1;
    }

    public List<Escuderia> getEscuderias() {
        escuderias=findAllEscuderia();
        return escuderias;
    }

    public void setEscuderias(List<Escuderia> escuderias) {
        this.escuderias = escuderias;
    }

    public int getMid2() {
        return mid2;
    }

    public void setMid2(int mid2) {
        this.mid2 = mid2;
    }
    
    List<Monoplaza> monoplazas = new ArrayList<>();

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public Monoplaza getM1() {
        return m1;
    }

    public void setM1(Monoplaza m1) {
        this.m1 = m1;
    }

    public Monoplaza getM2() {
        return m2;
    }

    public void setM2(Monoplaza m2) {
        this.m2 = m2;
    }

    public List<Monoplaza> getMonoplazas() {
        monoplazas=findAllMonoplaza();
        return monoplazas;
    }

    public void setMonoplazas(List<Monoplaza> monoplazas) {
        this.monoplazas = monoplazas;
    }

    public Piloto getPiloto2() {
        return piloto2;
    }

    public void setPiloto2(Piloto piloto2) {
        this.piloto2 = piloto2;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public List<Piloto> getPilotos() {
        pilotos = findAllPiloto();
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public String save() {
        Monoplaza m1=findMonoplaza(mid1);
        Monoplaza m2=findMonoplaza(mid2);
        m1.setIdMonoplaza(mid1);
        m2.setIdMonoplaza(mid2);
        m1.setEscuderia(escuderia);
        m2.setEscuderia(escuderia);
        //escuderia.getMonoplazas().add(m1);
       // escuderia.getMonoplazas().add(m2);
        createEscuderia(escuderia);
        return null;
      //  return "listado";
    }

    private java.util.List<ws.Piloto> findAllPiloto() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findAllPiloto();
    }

    private java.util.List<ws.Monoplaza> findAllMonoplaza() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findAllMonoplaza();
    }

    private Monoplaza findMonoplaza(int idMonoplaza) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findMonoplaza(idMonoplaza);
    }

    private void createEscuderia(ws.Escuderia escuderia) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        port.createEscuderia(escuderia);
    }

    private void removeEscuderia(int escuderia) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        port.removeEscuderia(escuderia);
    }

    private java.util.List<ws.Escuderia> findAllEscuderia() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findAllEscuderia();
    }
    
    

}
