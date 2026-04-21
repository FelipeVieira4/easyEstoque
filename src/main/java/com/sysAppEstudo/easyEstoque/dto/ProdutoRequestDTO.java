package com.sysAppEstudo.easyEstoque.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoRequestDTO(
    @NotBlank(message = "Descrição do Produto não pode ser em branco")
    String descricao,

    @NotNull(message = "Natureza do Produto é obrigatório")
    Long idNatureza,  // Recebe apenas o ID da natureza

    @NotNull(message = "Preço Médio campo obrigatório")
    @Min(value = 0, message = "O preço não pode ser negativo")
    BigDecimal precoMedio
) {}