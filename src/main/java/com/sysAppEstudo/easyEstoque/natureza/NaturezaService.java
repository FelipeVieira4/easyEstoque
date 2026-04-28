package com.sysAppEstudo.easyEstoque.natureza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sysAppEstudo.easyEstoque.natureza.dto.NaturezaRequestDTO;
import com.sysAppEstudo.easyEstoque.natureza.dto.NaturezaResponseDTO;

import jakarta.transaction.Transactional;

@Service
public class NaturezaService {
	
    @Autowired
    private NaturezaRepository repository;

    @Autowired
    private NaturezaMapper naturezaMapper;

    @Transactional
    public NaturezaResponseDTO salvar(NaturezaRequestDTO naturezaDto) {
        var natureza = naturezaMapper.toModel(naturezaDto);

        natureza=repository.save(natureza);
        return naturezaMapper.toResponseDTO(natureza);
    }
    
    @Transactional
    public NaturezaResponseDTO alterar(NaturezaRequestDTO naturezaDto) {
        var natureza = naturezaMapper.toModel(naturezaDto);

        if (natureza.getIdNatureza()==null){
        	throw new RuntimeException();
        }
        
        natureza=repository.save(natureza);
        return naturezaMapper.toResponseDTO(natureza);
    }
}
