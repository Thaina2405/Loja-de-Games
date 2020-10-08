package com.generation.loja.minhaLojadeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.loja.minhaLojadeGames.model.Produto;

//
public interface produtoRespository extends JpaRepository<Produto, Long> {
	
	
	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);

}
