package br.com.workmade.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.workmade.cursomc.domain.Cliente;
import br.com.workmade.cursomc.service.ClienteService;

@RestController
@RequestMapping(value={"/"})
@CrossOrigin(origins = "*")
public class ClienteResources {
	
	@Autowired
	private ClienteService clienteService;

	
	@RequestMapping(method=RequestMethod.GET, value="/clientes/{id}")
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		Cliente cliente = clienteService.buscarPorId(id);
		return ResponseEntity.ok().body(cliente);
	}
	


}
