package com.ifpb.app.model;
import com.ifpb.app.persistence.AlbunsEmMemoria;
import java.util.List;
/**
 *
 * @author lyndemberg
 */
public class ServiceAlbuns {
    private final Albuns dao = new AlbunsEmMemoria();
    
    public boolean salvar(Album a){
        if(NaoehValido(a)){
            return false;
        }
        return dao.salvar(a);
    }
    private static boolean NaoehValido(Album a){
        return a.getLancamento()==null || a.getLancamento().equals("");
    }
    public List<Album> listarTodos(){
        return dao.list();
    }
    public boolean remove(Album a){
        return dao.remove(a);
    }
}
