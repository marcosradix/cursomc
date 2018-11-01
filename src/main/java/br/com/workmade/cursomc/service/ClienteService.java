package br.com.workmade.cursomc.service;

import java.util.List;

import br.com.workmade.cursomc.domain.Cliente;
import br.com.workmade.cursomc.service.exceptions.ObjectNotFoundException;

public interface ClienteService {

	public Cliente salvarUm(Cliente cliente);
	
	public List<Cliente> salvarTodos(List<Cliente> clientes);
	
	public Cliente buscarPorId(Integer id) throws ObjectNotFoundException;
}
