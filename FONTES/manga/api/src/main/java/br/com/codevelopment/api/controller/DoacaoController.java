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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/v1/doacao")
@Api(value = "Operações para o objeto Doação")
public class DoacaoController {
	private DoacaoService service;
	
	@ApiOperation(value = "Retorna todas as Doações")	
	@GetMapping
	public List<Doacao> findAll() {
		return service.findAll();
	}
	
	@ApiOperation(value = "Cria uma nova Doação")
	@PostMapping
	public Doacao create(@RequestBody Doacao doacao) {
		return service.save(doacao);
	}
	
	@ApiOperation(value = "Retorna uma doação pelo seu id")
	@GetMapping("/{id}")
	public Doacao findbyId(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@ApiOperation(value = "Atualiza uma doação")
	@PutMapping("/{id}")
	public void update(@RequestBody Doacao doacao, @PathVariable Long id) {
		service.update(id, doacao);
	}
	
	@ApiOperation(value = "deleta uma doação")
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
