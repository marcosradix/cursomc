package br.com.workmade.cursomc.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workmade.cursomc.domain.Categoria;
import br.com.workmade.cursomc.repositories.CategoriaRepository;
import br.com.workmade.cursomc.service.CategoriaService;
@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository; 
	
	
	@Override
	public Categoria buscarPorId(Integer id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id); 
		return categoria.orElse(null);
	}


	@Override
	public Categoria salvar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

}
