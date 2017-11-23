package com.ifpb.app.persistence;

import com.ifpb.app.model.Album;
import com.ifpb.app.model.Albuns;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 *
 * @author lyndemberg
 */
public class AlbunsEmMemoria implements Albuns{
    private static final List<Album> albuns = new CopyOnWriteArrayList<>();
    public AlbunsEmMemoria() {
    }
    
    @Override
    public boolean salvar(Album novo) {
        return albuns.add(novo);
    }

    @Override
    public boolean remove(Album a) {
        return albuns.remove(a);
    }

    @Override
    public List<Album> list() {
        return Collections.unmodifiableList(albuns);
    }
    
}
