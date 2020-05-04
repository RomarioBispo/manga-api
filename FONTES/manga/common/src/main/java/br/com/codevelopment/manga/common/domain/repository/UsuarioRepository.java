package br.com.codevelopment.manga.common.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codevelopment.manga.common.domain.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
