package br.com.codevelopment.common.service.contract;

import java.util.List;

import br.com.codevelopment.common.domain.entity.Avaliacao;

public interface AvaliacaoService {
	Avaliacao save(Avaliacao doacao);
	Avaliacao update(Long id, Avaliacao doacao);
	List<Avaliacao> findAll();
	Avaliacao findById(Long id);
	void delete(Long id);
}
