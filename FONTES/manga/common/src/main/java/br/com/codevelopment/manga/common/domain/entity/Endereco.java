package br.com.codevelopment.manga.common.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tb_endereco")
public class Endereco {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=50, nullable=false, unique=false)
	private String cep;

	@Column(length=50, unique=false)
	private String cidade;
	
	@Column(length=50, unique=false)
	private String estado;
	
	@Column(length=50, unique=false)
	private String bairro;
	
	@Column(length=50, unique=false)
	private String rua;
	
	@Column(length=50, unique=false)
	private String numero;
}
