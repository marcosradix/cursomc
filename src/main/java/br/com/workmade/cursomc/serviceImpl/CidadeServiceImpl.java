package br.com.workmade.cursomc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workmade.cursomc.domain.Cidade;
import br.com.workmade.cursomc.service.CidadeService;
@Service
public class CidadeServiceImpl implements CidadeService {

	@Autowired
	private CidadeService cidadeService;
	
	
	@Override
	public Cidade salvar(Cidade cidade) {
		return cidadeService.salvar(cidade);
	}


	@Override
	public List<Cidade> salvarTodos(List<Cidade> cidades) {
		return cidadeService.salvarTodos(cidades);
	}

}
