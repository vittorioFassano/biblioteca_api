package org.serratec.backend.bibliotecavittorio.controller;

import java.util.List;

import java.util.Optional;

import org.serratec.backend.bibliotecavittorio.model.Livro;
import org.serratec.backend.bibliotecavittorio.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/livros")
public class LivroController {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@GetMapping
	public ResponseEntity<List<Livro>> listar() {
		return ResponseEntity.ok(livroRepository.findAll());
	}
	
	 @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public ResponseEntity<Livro> cadastrar(@Valid @RequestBody Livro livro) {
	        Livro novoLivro = livroRepository.save(livro);
	        return ResponseEntity.status(HttpStatus.CREATED).body(novoLivro);
	    }
	

}
