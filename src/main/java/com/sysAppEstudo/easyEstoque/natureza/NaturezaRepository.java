package com.sysAppEstudo.easyEstoque.natureza;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaturezaRepository  extends JpaRepository<NaturezaModel,Long>{}