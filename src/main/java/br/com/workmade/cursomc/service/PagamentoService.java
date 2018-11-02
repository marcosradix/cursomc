package br.com.workmade.cursomc.service;

import java.util.List;

import br.com.workmade.cursomc.domain.Pagamento;
import br.com.workmade.cursomc.service.exceptions.ObjectNotFoundException;



public interface PagamentoService {

	public Pagamento buscarPorId(Integer id) throws ObjectNotFoundException;
	
	public List<Pagamento> salvarTodos(List<Pagamento> pagamentos);
	
	public Pagamento salvarUm(Pagamento pagamento);
	
}
