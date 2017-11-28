package com.ifpb.app.model;
import java.time.LocalDate;
import java.util.Objects;
/**
 *
 * @author lyndemberg
 */
public class Album {
    private String descricao;
    private LocalDate lancamento;
    private Integrante integrante = new Integrante();

    public Album() {
    }

    public Album(String descricao, LocalDate lancamento) {
        this.descricao = descricao;
        this.lancamento = lancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.descricao);
        hash = 29 * hash + Objects.hashCode(this.lancamento);
        hash = 29 * hash + Objects.hashCode(this.integrante);
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
        final Album other = (Album) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.lancamento, other.lancamento)) {
            return false;
        }
        if (!Objects.equals(this.integrante, other.integrante)) {
            return false;
        }
        return true;
    }

    
    
}
