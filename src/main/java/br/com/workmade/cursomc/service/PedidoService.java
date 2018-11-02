package br.com.workmade.cursomc.service;

import java.util.List;

import br.com.workmade.cursomc.domain.Pedido;
import br.com.workmade.cursomc.service.exceptions.ObjectNotFoundException;



public interface PedidoService {

	public Pedido buscarPorId(Integer id) throws ObjectNotFoundException;
	
	public List<Pedido> salvarTodos(List<Pedido> pedidos);
	
	public Pedido salvarUm(Pedido pedido);
	
}
