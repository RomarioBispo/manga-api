package br.com.codevelopment.common.service.contract;

import java.util.List;

import br.com.codevelopment.common.domain.entity.Doacao;

public interface DoacaoService {
	Doacao save(Doacao doacao);
	Doacao update(Long id, Doacao doacao);
	List<Doacao> findAll();
	Doacao findById(Long id);
	void delete(Long id);
}
