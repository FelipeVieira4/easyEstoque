package com.sysAppEstudo.easyEstoque.lote;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import com.sysAppEstudo.easyEstoque.produto.ProdutoModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/*
    @Author: Felipe Vieira
*/

@Entity
@Table(name = "produto_lote")
public class ProdutoLoteModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLote;

    @NotNull(message = "Produto é obrigatório")
    @OneToOne
    @JoinColumn(name = "idProduto")
    private ProdutoModel produto;

    @NotNull(message = "Quantidade campo obrigatório")
    @Min(value = 0, message = "Quantidade do produto não pode ser negativo")
    private BigDecimal qtdProduto;

    @NotNull(message = "Data de Fabricação obrigatório!")
    private Date dataFabricacao;

    @NotNull(message = "Data de Validade obrigatório!")
    private Date dataValidade;

    private Date dataEntrada;

    public Long getIdLote() {
        return idLote;
    }

    public void setIdLote(Long idLote) {
        this.idLote = idLote;
    }

    public BigDecimal getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(BigDecimal qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    
    
}
