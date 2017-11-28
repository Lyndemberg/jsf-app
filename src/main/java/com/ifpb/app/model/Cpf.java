package com.ifpb.app.model;

import java.util.Objects;

/**
 *
 * @author lyndemberg
 */
public class Cpf {
    private String valor;

    public Cpf(){
        this.valor = null;
    }
    public Cpf(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.valor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cpf other = (Cpf) obj;
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        return true;
    }

    public boolean isValid(){
        return valor.length() == 11;
    }
    public String formatted() {
        if (notNullOrEmpty()) {
            return toFormat();
        }
        return this.valor;
    }
    private boolean notNullOrEmpty() {
        return this.valor != null && this.valor.length() == 11;
    }

    private String toFormat() {
        return this.valor.substring(0, 3) + "."
                + this.valor.substring(3, 6) + "."
                + this.valor.substring(6, 9) + "-"
                + this.valor.substring(9, 11);
    }

   
    
    
}
