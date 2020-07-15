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

import br.com.codevelopment.common.domain.entity.Manga;
import br.com.codevelopment.common.service.contract.MangaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/v1/manga")
@Api(value = "Operações para o objeto mangá")
public class MangaController {
	
	private MangaService service;
	
	public MangaController(MangaService service) {
		this.service = service;
	}
	
	@GetMapping
	@ApiOperation(value = "Retorna todas os mangás")	
	public List<Manga> findAll() {
		return service.findAll();
	}
	
	@ApiOperation(value = "Insere um novo mangá")
	@PostMapping
	public Manga create(@RequestBody Manga manga) {
		return service.save(manga);
	}
	
	@ApiOperation(value = "Retorna uma mangá pelo seu id")
	@GetMapping("/{id}")
	public Manga findbyId(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@ApiOperation(value = "Atualiza um mangá")
	@PutMapping("/{id}")
	public void update(@RequestBody Manga manga, @PathVariable Long id) {
		service.update(id, manga);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "deleta uma mangá")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
}
