package br.com.workmade.cursomc.service;

import java.util.List;

import br.com.workmade.cursomc.domain.ItemPedido;

public interface ItemPedidoService {

public ItemPedido salvar(ItemPedido itemPedido);
	
	public List<ItemPedido> salvarTodos(List<ItemPedido> itensPedidos);
	
}
