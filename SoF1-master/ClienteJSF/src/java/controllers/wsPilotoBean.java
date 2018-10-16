/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import static controllers.wsSessionBean.IP;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.WebServiceRef;
import org.primefaces.model.UploadedFile;
import ws.Campeonato;
import ws.Gestor_Service;
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
    
    String filePath = "C:\\xampp\\htdocs\\images\\pilots\\";

    public Campeonato getC() {
        return c;
    }

    public void setC(Campeonato c) {
        this.c = c;
    }

    /**
     * Creates a new instance of wsPilotoBean
     */
    List<Piloto> pilotos = new ArrayList<>();
    Piloto piloto = new Piloto();
    private Date fecha;

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
      pilotos=findAllPilotoByEscuderia(c.getIdCampeonato());
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public wsPilotoBean() {
    }

    public String save() throws IOException {
        piloto.setCampeonato(c);
        System.out.println("estableciendo el campeontato ");
        upload();
        System.out.println("" + piloto.getNombre());
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(fecha);
        try {
            piloto.setFechaNacimiento(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
        } catch (DatatypeConfigurationException ex) {
        }
        piloto.setImagen("http://"+wsSessionBean.IP + "/images/pilots/" + piloto.getNumero()+ ".jpg");

       createPiloto(piloto);

        System.out.println("save");
        return "listado";
    }


    public void delete(int id) {
        System.out.println("borrando " + id);

    }

    public String editar(int id) throws IOException {
           piloto= findPiloto(id);
        System.out.println("find piloto tal " + piloto.getNombre());
        return "editar";

    }

    public String edit() throws IOException {
        upload();
         editPiloto(piloto);
        System.out.println("eduado " + piloto.getNombre());
        return "listado";

    }

    private UploadedFile file;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public void upload() throws IOException {
        //System.out.println("Name " + getName());
        //System.out.println("tmp directory" System.getProperty("java.io.tmpdir"));
        System.out.println("File Name " + file.getFileName());
        System.out.println("File New Name " + piloto.getNumero());
        System.out.println("Size " + file.getSize());
        byte[] bytes = null;

        if (null != file && file.getSize()>0) {
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

    private java.util.List<ws.Piloto> findAllPilotoByEscuderia(int arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findAllPilotoByEscuderia(arg0);
    }
    

    

    
    
}
