package br.com.codevelopment.common.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codevelopment.common.domain.entity.Manga;

public interface MangaRepository extends JpaRepository<Manga, Long>{

}
