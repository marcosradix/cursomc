package br.com.workmade.cursomc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workmade.cursomc.domain.Estado;
import br.com.workmade.cursomc.service.EstadoService;
@Service
public class EstadoServiceImpl implements EstadoService {
	
	
	@Autowired
	private EstadoService estadoService;

	@Override
	public Estado salvar(Estado estado) {
		return estadoService.salvar(estado);
	}

	@Override
	public List<Estado> salvarTodos(List<Estado> estados) {
		return estadoService.salvarTodos(estados);
	}

}
