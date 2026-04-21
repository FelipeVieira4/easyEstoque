package com.sysAppEstudo.easyEstoque.dto;

public record ErroResponseDTO(
    int status,
    String descricaoError,
    String mensagemError,
    String pathUrl
){}