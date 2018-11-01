package br.com.workmade.cursomc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workmade.cursomc.domain.Endereco;
import br.com.workmade.cursomc.service.EnderecoService;
import br.com.workmade.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class EnderecoServiceImpl implements EnderecoService {

	@Autowired
	private EnderecoService enderecoService;
	
	@Override
	public Endereco buscarPorId(Integer id) throws ObjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Endereco salvarUm(Endereco endereco) {
		return enderecoService.salvarUm(endereco);
	}



}
