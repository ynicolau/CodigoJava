package com.lojagamer.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lojagamer.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long>{
	  public List <Produto> findAllByProdutoContainingIgnoreCase(@Param("produto")String produto);
	  public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
	  
	  
  }
  