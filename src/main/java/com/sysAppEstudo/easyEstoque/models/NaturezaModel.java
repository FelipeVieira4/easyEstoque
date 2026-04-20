package com.sysAppEstudo.easyEstoque.models;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

/*

 @Author Felipe Vieira

*/

@Entity
@Table(name="natureza")
public class NaturezaModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNatureza;

    @NotBlank(message = "Descrição da Natureza de estoque obrigatório")
    private String descricao;

    @Column(nullable = false,columnDefinition = "boolean default true")
    private boolean ativo=true;

    public Long getIdNatureza() {
        return idNatureza;
    }

    public void setIdNatureza(Long idNatureza) {
        this.idNatureza = idNatureza;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}