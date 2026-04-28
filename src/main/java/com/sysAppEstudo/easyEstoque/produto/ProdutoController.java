package com.sysAppEstudo.easyEstoque.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sysAppEstudo.easyEstoque.produto.dto.ProdutoRequestDTO;
import com.sysAppEstudo.easyEstoque.produto.dto.ProdutoResponseDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoResponseDTO> criarProduto(@RequestBody @Valid ProdutoRequestDTO produtoDTO){
        var produtoSalvo = produtoService.salvar(produtoDTO); 
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);
    }
}
