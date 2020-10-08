package com.generation.loja.minhaLojadeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.loja.minhaLojadeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria>findAllByCategoriaIgnoreCase (String categoria);

}
