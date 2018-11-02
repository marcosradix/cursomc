package br.com.workmade.cursomc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.workmade.cursomc.domain.ItemPedido;
import br.com.workmade.cursomc.repositories.ItemPedidoRepository;
import br.com.workmade.cursomc.service.ItemPedidoService;

public class ItemPedidoImpl implements ItemPedidoService {

	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	@Override
	public ItemPedido salvar(ItemPedido itemPedido) {
		return itemPedidoRepository.save(itemPedido);
	}

	@Override
	public List<ItemPedido> salvarTodos(List<ItemPedido> itensPedidos) {
		return itemPedidoRepository.saveAll(itensPedidos);
	}

}
