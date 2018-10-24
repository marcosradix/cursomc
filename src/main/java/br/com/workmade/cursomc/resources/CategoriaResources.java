package br.com.workmade.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/", "/cursomc"})
public class CategoriaResources {
	
	@RequestMapping(method=RequestMethod.GET, value="/categorias")
	public String listar() {
		return "REST está funcionando!";
	}
	

}
