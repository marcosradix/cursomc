package br.com.workmade.cursomc;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.workmade.cursomc.domain.Categoria;
import br.com.workmade.cursomc.domain.Cidade;
import br.com.workmade.cursomc.domain.Cliente;
import br.com.workmade.cursomc.domain.Endereco;
import br.com.workmade.cursomc.domain.Estado;
import br.com.workmade.cursomc.domain.Pedido;
import br.com.workmade.cursomc.domain.Produto;
import br.com.workmade.cursomc.domain.enums.TipoCliente;
import br.com.workmade.cursomc.service.CategoriaService;
import br.com.workmade.cursomc.service.CidadeService;
import br.com.workmade.cursomc.service.ClienteService;
import br.com.workmade.cursomc.service.EnderecoService;
import br.com.workmade.cursomc.service.EstadoService;
import br.com.workmade.cursomc.service.ProdutoService;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}
	
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private CidadeService cidadeService;
	
	@Autowired
	private EstadoService estadoService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private EnderecoService enderecoService;


	@Override
	public void run(String... args) throws Exception {
			
		Categoria cat1 = new Categoria(null, "Infortrônica");
		Categoria cat2 = new Categoria(null, "Escritório");
		
	
		
		Produto p1 = new Produto(null, "Computador", new BigDecimal(2000.00));
		Produto p2 = new Produto(null, "Impressora", new BigDecimal(800.00));
		Produto p3 = new Produto(null, "Mouse", new BigDecimal(80.00));

		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaService.salvarTodos(Arrays.asList(cat1, cat2));
		produtoService.salvarProdutos(Arrays.asList(p1, p2, p3));
		
		Estado estado1 = new Estado(null, "Minas Gerais");
		Estado estado2 = new Estado(null, "São Paulo");
		
		Cidade cidade1 = new Cidade(null, "Uberlândia", estado1);
		Cidade cidade2 = new Cidade(null, "São Paulo", estado2);
		Cidade cidade3 = new Cidade(null, "Campinas", estado2);
		
		estado1.getCidades().addAll(Arrays.asList(cidade1));
		estado2.getCidades().addAll(Arrays.asList(cidade2, cidade3));
		

		estadoService.salvarTodos(Arrays.asList(estado1, estado2));
		cidadeService.salvarTodos(Arrays.asList(cidade1, cidade2, cidade3));

		Cliente cli1 = new Cliente(null, "Maria Silva", "maria.silva@gmail.com","36378912377",TipoCliente.PESSOA_FISICA);
		cli1.getTelefones().addAll(Arrays.asList("27363323","93838393"));
		Endereco e1 = new Endereco(null, "Rua flores", "300", "Apto 303", "Jardim", "38220834", cli1, cidade1);
		cli1.getEnderecos().addAll(Arrays.asList(e1));
		
		clienteService.salvarUm(cli1);
		enderecoService.salvarUm(e1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy : HH:mm");
		
		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"), cli1, e1);
		Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 14:32"), cli1, e1);
		

		
		
	}
	

}
