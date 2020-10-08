package com.generation.loja.minhaLojadeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.loja.minhaLojadeGames.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}
