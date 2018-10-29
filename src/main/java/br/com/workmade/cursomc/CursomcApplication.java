package br.com.workmade.cursomc;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.workmade.cursomc.domain.Categoria;
import br.com.workmade.cursomc.domain.Produto;
import br.com.workmade.cursomc.repositories.CategoriaRepository;
import br.com.workmade.cursomc.repositories.CidadeRepository;
import br.com.workmade.cursomc.repositories.EstadoRepository;
import br.com.workmade.cursomc.repositories.ProdutoRepository;
import br.com.workmade.cursomc.service.ProdutoService;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private ProdutoService produtoService;

	@Override
	public void run(String... args) throws Exception {
/*		Categoria cat1 = new Categoria(null, "Infortrônica");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		
		
		Produto p1 = new Produto(null, "Computado", new BigDecimal(2000.00));
		Produto p2 = new Produto(null, "Impressora", new BigDecimal(800.00));
		Produto p3 = new Produto(null, "Mouse", new BigDecimal(80.00));
		produtoService.salvarProdutos(Arrays.asList(p1, p2, p3));*/
		
		/*
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));*/
		
/*		Estado estado1 = new Estado(null, "Minas Gerais");
		Estado estado2 = new Estado(null, "São Paulo");
		
		Cidade cidade1 = new Cidade(null, "Uberlândia", estado1);
		Cidade cidade2 = new Cidade(null, "São Paulo", estado2);
		Cidade cidade3 = new Cidade(null, "Campinas", estado2);
		
		estado1.getCidades().addAll(Arrays.asList(cidade1));
		estado2.getCidades().addAll(Arrays.asList(cidade2, cidade3));
		
		estadoRepository.saveAll(Arrays.asList(estado1, estado2));
		cidadeRepository.saveAll(Arrays.asList(cidade1, cidade2, cidade3));*/
		
	}
	

}
