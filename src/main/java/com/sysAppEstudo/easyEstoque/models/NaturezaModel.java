package com.sysAppEstudo.easyEstoque.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/*

 @Author Felipe Vieira

*/

@Entity
@Table(name="natureza_table")
@Data
public class NaturezaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long natureza_id;

    @NotBlank(message = "Descrição da natureza de estoque Obrigátorio")
    private String descricao;

    @Column(nullable = false,columnDefinition = "boolean default true")
    private boolean ativo=true;
}