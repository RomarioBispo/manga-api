package br.com.codevelopment.common.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.codevelopment.common.domain.entity.Doacao;
import br.com.codevelopment.common.domain.repository.DoacaoRepository;
import br.com.codevelopment.common.service.contract.DoacaoService;

@Service
public class DoacaoServiceImpl implements DoacaoService {	
	
	private DoacaoRepository repository;
	
	public DoacaoServiceImpl (DoacaoRepository repository) {
		this.repository = repository;
	}
	@Override
	public Doacao save(Doacao doacao) {
		return repository.save(doacao);
	}

	@Override
	public Doacao update(Long id, Doacao doacao) {
		Optional<Doacao> opt = repository.findById(id);
		Doacao toSave = new Doacao();
		if (opt.isPresent()) {
			toSave = opt.get();
			toSave.setIdDoador(doacao.getIdDoador());
			toSave.setIdManga(doacao.getIdManga());
			toSave.setIdUsuario(doacao.getIdUsuario());
			toSave = repository.save(toSave);
		}
		return toSave;
	}

	@Override
	public List<Doacao> findAll() {
		return repository.findAll();
	}

	@Override
	public Doacao findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
