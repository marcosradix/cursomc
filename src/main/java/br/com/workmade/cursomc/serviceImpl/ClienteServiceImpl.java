package br.com.workmade.cursomc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workmade.cursomc.domain.Cliente;
import br.com.workmade.cursomc.repositories.ClienteRepository;
import br.com.workmade.cursomc.service.ClienteService;
@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Cliente salvarUm(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}
