package br.com.workmade.cursomc.service;

import java.util.List;

import br.com.workmade.cursomc.domain.Categoria;


public interface CategoriaService {

	public Categoria buscarPorId(Integer id);
	
	public Categoria salvar(Categoria categoria);
	
	public List<Categoria> salvarTodos(List<Categoria> categorias);
	
	public Categoria salvarUm(Categoria categoria);
	
}
