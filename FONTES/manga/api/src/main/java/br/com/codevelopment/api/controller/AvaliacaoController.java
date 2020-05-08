package br.com.codevelopment.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.codevelopment.common.domain.entity.Avaliacao;
import br.com.codevelopment.common.service.contract.AvaliacaoService;

@RestController
@RequestMapping("api/v1/avaliacao")
public class AvaliacaoController {
	
	private AvaliacaoService service;
	
	@GetMapping
	public List<Avaliacao> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	public Avaliacao create(@RequestBody Avaliacao avaliacao) {
		return service.save(avaliacao);
	}
	
	@GetMapping("/{id}")
	public Avaliacao findbyId(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody Avaliacao avaliacao, @PathVariable Long id) {
		service.update(id, avaliacao);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
