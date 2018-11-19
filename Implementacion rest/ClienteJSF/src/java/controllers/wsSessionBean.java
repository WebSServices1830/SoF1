/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Campeonato;
import entities.Premio;
import entities.Usuario;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.ws.rs.core.GenericType;
import javax.xml.ws.WebServiceRef;
import org.primefaces.model.UploadedFile;
import ws.AutenticacionRestClient;
import ws.CampeonatoRestClient;

/**
 *
 * @author USUARIO
 */
@Named(value = "wsSessionBean")
@SessionScoped
public class wsSessionBean implements Serializable {
    
    
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
        
        CampeonatoRestClient ccl=new CampeonatoRestClient();
        campeonatos=ccl.obtenerCampeonatos(new GenericType<List<Campeonato>>() {});
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
    public String View() {
        return "editar";
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
        
        acl.registrarUsuario(usuarioSession, String.class);
        estado = true;
        
        return "index";
    }

    public String save() throws IOException {
        if(usuarioSession.getContrasena().isEmpty()){
        usuarioSession.setContrasena(clave);
        }
        upload();
        
        acl.editarUsuario(usuarioSession, String.class);
        estado = true;
        
        return "ver";
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
        //String  res=acl.cerrarSesion(String.class, usuarioSession.getIdUsuario()+"");
        String  res="true";
        estado = ! Boolean.valueOf(res);
        if (!estado) {
          usuario="";
            usuarioSession = new Usuario();
        }
        return null;
    }
    private AutenticacionRestClient acl=new AutenticacionRestClient();
        
    public String login() {
        System.out.println("login " + usuario);
        Usuario u= null;
        
        u=acl.iniciarSesion(Usuario.class, usuario, clave);
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

  
}
