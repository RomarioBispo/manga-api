package br.com.codevelopment.common.domain.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="tb_manga")
public class Manga {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="email_usuario", length=50, nullable=false, unique=false)
	private String email;
	
	@Column(length=50, nullable=false, unique=false)
	private String titulo;
	
	@Column(length=50, nullable=false, unique=false)
	private String sinopse;
	
	@Column(name="data_lancamento", length=50, nullable=false, unique=false)
	private LocalDate dataLancamento;
	
	@Column(name="nome_mangaka", length=50, nullable=false, unique=false)
	private String nomeMangaka;
	
	@Column(length=50, nullable=false, unique=false)
	private String genero;
	
	@Column(length=50, nullable=false, unique=false)
	private String status;
	
	@Column(name="quantidade_volumes", length=50, nullable=false, unique=false)
	private Integer qtdVolumes;
	
	@Column(length=50, nullable=false, unique=false)
	private String intencao;
}
