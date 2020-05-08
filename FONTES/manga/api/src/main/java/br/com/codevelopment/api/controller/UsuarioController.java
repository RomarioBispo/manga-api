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

import br.com.codevelopment.common.domain.entity.Usuario;
import br.com.codevelopment.common.service.contract.UsuarioService;

@RestController
@RequestMapping("api/v1/usuario")
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@PostMapping
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioService.create(usuario);
	}
	
	@GetMapping
	public List<Usuario> findAll() {
		return usuarioService.findAll();
	}
	
	@GetMapping("/{id}")
	public Usuario findById(@PathVariable Long id) {
		return usuarioService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario) {
		return usuarioService.update(id, usuario);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		usuarioService.delete(id);
	}
}
