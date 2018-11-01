package br.com.workmade.cursomc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workmade.cursomc.domain.Cidade;
import br.com.workmade.cursomc.repositories.CidadeRepository;
import br.com.workmade.cursomc.service.CidadeService;
@Service
public class CidadeServiceImpl implements CidadeService {

	@Autowired
	private CidadeRepository cidaderepository;
	
	
	@Override
	public Cidade salvar(Cidade cidade) {
		return cidaderepository.save(cidade);
	}


	@Override
	public List<Cidade> salvarTodos(List<Cidade> cidades) {
		return cidaderepository.saveAll(cidades);
	}

}
