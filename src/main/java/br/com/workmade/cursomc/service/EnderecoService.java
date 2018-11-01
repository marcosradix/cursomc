package br.com.workmade.cursomc.service;

import java.util.List;

import br.com.workmade.cursomc.domain.Endereco;
import br.com.workmade.cursomc.service.exceptions.ObjectNotFoundException;



public interface EnderecoService {

	public Endereco buscarPorId(Integer id) throws ObjectNotFoundException;
	
	public Endereco salvarUm(Endereco endereco);
	
	public List<Endereco> salvarTodos(List<Endereco> enderecos);
	
}
