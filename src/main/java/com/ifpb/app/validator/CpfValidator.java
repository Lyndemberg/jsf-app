
package com.ifpb.app.validator;

import com.ifpb.app.model.Cpf;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validator.Cpf")
public class CpfValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        Cpf cpf = (Cpf) value;
        if(!cpf.isValid()) throw new ValidatorException(new FacesMessage("Cpf inválido, deve ter 11 dígitos"));
    }
    
}
