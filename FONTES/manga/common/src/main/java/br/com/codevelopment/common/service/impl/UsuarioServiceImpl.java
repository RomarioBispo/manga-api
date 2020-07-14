package br.com.codevelopment.common.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.codevelopment.common.domain.entity.Usuario;
import br.com.codevelopment.common.domain.repository.UsuarioRepository;
import br.com.codevelopment.common.error.ResourceNotFoundException;
import br.com.codevelopment.common.service.contract.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository repository;
	
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		this.repository = usuarioRepository;
	}
	
	@Override
	public Usuario create(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	public Usuario update(Long id, Usuario usuario) {
		verifyIfUserExist(id);
		Optional<Usuario> opt = repository.findById(id);
		Usuario toSave = new Usuario();
		if (opt.isPresent()) {
			toSave = opt.get();
			toSave.setAvaliacao(usuario.getAvaliacao());
			toSave.setDoacao(usuario.getDoacao());
			toSave.setDoador(usuario.getDoador());
			toSave.setEmail(usuario.getEmail());
			toSave.setEndereco(usuario.getEndereco());
			toSave.setManga(usuario.getManga());
			toSave.setNickname(usuario.getNickname());
			toSave.setNome(usuario.getNome());
			toSave.setSenha(usuario.getSenha());
			toSave.setSobreNome(usuario.getSobreNome());
			toSave.setTelefone(usuario.getTelefone());
		}
		return repository.save(usuario);
	}

	@Override
	public List<Usuario> findAll() {
		return repository.findAll();
	}

	@Override
	public Usuario findById(Long id) {
		verifyIfUserExist(id);
		return repository.findById(id).get(); 
	}

	@Override
	public void delete(Long id) {
		verifyIfUserExist(id);
		repository.delete(repository.findById(id).get());
	}
	
	private void verifyIfUserExist(Long id) {
		Optional<Usuario> opt = repository.findById(id);
		if (!opt.isPresent()) {
			throw new ResourceNotFoundException("Resouce not found with id" + id);
		}
	}

}
