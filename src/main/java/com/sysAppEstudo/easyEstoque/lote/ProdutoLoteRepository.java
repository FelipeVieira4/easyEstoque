package com.sysAppEstudo.easyEstoque.lote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoLoteRepository  extends JpaRepository<ProdutoLoteModel,Long>{}