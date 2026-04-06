package com.sysAppEstudo.easyEstoque.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "oper_estoque_model")
@Data()
public class OperacaoEstoqueModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Descrição do Operação de Estoque não pode ser em branco")
    private String descricao;

    @ManyToOne(cascade = CascadeType.MERGE)
    private ArmazemModel armazemModelEntrada;

    @ManyToOne(cascade = CascadeType.MERGE)
    private NaturezaModel naturezaSaida;
}