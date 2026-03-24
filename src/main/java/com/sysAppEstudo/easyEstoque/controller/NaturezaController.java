package com.sysAppEstudo.easyEstoque.controller;

import java.net.http.HttpClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sysAppEstudo.easyEstoque.models.NaturezaModel;
import com.sysAppEstudo.easyEstoque.repository.NaturezaRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/natureza")
public class NaturezaController {
    @Autowired
    private NaturezaRepository naturezaRepository;

    @PostMapping
    public ResponseEntity<NaturezaModel> criarNatureza(@RequestBody @Valid NaturezaModel bodyNatureza){
        NaturezaModel naturezaCadastrada=naturezaRepository.save(bodyNatureza);

        return new ResponseEntity<>(naturezaCadastrada,HttpStatus.OK);
    }
}
