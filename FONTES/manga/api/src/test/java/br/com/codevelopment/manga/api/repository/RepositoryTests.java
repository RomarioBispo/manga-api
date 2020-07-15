package br.com.codevelopment.manga.api.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.codevelopment.common.domain.entity.Usuario;
import br.com.codevelopment.common.domain.repository.UsuarioRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
class RepositoryTests {
	
	@Autowired
	private UsuarioRepository repository;
	
	@Test
	void WhenUserCreatedThenSuccess() {
		Usuario u = new Usuario();
		u.setNome("usuario1");
		u.setEmail("email@email.com");
		u.setEndereco(null);
		u.setDoacao(null);
		u.setAvaliacao(null);
		u.setSenha("senha");
		u.setNickname("nickk");
		u.setSobreNome("sobrenome");
		u.setTelefone(null);
		repository.save(u);
		List<Usuario> opt = repository.findAll();
		assertThat(opt.size()).isEqualTo(1);
	}
	
	@Test
	void deleteShouldRemoveData() {
		Usuario u = new Usuario();
		u.setNome("usuario2");
		u.setEmail("email@email.com");
		u.setEndereco(null);
		u.setDoacao(null);
		u.setAvaliacao(null);
		u.setSenha("senha");
		u.setNickname("nickk");
		u.setSobreNome("sobrenome");
		u.setTelefone(null);
		u = repository.save(u);
		repository.deleteById(u.getId());
		assertThat(repository.findById(u.getId()).isPresent()).isFalse();
	}
	
	@Test
	void updateShouldPersistData() {
		Usuario u = new Usuario();
		u.setNome("usuario3");
		u.setEmail("email@email.com");
		u.setEndereco(null);
		u.setDoacao(null);
		u.setAvaliacao(null);
		u.setSenha("senha");
		u.setNickname("nickk");
		u.setSobreNome("sobrenome");
		u.setTelefone(null);
		u = repository.save(u);
		u.setNome("new usuario");
		u = repository.save(u);
		assertThat(u.getNome()).isEqualTo("new usuario");
	}
}
