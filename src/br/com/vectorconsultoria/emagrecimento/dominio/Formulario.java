package br.com.vectorconsultoria.emagrecimento.dominio;

import java.util.Scanner;

public class Formulario {
	CalculaDeficit cd = new CalculaDeficit();
	Scanner in = new Scanner(System.in);

	public void preencheFormulario(Cliente genero) {
		System.out.println("Informe seu Nome: ");
		genero.setNome(in.nextLine());
		System.out.println("Informe sua Altura: ");
		genero.setAltura(in.nextInt());
		System.out.println("Informe sua Idade: ");
		genero.setIdade(in.nextInt());
		System.out.println("Informe seu Peso: ");
		genero.setPeso(in.nextInt());
		System.out.println("Quanto quer emagrecer por semana: ");
		genero.setQuilosPorSemana(Double.parseDouble(in.next()));
		System.out.println("Informe o quanto quer pesar após o termino do emagrecimento: ");
		genero.setQuantoQueroPesar(in.nextInt());
		clear();

		System.out.println("Sua taxa basal é " + genero.calculaTaxaBasal());
		cd.calculaDeficitBasal(genero);
		genero.mostraEvolucao();
	}

	public static void clear() {
		for (int i = 0; i < 10; ++i)
			System.out.println();
	}

	//
	public void verificaGenero(Cliente cliente) {
		Homem obj = new Homem();
		if (cliente.getClass().equals(obj)) {
			System.out.println("é homem");
		}
		System.out.println("é mulher");
	}

}
