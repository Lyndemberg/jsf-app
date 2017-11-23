package com.ifpb.app.web;

import com.ifpb.app.model.Album;
import com.ifpb.app.model.ServiceAlbuns;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author lyndemberg
 */

@Named
@RequestScoped
public class ControladorAlbum {
    private Album album = new Album();
    private ServiceAlbuns service = new ServiceAlbuns();
    public String salvar(){
        if(service.salvar(album)){
            return "listar.xhtml";
        }
        return null;
    }
    public String excluir(Album a){
        service.remove(a);
        return null;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
    public List<Album> todosAlbuns(){
        return service.listarTodos();
    }
    
}
