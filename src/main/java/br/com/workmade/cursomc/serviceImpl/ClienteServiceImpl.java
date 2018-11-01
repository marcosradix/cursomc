package br.com.workmade.cursomc.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workmade.cursomc.domain.Cliente;
import br.com.workmade.cursomc.repositories.ClienteRepository;
import br.com.workmade.cursomc.service.ClienteService;
import br.com.workmade.cursomc.service.exceptions.ObjectNotFoundException;
@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Cliente salvarUm(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente buscarPorId(Integer id) throws ObjectNotFoundException {
		Optional<Cliente> cliente = clienteRepository.findById(id); 
		return cliente.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id : "+id+" : "+ Cliente.class.getName()));
	}

	@Override
	public List<Cliente> salvarTodos(List<Cliente> clientes) {
		return clienteRepository.saveAll(clientes);
	}

}
