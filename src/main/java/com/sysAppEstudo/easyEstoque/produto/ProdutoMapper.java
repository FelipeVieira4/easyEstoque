package com.sysAppEstudo.easyEstoque.produto;

import org.springframework.stereotype.Component;

import com.sysAppEstudo.easyEstoque.natureza.NaturezaModel;
import com.sysAppEstudo.easyEstoque.produto.dto.ProdutoRequestDTO;
import com.sysAppEstudo.easyEstoque.produto.dto.ProdutoResponseDTO;

@Component
public class ProdutoMapper {

    public ProdutoModel toModel(ProdutoRequestDTO produtoDto, NaturezaModel natureza) {
        ProdutoModel produto = new ProdutoModel();
        produto.setDescricao(produtoDto.descricao());
        produto.setNatureza(natureza);
        produto.setPrecoMedio(produtoDto.precoMedio());
        return produto;
    }

    public ProdutoResponseDTO toResponseDTO(ProdutoModel produto) {
        return new ProdutoResponseDTO(
            produto.getIdProduto(),
            produto.getDescricao(),
            produto.getNatureza().getIdNatureza(),
            produto.getNatureza().getDescricao(),
            produto.getPrecoMedio()
        );
    }
}