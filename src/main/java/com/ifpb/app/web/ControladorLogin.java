package com.ifpb.app.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
/**
 *
 * @author lyndemberg
 */
@Named
@SessionScoped
public class ControladorLogin implements Serializable{
    private String usuario;
    private String senha;
    
    public String logar(){
        if(usuarioValido()){
            return "inicial.xhtml";
        }else{
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("senha", new FacesMessage("Usuario/senha não confere"));
        }
        return null;
    }

    private boolean usuarioValido() {
        return "jose".equalsIgnoreCase(usuario) && "123".equalsIgnoreCase(senha);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
