package br.com.codevelopment.common.service.impl;

import java.util.List;
import java.util.Optional;

import br.com.codevelopment.common.domain.entity.Avaliacao;
import br.com.codevelopment.common.domain.repository.AvaliacaoRepository;
import br.com.codevelopment.common.service.contract.AvaliacaoService;

public class AvaliacaoServiceImpl implements AvaliacaoService{
	private AvaliacaoRepository repository;
	
	public AvaliacaoServiceImpl(AvaliacaoRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Avaliacao save(Avaliacao avaliacao) {
		return repository.save(avaliacao);
	}

	@Override
	public Avaliacao update(Long id, Avaliacao avaliacao) {
		Optional<Avaliacao> opt = repository.findById(id);
		Avaliacao toSave = new Avaliacao();
		if (opt.isPresent()) {
			toSave = opt.get();
			toSave.setComentario(avaliacao.getComentario());
			toSave.setEmail(avaliacao.getEmail());
			toSave.setNota(avaliacao.getNota());
		}
		return toSave;
	}

	@Override
	public List<Avaliacao> findAll() {
		return repository.findAll();
	}

	@Override
	public Avaliacao findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
