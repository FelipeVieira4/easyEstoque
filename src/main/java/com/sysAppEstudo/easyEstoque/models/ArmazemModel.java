package com.sysAppEstudo.easyEstoque.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "armazem_table")
@Data()
public class ArmazemModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Descrição do armazém não pode ser em branco")
    private String descricao;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(
    name="natureza_id",
    referencedColumnName = "id",
    nullable = true
    )
    private NaturezaModel natureza;

    private String endereco;
}
