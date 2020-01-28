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
		if (idade >= 18 && idade <= 65) {
			this.idade = idade;
		}
		
		while (idade < 18 || idade > 65) {
			System.out.println("idade invalida digite novamente");
			this.setIdade(idade);
		}

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
