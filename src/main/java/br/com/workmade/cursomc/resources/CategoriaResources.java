package br.com.workmade.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.workmade.cursomc.domain.Categoria;

@RestController
@RequestMapping(value={"/", "/cursomc"})
public class CategoriaResources {
	
	@RequestMapping(method=RequestMethod.GET, value="/categorias")
	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1, "Infomática");
		
		Categoria cat2 = new Categoria(2, "Escritório");
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		return lista;
	}
	

}
