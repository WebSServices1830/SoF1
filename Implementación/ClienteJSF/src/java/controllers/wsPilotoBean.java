/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;
import org.primefaces.model.UploadedFile;
import ws.Campeonato;
import ws.Gestor_Service;
import ws.Pais;
import ws.Piloto;
//import ws.gestor.Gestor_Service;

/**
 *
 * @author USUARIO
 */
@Named(value = "wsPilotoBean")
@ManagedBean
public class wsPilotoBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Gestor/Gestor.wsdl")
    private Gestor_Service service;

    @ManagedProperty(value = "#{wsSessionBean.campeonato}")
    private Campeonato c;
    
    
    public Campeonato getC() {
        return c;
    }

    public void setC(Campeonato c) {
        this.c = c;
    }
    
    
    
    String filePath = "C:\\xampp\\htdocs\\images\\pilots\\";

    float m;
    

    public float getM() {
        return m;
    }

    public void setM(float m) {
        this.m = m;
    }


    /**
     * Creates a new instance of wsPilotoBean
     */
    List<Piloto> pilotos = new ArrayList<>();
    Piloto piloto = new Piloto();
    private Date fecha;
    
    int idpais;
    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }
    
     List<Pais> paises=new ArrayList<>();

    public List<Pais> getPaises() {
        paises=findAllPais();
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }
     
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Piloto getPiloto() {
        
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public List<Piloto> getPilotos() {
      pilotos=findAllPilotoByCampeonato(c.getIdCampeonato());
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public wsPilotoBean() {
    }

    public String save() throws IOException {
        piloto.setCampeonato(c);
        piloto.setPais(findPais(idpais));
        upload();
        System.out.println("" + piloto.getNombre()+" "+piloto);
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(fecha);
        try {
            piloto.setFechaNacimiento(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
        } catch (DatatypeConfigurationException ex) {
        }
      
       createPiloto(piloto);
       
        System.out.println("save");
        return "listado";
    }
    


    public void delete(int id) {
        removePiloto(id);
        System.out.println("borrando " + id);

    }

    public String editar(int id) throws IOException {
           piloto= findPiloto(id);
           idpais=piloto.getPais().getIdPais();
           fecha=getDate(piloto.getFechaNacimiento());
     
           return "editar";

    }

    public String edit() throws IOException {
        piloto.setCampeonato(c);
        piloto.setPais(findPais(idpais));
        upload();
           GregorianCalendar c = new GregorianCalendar();
        c.setTime(fecha);
        try {
            piloto.setFechaNacimiento(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
        } catch (DatatypeConfigurationException ex) {
        }
     
        editPiloto(piloto);
        return "listado";

    }

    private UploadedFile file;

    public Date getDate(XMLGregorianCalendar xmlgc){
        if(xmlgc== null) return null;
        return xmlgc.toGregorianCalendar().getTime();
    }
    
    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public void upload() throws IOException {
        //System.out.println("Name " + getName());
        //System.out.println("tmp directory" System.getProperty("java.io.tmpdir"));
        byte[] bytes = null;

        if (null != file && file.getSize()>0) {
         piloto.setImagen("http://"+wsSessionBean.IP + "/images/pilots/" + piloto.getNumero()+ ".jpg");

        System.out.println("File Name " + file.getFileName());
        System.out.println("File New Name " + piloto.getNumero());
        System.out.println("Size " + file.getSize());
            copyFile(piloto.getNumero() + ".jpg", file.getInputstream());
            FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }

    public void copyFile(String fileName, InputStream in) {
        try {

            // write the inputStream to a FileOutputStream
            OutputStream out = new FileOutputStream(new File(filePath + fileName));

            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }

            in.close();
            out.flush();
            out.close();

            System.out.println("New file created!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void createPiloto(ws.Piloto piloto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        port.createPiloto(piloto);
    }

    private java.util.List<ws.Piloto> findAllPiloto() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findAllPiloto();
    }

    private void editPiloto(ws.Piloto piloto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        port.editPiloto(piloto);
    }
        private Piloto editPiloto(int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findPiloto(id);
    }

    private Piloto findPiloto(int idPiloto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findPiloto(idPiloto);
    }

    private java.util.List<ws.Piloto> findAllPilotoByCampeonato(int arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.obtenerPilotosByCampeonato(arg0);
    }

    private java.util.List<ws.Pais> findAllPais() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findAllPais();
    }

    private Pais findPais(int idPais) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findPais(idPais);
    }

    private void removePiloto(int piloto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        port.removePiloto(piloto);
    }
    

    

    
    
}
