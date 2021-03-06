package br.com.workmade.cursomc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workmade.cursomc.domain.Endereco;
import br.com.workmade.cursomc.repositories.EnderecoRepository;
import br.com.workmade.cursomc.service.EnderecoService;
import br.com.workmade.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class EnderecoServiceImpl implements EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Override
	public Endereco buscarPorId(Integer id) throws ObjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Endereco salvarUm(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

	@Override
	public List<Endereco> salvarTodos(List<Endereco> enderecos) {
		return enderecoRepository.saveAll(enderecos);
	}



}
