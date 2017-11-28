package com.ifpb.app.convert;

import com.ifpb.app.model.Integrante;
import com.ifpb.app.model.Integrantes;
import com.ifpb.app.persistence.IntegrantesEmMemoria;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value="convert.Integrante",forClass = Integrante.class)
public class IntegranteConvert implements Converter{

    private final Integrantes integrantes = new IntegrantesEmMemoria();
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if(value == null) return null;
        return integrantes.read(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value == null) return null;
        Integrante i = (Integrante) value;
        return i.getNome();
    }
    
}
