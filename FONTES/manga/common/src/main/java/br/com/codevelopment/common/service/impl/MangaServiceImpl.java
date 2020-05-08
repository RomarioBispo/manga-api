package br.com.codevelopment.common.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.codevelopment.common.domain.entity.Manga;
import br.com.codevelopment.common.domain.repository.MangaRepository;
import br.com.codevelopment.common.service.contract.MangaService;

@Service
public class MangaServiceImpl implements MangaService{
	private MangaRepository repository;
	
	public MangaServiceImpl(MangaRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Manga> findAll() {
		return repository.findAll();
	}

	@Override
	public Manga findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Manga save(Manga manga) {
		return repository.save(manga);
	}

	@Override
	public void update(Long id, Manga manga) {
		Optional<Manga> opt = repository.findById(id);
		if (opt.isPresent()) {
			Manga toSave = opt.get();
			toSave.setDataLancamento(manga.getDataLancamento());
			toSave.setEmail(manga.getEmail());
			toSave.setGenero(manga.getGenero());
			toSave.setIntencao(manga.getIntencao());
			toSave.setNomeMangaka(manga.getNomeMangaka());
			toSave.setQtdVolumes(manga.getQtdVolumes());
			toSave.setSinopse(manga.getSinopse());
			toSave.setStatus(manga.getStatus());
			toSave.setTitulo(manga.getTitulo());
			repository.save(toSave);
		}
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
