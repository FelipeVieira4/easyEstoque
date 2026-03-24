package com.sysAppEstudo.easyEstoque.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

/*

 @Author Felipe Vieira

*/

@Entity
@Table(name="natureza_table")
public class NaturezaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Descrição da natureza de estoque Obrigátorio")
    private String descricao;

    @Column(nullable = false,columnDefinition = "boolean default true")
    private boolean ativo=true;

    public long getId() {
        return id;
    }
                      
    public void setId(long id) {
        this.id = id;
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