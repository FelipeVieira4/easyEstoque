package com.sysAppEstudo.easyEstoque.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sysAppEstudo.easyEstoque.natureza.NaturezaRepository;
import com.sysAppEstudo.easyEstoque.produto.dto.ProdutoRequestDTO;
import com.sysAppEstudo.easyEstoque.produto.dto.ProdutoResponseDTO;

import jakarta.persistence.EntityNotFoundException;

import jakarta.transaction.Transactional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;
    @Autowired
    private NaturezaRepository naturezaRepository;

    @Autowired
    private ProdutoMapper produtoMapper;

    @Transactional
    public ProdutoResponseDTO salvar(ProdutoRequestDTO dados) {
        var natureza = naturezaRepository.findById(dados.idNatureza())
            .orElseThrow(() -> new EntityNotFoundException("Natureza não encontrada"));


        var produto = produtoMapper.toModel(dados,natureza);

        produto=repository.save(produto);

        return produtoMapper.toResponseDTO(produto);
    }
}
