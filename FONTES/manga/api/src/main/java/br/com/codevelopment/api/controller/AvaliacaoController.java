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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/v1/avaliacao")
@Api(value = "Operações para o objeto avaliação")
public class AvaliacaoController {
	
	private AvaliacaoService service;
	
	@ApiOperation(value = "Retorna todas as avaliações")	
	@GetMapping
	public List<Avaliacao> findAll() {
		return service.findAll();
	}
	
	@ApiOperation(value = "Cria uma nova avaliação")
	@PostMapping
	public Avaliacao create(@RequestBody Avaliacao avaliacao) {
		return service.save(avaliacao);
	}
	
	@ApiOperation(value = "Retorna uma avaliação pelo seu id")
	@GetMapping("/{id}")
	public Avaliacao findbyId(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@ApiOperation(value = "Atualiza uma avaliação")
	@PutMapping("/{id}")
	public void update(@RequestBody Avaliacao avaliacao, @PathVariable Long id) {
		service.update(id, avaliacao);
	}
	
	@ApiOperation(value = "deleta uma avaliação")
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
