package br.com.workmade.cursomc.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workmade.cursomc.domain.Pagamento;
import br.com.workmade.cursomc.repositories.PagamentoRepository;
import br.com.workmade.cursomc.service.PagamentoService;
import br.com.workmade.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class PagamentoServiceImpl implements PagamentoService {

	@Autowired
	private PagamentoRepository pagamentoRepository; 
	
	
	@Override
	public Pagamento buscarPorId(Integer id) throws ObjectNotFoundException {
		Optional<Pagamento> categoria = pagamentoRepository.findById(id); 
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id : "+id+" : "+ Pagamento.class.getName()));
	}


	@Override
	public List<Pagamento> salvarTodos(List<Pagamento> pagamentos) {
		return pagamentoRepository.saveAll(pagamentos);
	}


	@Override
	public Pagamento salvarUm(Pagamento pagamento) {
		return pagamentoRepository.save(pagamento);
	}

}
