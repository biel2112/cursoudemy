package com.udemy.cursomc.domain;

public class Pessoa {
	private String nome;
	private String titulo;
	private String email;
	private String telefone;
	private boolean ativo = false;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String titulo, String email, String telefone) {
		super();
		this.nome = nome;
		this.titulo = titulo;
		this.email = email;
		this.telefone = telefone;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public void ativar() {
		this.ativo = true;
	}
	
	
	
	
}
