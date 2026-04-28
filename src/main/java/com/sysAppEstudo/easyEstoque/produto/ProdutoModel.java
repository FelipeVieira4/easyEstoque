package com.sysAppEstudo.easyEstoque.produto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.sysAppEstudo.easyEstoque.natureza.NaturezaModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * Model que representa a entidade Produto no sistema.
 * <p>
 * Mapeada para a tabela {@code produtos} no banco de dados.
 * Utilizada para o cadastro de Produto.
 * </p>
 *
 * @author Felipe Vieira
 */

@Entity
@Table(name = "produtos")
public class ProdutoModel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;

    @NotBlank(message = "Descrição do Produto não pode ser em branco")
    private String descricao;

    @NotNull(message = "Natureza do Produto é obrigatório")
    @ManyToOne
    @JoinColumn(name = "idNatureza")
    private NaturezaModel natureza;

    @NotNull(message = "Preço Médio campo obrigatório")
    @Min(value = 0, message = "O preço não pode ser negativo")
    private BigDecimal precoMedio;

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public NaturezaModel getNatureza() {
        return natureza;
    }

    public void setNatureza(NaturezaModel natureza) {
        this.natureza = natureza;
    }

    public BigDecimal getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(BigDecimal precoMedio) {
        this.precoMedio = precoMedio;
    }
    
}
