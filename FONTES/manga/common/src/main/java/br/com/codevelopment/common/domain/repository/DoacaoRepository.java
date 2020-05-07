package br.com.codevelopment.common.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codevelopment.common.domain.entity.Doacao;

public interface DoacaoRepository extends JpaRepository<Doacao, Long>{

}
