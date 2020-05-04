package br.com.codevelopment.manga.common.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codevelopment.manga.common.domain.entity.Doacao;

public interface DoacaoRepository extends JpaRepository<Doacao, Long>{

}
