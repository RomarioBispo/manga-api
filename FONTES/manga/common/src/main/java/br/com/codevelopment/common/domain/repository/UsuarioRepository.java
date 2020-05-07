package br.com.codevelopment.common.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codevelopment.common.domain.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
