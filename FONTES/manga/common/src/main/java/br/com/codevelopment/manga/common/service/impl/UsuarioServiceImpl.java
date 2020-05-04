package br.com.codevelopment.manga.common.service.impl;

import java.util.List;
import java.util.Optional;

import br.com.codevelopment.manga.common.domain.entity.Usuario;
import br.com.codevelopment.manga.common.domain.repository.UsuarioRepository;
import br.com.codevelopment.manga.common.service.contract.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository usuarioRepository;
	
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	@Override
	public Usuario create(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario update(Long id, Usuario usuario) {
		Optional<Usuario> u = usuarioRepository.findById(id);
		return usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario findById(Long id) {
		Optional<Usuario> u = usuarioRepository.findById(id);
		return u.isPresent() ? u.get() : null;
	}

	@Override
	public void delete(Long id) {
		Optional<Usuario> u = usuarioRepository.findById(id);
		usuarioRepository.delete(u.get());
	}

}
