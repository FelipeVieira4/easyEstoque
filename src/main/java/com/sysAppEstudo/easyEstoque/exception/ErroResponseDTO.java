package com.sysAppEstudo.easyEstoque.exception;

public record ErroResponseDTO(
    int status,
    String descricaoError,
    String mensagemError,
    String pathUrl
){}