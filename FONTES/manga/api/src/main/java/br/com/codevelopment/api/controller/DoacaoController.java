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

import br.com.codevelopment.common.domain.entity.Doacao;
import br.com.codevelopment.common.service.contract.DoacaoService;

@RestController
@RequestMapping("api/v1/doacao")
public class DoacaoController {
	private DoacaoService service;
	
	@GetMapping
	public List<Doacao> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	public Doacao create(@RequestBody Doacao doacao) {
		return service.save(doacao);
	}
	
	@GetMapping("/{id}")
	public Doacao findbyId(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody Doacao doacao, @PathVariable Long id) {
		service.update(id, doacao);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
