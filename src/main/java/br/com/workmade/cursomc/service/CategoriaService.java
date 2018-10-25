package br.com.workmade.cursomc.service;

import br.com.workmade.cursomc.domain.Categoria;


public interface CategoriaService {

	public Categoria buscarPorId(Integer id);
	
	public Categoria salvar(Categoria categoria);
	
}
