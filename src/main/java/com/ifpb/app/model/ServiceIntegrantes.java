package com.ifpb.app.model;

import com.ifpb.app.persistence.IntegrantesEmMemoria;
import java.util.List;

/**
 *
 * @author lyndemberg
 */
public class ServiceIntegrantes {
    private final Integrantes dao = new IntegrantesEmMemoria();
    
    public boolean salvar(Integrante a){
        return dao.salvar(a);
    }
    public boolean remover(Integrante a){
        return dao.remove(a);
    }
    public List<Integrante> listarTodos(){
        return dao.getAll();
    }
    
    
}
