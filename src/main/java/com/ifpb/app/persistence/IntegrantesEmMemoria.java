package com.ifpb.app.persistence;

import com.ifpb.app.model.Integrante;
import com.ifpb.app.model.Integrantes;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author lyndemberg
 */
public class IntegrantesEmMemoria implements Integrantes{
    private static final List<Integrante> integrantes = new CopyOnWriteArrayList<>();
    @Override
    public boolean salvar(Integrante a) {
        return integrantes.add(a);
    }

    @Override
    public boolean remove(Integrante a) {
        return integrantes.remove(a);
    }

    @Override
    public List<Integrante> getAll() {
        return Collections.unmodifiableList(integrantes);
    }
    
}
