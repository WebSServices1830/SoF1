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
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import org.primefaces.model.UploadedFile;
import ws.Auth_Service;

import ws.Campeonato;
import ws.Gestor_Service;
import ws.Premio;
import ws.Usuario;

/**
 *
 * @author USUARIO
 */
@Named(value = "wsSessionBean")
@SessionScoped
public class wsSessionBean implements Serializable {
 @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Gestor/Gestor.wsdl")
    private Gestor_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Auth/Auth.wsdl")
    private Auth_Service service;
    
    
    static String IP="localhost";
    String filePath = "C:\\xampp\\htdocs\\images\\users\\";
    
    List<Campeonato> campeonatos;
    Campeonato campeonato;

    Premio premio;

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }
    
    
    
    public List<Campeonato> getCampeonatos() {
        campeonatos=findAllCampeonato();
        if(campeonatos.size()>0 && campeonato == null) campeonato=campeonatos.get(0);
        return campeonatos;
    }
     public void change(Campeonato c){
        campeonato=c;
    }

    public void setCampeonatos(List<Campeonato> campeonatos) {
        
        this.campeonatos = campeonatos;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
    

    /**
     * Creates a new instance of wsSessionBean
     */
    public wsSessionBean() {
    }
    private UploadedFile file;
    private boolean estado = false;
    private String usuario;
    private String clave;
    private Usuario usuarioSession = new Usuario();

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Usuario getUsuarioSession() {
        return usuarioSession;
    }

    public void setUsuarioSession(Usuario usuarioSession) {
        this.usuarioSession = usuarioSession;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String registro() throws IOException {
        usuarioSession.setRol("usuario");
        upload();
        registrarUsuario(usuarioSession);
        System.out.println("registro.");
        estado = true;
        return "index";
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean getEstadoSession() {
        return estado;
    }

    public boolean isAdmin() {
        boolean res = false;
        if (estado) {
            res = usuarioSession.getRol().equalsIgnoreCase("admin");
        }
        return res;
    }

    public String salir() {

        estado = !cerrarSesion(usuarioSession);
        if (!estado) {
            usuarioSession = new Usuario();
        }
        System.out.println("salir");
        return null;
    }

    public String login() {
        System.out.println("login " + usuario);
        Usuario u = iniciarSesion(usuario, clave);
        if (u.getIdUsuario() > -1) {
            estado = true;
            usuarioSession = u;
        }
        return null;
    }
    public String getIp(){
    return IP;
    }
    public void upload() throws IOException {
        //System.out.println("Name " + getName());
        //System.out.println("tmp directory" System.getProperty("java.io.tmpdir"));
        System.out.println("File Name " + file.getFileName());
        System.out.println("File New Name " + usuarioSession.getUsuario());
        System.out.println("Size " + file.getSize());
        byte[] bytes = null;

        if (null != file && file.getSize()>0) {
        usuarioSession.setImagen("http://"+IP+"/images/users/"+usuarioSession.getUsuario()+".jpg");
               
            copyFile(usuarioSession.getUsuario()+".jpg", file.getInputstream());
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

    private Boolean registrarUsuario(ws.Usuario usuario) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Auth port = service.getAuthPort();
        return port.registrarUsuario(usuario);
    }

    private Usuario iniciarSesion(java.lang.String usuario, java.lang.String contrasena) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Auth port = service.getAuthPort();
        return port.iniciarSesion(usuario, contrasena);
    }

    private Boolean cerrarSesion(ws.Usuario usuario) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Auth port = service.getAuthPort();
        return port.cerrarSesion(usuario);
    }

    private java.util.List<ws.Campeonato> findAllCampeonato() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service_1.getGestorPort();
        return port.findAllCampeonato();
    }

  
}
