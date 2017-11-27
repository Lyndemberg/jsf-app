package com.ifpb.app.web;
import com.ifpb.app.model.Integrante;
import com.ifpb.app.model.ServiceIntegrantes;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
/**
 *
 * @author lyndemberg
 */
@Named
@RequestScoped
public class ControladorIntegrante {
    private Integrante integrante = new Integrante();
    private ServiceIntegrantes service = new ServiceIntegrantes();
    
    public String salvar(){
        if(service.salvar(integrante)){
            return "listarIntegrantes.xhtml";
        }
        return null;
    }
    public String excluir(Integrante a){
        service.remover(a);
        return null;
    }
    public List<Integrante> listar(){
        return service.listarTodos();
    }
    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }
}
