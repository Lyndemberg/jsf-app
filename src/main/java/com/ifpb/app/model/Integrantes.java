package com.ifpb.app.model;

import java.util.List;

/**
 *
 * @author lyndemberg
 */
public interface Integrantes {
    boolean salvar(Integrante a);
    boolean remove(Integrante a);
    Integrante read(String nome);
    List<Integrante> getAll();
}
