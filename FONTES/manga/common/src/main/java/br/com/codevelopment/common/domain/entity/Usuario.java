package br.com.codevelopment.common.domain.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tb_usuario")
public class Usuario {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome", length=50, nullable=false, unique=false)
	private String nome;
	
	@Column(name="sobrenome", length=50, nullable=false, unique=false)
	private String sobreNome;
	
	@Column(name="nickname", length=50, nullable=false, unique=false)
	private String nickname;
	
	@Column(name="email", length=50, nullable=false, unique=false)
	private String email;
	
	@Column(name="senha", length=50, nullable=false, unique=false)
	private String senha;
	
	@OneToOne
    @JoinColumn(name = "id_endereco")
	private Endereco endereco;
	
	@OneToMany
    @JoinColumn(name = "id")
	private List<Telefone> telefone;
	
	@OneToOne
    @JoinColumn(name = "id")
	private Avaliacao avaliacao;
	
	@OneToMany
    @JoinColumn(name = "id")
	private List<Manga> manga;
	
	@OneToOne
    @JoinColumn(name = "id")
	private Doador doador;
	
	@OneToMany
    @JoinColumn(name = "id")
	private List<Doacao> doacao;
	
}
