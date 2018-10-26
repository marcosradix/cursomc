package br.com.workmade.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.workmade.cursomc.domain.Categoria;
import br.com.workmade.cursomc.service.CategoriaService;

@RestController
@RequestMapping(value={"/"})
public class CategoriaResources {
	
	@Autowired
	private CategoriaService categoriaService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String teste() {
		return "Testado.";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/categorias/{id}")
	public ResponseEntity<Categoria> find(@PathVariable Integer id) {
		Categoria categoria = categoriaService.buscarPorId(id);
		return ResponseEntity.ok().body(categoria);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/categorias")
	public ResponseEntity<List<Categoria>> saveAll(@RequestBody List<Categoria> categorias) {
		 categoriaService.salvarTodos(categorias);
		return ResponseEntity.ok().body(categorias);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/categoria")
	public ResponseEntity<Categoria> saveOne(@RequestBody Categoria categoria) {
		 categoriaService.salvarUm(categoria);
		return ResponseEntity.ok().body(categoria);
	}

}
