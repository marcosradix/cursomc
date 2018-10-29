package br.com.workmade.cursomc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workmade.cursomc.domain.Produto;
import br.com.workmade.cursomc.repositories.ProdutoRepository;
import br.com.workmade.cursomc.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public List<Produto> salvarProdutos(List<Produto> produtos) {
		return produtoRepository.saveAll(produtos);
	}

}
