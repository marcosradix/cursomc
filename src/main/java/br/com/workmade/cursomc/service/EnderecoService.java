package br.com.workmade.cursomc.service;

import br.com.workmade.cursomc.domain.Endereco;
import br.com.workmade.cursomc.service.exceptions.ObjectNotFoundException;



public interface EnderecoService {

	public Endereco buscarPorId(Integer id) throws ObjectNotFoundException;
	
	public Endereco salvarUm(Endereco endereco);
	
}
