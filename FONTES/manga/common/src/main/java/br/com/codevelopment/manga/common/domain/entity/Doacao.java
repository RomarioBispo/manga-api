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
@Table(name="tb_doacao")
public class Doacao {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="id_doador", length=50, nullable=false, unique=false)
	private Long idDoador;
	
	@Column(name="id_usuario", length=50, nullable=false, unique=false)
	private Long idUsuario;

	@Column(name="id_manga", length=50, nullable=false, unique=false)
	private Long idManga;
}
