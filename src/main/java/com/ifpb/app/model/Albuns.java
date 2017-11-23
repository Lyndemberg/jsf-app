
package com.ifpb.app.model;

import java.util.List;

public interface Albuns {
    boolean salvar(Album novo);
    boolean remove(Album a);
    List<Album> list();
}
