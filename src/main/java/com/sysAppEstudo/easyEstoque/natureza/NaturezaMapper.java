package com.sysAppEstudo.easyEstoque.natureza;

import org.springframework.stereotype.Component;

import com.sysAppEstudo.easyEstoque.natureza.dto.NaturezaRequestDTO;
import com.sysAppEstudo.easyEstoque.natureza.dto.NaturezaResponseDTO;


@Component
public class NaturezaMapper {

    public NaturezaModel toModel(NaturezaRequestDTO naturezaDto) {
        NaturezaModel natureza = new NaturezaModel();
        natureza.setIdNatureza(naturezaDto.idNatureza());
        natureza.setDescricao(naturezaDto.descricao());
        natureza.setAtivo(naturezaDto.ativo());
        return natureza;
    }

    public NaturezaResponseDTO toResponseDTO(NaturezaModel natureza) {
        return new NaturezaResponseDTO(
        	natureza.getIdNatureza(),
        	natureza.getDescricao(),
        	natureza.isAtivo()
        );
    }
}