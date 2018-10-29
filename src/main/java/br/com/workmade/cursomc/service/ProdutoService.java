package br.com.workmade.cursomc.service;

import java.util.List;

import br.com.workmade.cursomc.domain.Produto;

public interface ProdutoService {

	public List<Produto> salvarProdutos(List<Produto> produtos);
}
