package br.com.best2bee.demo.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.best2bee.demo.api.model.Livro;
import br.com.best2bee.demo.api.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
public class LivroResource {

	@Autowired
	private LivroRepository livroRepository;
	
	//Listar todos
	@GetMapping
	public List<Livro> listar(){
		return livroRepository.findAll();
	}
	
	//Listar por cod
	
	@GetMapping("/{isbn}")
	public ResponseEntity<Livro> buscarPeloCodigo(@PathVariable int isbn){
		Livro livro = livroRepository.findOne(isbn);
		
		if (livro != null) {
			return ResponseEntity.ok(livro);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
}
