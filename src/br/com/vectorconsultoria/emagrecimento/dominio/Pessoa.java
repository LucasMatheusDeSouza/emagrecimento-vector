package br.com.vectorconsultoria.emagrecimento.dominio;

public abstract class Pessoa {

	private String nome;
	private int idade;
	private int altura;
	private int peso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPesoInicial() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
