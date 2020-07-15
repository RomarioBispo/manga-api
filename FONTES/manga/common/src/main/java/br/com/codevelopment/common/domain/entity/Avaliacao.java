package br.com.codevelopment.common.domain.entity;

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
public class Avaliacao {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="email_usuario", length=50, nullable=false, unique=false)
	private String email;
	@Column(name="nota", length=50, nullable=false, unique=false)
	private Double nota;
	@Column(name="comentario", length=50, nullable=false, unique=false)
	private String comentario;
	
}
