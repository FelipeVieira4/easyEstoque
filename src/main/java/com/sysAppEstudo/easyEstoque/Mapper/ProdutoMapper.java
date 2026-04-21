package com.sysAppEstudo.easyEstoque.Mapper;

import org.springframework.stereotype.Component;

import com.sysAppEstudo.easyEstoque.dto.ProdutoRequestDTO;
import com.sysAppEstudo.easyEstoque.dto.ProdutoResponseDTO;
import com.sysAppEstudo.easyEstoque.models.NaturezaModel;
import com.sysAppEstudo.easyEstoque.models.ProdutoModel;

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