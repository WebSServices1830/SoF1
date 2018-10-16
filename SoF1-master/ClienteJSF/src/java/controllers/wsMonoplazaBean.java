/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import ws.Monoplaza;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.xml.ws.WebServiceRef;
import org.primefaces.model.UploadedFile;
import ws.Gestor_Service;

/**
 *
 * @author sala a
 */
@Named(value = "wsMonoplazaBean")
@ManagedBean
public class wsMonoplazaBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Gestor/Gestor.wsdl")
    private Gestor_Service service;
  String filePath = "C:\\xampp\\htdocs\\images\\cars\\";
    /**
     * Creates a new instance of wsMonoplazaBean
     */
    private List<Monoplaza> monoplazas=new ArrayList<>();
    
    Monoplaza monoplaza=new Monoplaza();
    
    
    
     private UploadedFile file;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }
    
    public wsMonoplazaBean() {
    }

    public String save() throws IOException{
        upload();
         monoplaza.setImagen("http://"+wsSessionBean.IP + "/images/cars/" + monoplaza.getMarca()+ ".jpg");
         createMonoplaza(monoplaza);
        return "listado";//endava   12 de actubre 8 am
    } 
    public String delete(int id){
        removeMonoplaza(id);
        return null;
    }
        public String editarView(int id) throws IOException {
            monoplaza=findMonoplaza(id);
        return "edit";

    }

    
    public List<Monoplaza> getMonoplazas() {
        monoplazas=findAllMonoplaza();
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
 
    public String edit() throws IOException{
        System.out.println("editando "+monoplaza.getIdMonoplaza());
        editMonoplaza(monoplaza);
        upload();
    return "listado";
    }
public void upload() throws IOException {
        //System.out.println("Name " + getName());
        //System.out.println("tmp directory" System.getProperty("java.io.tmpdir"));
        byte[] bytes = null;
                System.out.println("Size " + file.getSize());

        
        if (null != file && file.getSize() >0) {
            copyFile(monoplaza.getMarca()+".jpg", file.getInputstream());
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

    private java.util.List<ws.Monoplaza> findAllMonoplaza() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findAllMonoplaza();
    }

    private void createMonoplaza(ws.Monoplaza monoplaza) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        port.createMonoplaza(monoplaza);
    }

    private void removeMonoplaza(int monoplaza) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        port.removeMonoplaza(monoplaza);
    }

    private void editMonoplaza(ws.Monoplaza monoplaza) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        port.editMonoplaza(monoplaza);
    }

    private Monoplaza findMonoplaza(int idMonoplaza) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findMonoplaza(idMonoplaza);
    }
    
    
}
