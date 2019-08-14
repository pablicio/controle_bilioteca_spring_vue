package com.uepb.ControleBiblioteca.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="anais_de_congresso")
public class AnaisDeCongresso {
		
	@Id
	@Column(name="id")
	@GeneratedValue
	private Long id;
	
	@Column(name="ano_publicacao")
	private int anoPublicacao;
	
	@Column(name="tipo_anal")
	private String tipoAnal;
	
	@Column(name="titulo")
	private String 	titulo;
	
	@Column(name="edicao")
	private String edicao;
	
	@Column(name="autores")
	private String autores;
	
	@Column(name="orientadores")
	private String orientadores;
	
	@Column(name="nome_congresso")
	private String nomeCongresso;
	
	@Column(name="local")
	private String local;
	
	
	
	public AnaisDeCongresso(Long id, String nomeCongresso, String local) {
		this.id = id;
		this.nomeCongresso = nomeCongresso;
		this.local = local;
	}

	/**
	 * Constructor method
	 */
	public AnaisDeCongresso()	{
		
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
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getTipoAnal() {
		return tipoAnal;
	}
	public void setTipoAnal(String tipoAnal) {
		this.tipoAnal = tipoAnal;
	}
	public String getOrientadores() {
		return orientadores;
	}
	public void setOrientadores(String orientadores) {
		this.orientadores = orientadores;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNomeCongresso() {
		return nomeCongresso;
	}
	public void setNomeCongresso(String nomeCongresso) {
		this.nomeCongresso = nomeCongresso;
	}
}
