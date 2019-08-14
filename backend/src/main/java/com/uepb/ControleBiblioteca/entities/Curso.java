package com.uepb.ControleBiblioteca.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/***
 * 
 * @author Lucas Nunes
 *
 */

@Entity
@Table(
		name="cursos",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"nome"})})
public class Curso {


	@Id
	@Column(name="id")
	@GeneratedValue
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="area")
	private String area;
	
	@Column(name="tipo")
	private String tipo;
	
	
	
	public Curso(Long id, String nome, String area) {
		this.id = id;
		this.nome = nome;
		this.area = area;
	}



	/**
	 * Constructor method
	 */
	public Curso() {
		
	}


	
	/**
	 * Getters and Seters.
	 */
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
