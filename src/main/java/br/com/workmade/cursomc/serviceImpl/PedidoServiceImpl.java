package br.com.workmade.cursomc.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workmade.cursomc.domain.Pedido;
import br.com.workmade.cursomc.repositories.PedidoRepository;
import br.com.workmade.cursomc.service.PedidoService;
import br.com.workmade.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository; 
	
	
	@Override
	public Pedido buscarPorId(Integer id) throws ObjectNotFoundException {
		Optional<Pedido> categoria = pedidoRepository.findById(id); 
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id : "+id+" : "+ Pedido.class.getName()));
	}


	@Override
	public List<Pedido> salvarTodos(List<Pedido> pedidos) {
		return pedidoRepository.saveAll(pedidos);
	}


	@Override
	public Pedido salvarUm(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}



}
