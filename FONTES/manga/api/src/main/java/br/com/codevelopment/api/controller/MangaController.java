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

@RestController
@RequestMapping("api/v1/manga")
public class MangaController {
	
	private MangaService service;
	
	public MangaController(MangaService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Manga> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	public Manga create(@RequestBody Manga manga) {
		return service.save(manga);
	}
	
	@GetMapping("/{id}")
	public Manga findbyId(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody Manga manga, @PathVariable Long id) {
		service.update(id, manga);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
}
