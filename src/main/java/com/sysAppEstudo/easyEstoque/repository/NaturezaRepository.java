package com.sysAppEstudo.easyEstoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sysAppEstudo.easyEstoque.models.NaturezaModel;

@Repository
public interface NaturezaRepository  extends JpaRepository<NaturezaModel,Long>{}