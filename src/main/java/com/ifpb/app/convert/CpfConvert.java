package com.ifpb.app.convert;
import com.ifpb.app.model.Cpf;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
/**
 *
 * @author lyndemberg
 */
@FacesConverter(value="convert.Cpf", forClass = Cpf.class)
public class CpfConvert implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if(value == null) return new Cpf("");
        return new Cpf(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value == null) return "";
        Cpf cpf = (Cpf) value;
        return cpf.getValor();
    }
    
}
