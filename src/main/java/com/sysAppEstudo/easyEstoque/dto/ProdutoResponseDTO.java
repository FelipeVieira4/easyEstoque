package com.sysAppEstudo.easyEstoque.dto;

import java.math.BigDecimal;

public record ProdutoResponseDTO(
    Long idProduto,
    String descricao,
    Long idNatureza,
    String naturezaDescricao,  // Retorna a descrição, não o objeto inteiro
    BigDecimal precoMedio
) {}