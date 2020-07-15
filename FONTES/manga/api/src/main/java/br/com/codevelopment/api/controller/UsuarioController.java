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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/v1/usuario")
@Api(value = "Operações para o objeto usuario")
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@ApiOperation(value = "Cria um usuário")	
	@PostMapping
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioService.create(usuario);
	}
	
	@ApiOperation(value = "Lista todos os usuários")	
	@GetMapping
	public List<Usuario> findAll() {
		return usuarioService.findAll();
	}
	
	@ApiOperation(value = "Retorna uma usuário pelo seu id")
	@GetMapping("/{id}")
	public Usuario findById(@PathVariable Long id) {
		return usuarioService.findById(id);
	}
	
	@ApiOperation(value = "Atualiza um usuário")
	@PutMapping("/{id}")
	public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario) {
		return usuarioService.update(id, usuario);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "deleta uma usuário")
	public void delete(@PathVariable Long id) {
		usuarioService.delete(id);
	}
}
