package br.com.workmade.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.workmade.cursomc.domain.Pedido;
import br.com.workmade.cursomc.service.PedidoService;

@RestController
@RequestMapping(value={"/"})
@CrossOrigin(origins = "*")
public class PedidoResources {


	@Autowired
	private PedidoService pedidoService;
	
	@RequestMapping(method=RequestMethod.GET, value="/pedidos/{id}")
	public ResponseEntity<Pedido> find(@PathVariable Integer id) {
		Pedido pedido = pedidoService.buscarPorId(id);
		return ResponseEntity.ok().body(pedido);
	}
}
