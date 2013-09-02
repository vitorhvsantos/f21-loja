package br.com.loja.mvc.modelo;

import java.util.Calendar;

public class Produto {

	private Long id;
	private String nome;
	private double preco;
	private Calendar dtCadastro;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Calendar getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Calendar dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	
	
}
