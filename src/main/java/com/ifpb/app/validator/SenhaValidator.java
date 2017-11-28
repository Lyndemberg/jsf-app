package com.ifpb.app.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validator.Senha")
public class SenhaValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String senha = value.toString();
        if(senha.trim().equals("")) throw new ValidatorException(new FacesMessage("A senha está vazia"));
    }
    
}
