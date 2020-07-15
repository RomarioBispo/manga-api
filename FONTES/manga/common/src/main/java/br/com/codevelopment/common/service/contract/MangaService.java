package br.com.codevelopment.common.service.contract;

import java.util.List;

import br.com.codevelopment.common.domain.entity.Manga;

public interface MangaService {
	public List<Manga> findAll();
	public Manga findById(Long id);
	public Manga save(Manga manga);
	public void update(Long id, Manga manga);
	public void delete (Long id);
}
