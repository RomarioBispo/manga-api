package br.com.codevelopment.manga.common.service.contract;

import java.util.List;

import br.com.codevelopment.manga.common.domain.entity.Usuario;

public interface UsuarioService {
	Usuario create(Usuario usuario);
	Usuario update(Long id, Usuario usuario);
	List<Usuario> findAll();
	Usuario findById(Long id);
	void delete(Long id);
}
