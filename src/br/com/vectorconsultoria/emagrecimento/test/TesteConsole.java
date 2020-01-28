package br.com.vectorconsultoria.emagrecimento.test;

import java.util.Scanner;

import br.com.vectorconsultoria.emagrecimento.dominio.Cliente;
import br.com.vectorconsultoria.emagrecimento.dominio.Homem;
import br.com.vectorconsultoria.emagrecimento.dominio.Mulher;

public class TesteConsole {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Cliente homem = new Homem();
		Cliente mulher = new Mulher();
		
		System.out.println("Informe seu sexo ");
		String genero = in.nextLine();
		clear();
		
		//complexidade 
		if(genero.toString()=="M".toString()) {
			System.out.println("sexo masculino ");	
		}
		
		while((genero!="M") || (genero!="F")) {
			System.out.println(genero);
			if(genero == "M") {
				System.out.println("Digite seu nome:");
				homem.setNome(in.nextLine());
				clear();
				System.out.println("Digite sua altura:");
				homem.setAltura(in.nextInt());
				clear();
				System.out.println(homem.getAltura());
				System.out.println("Digite sua idade:");
				homem.setIdade(in.nextInt());
				System.out.println("Digite seu peso: ");
				homem.setPeso(in.nextInt());
				System.out.println("Digite se quer perder 1kg  ou 0.5kg semana: ");
				homem.setQuilosPorSemana(in.nextDouble());
				System.out.println("Digite quanto quer pesar: ");
				homem.setQuantoQueroPesar(in.nextInt());
			}else {
				if(genero == "F") {
					System.out.println("Digite seu nome:");
					mulher.setNome(in.nextLine());
					clear();
					System.out.println("Digite sua altura:");
					mulher.setAltura(in.nextInt());
					clear();
					System.out.println(homem.getAltura());
					System.out.println("Digite sua idade:");
					mulher.setIdade(in.nextInt());
					System.out.println("Digite seu peso: ");
					mulher.setPeso(in.nextInt());
					System.out.println("Digite se quer perder 1kg  ou 0.5kg semana: ");
					mulher.setQuilosPorSemana(in.nextDouble());
					System.out.println("Digite quanto quer pesar: ");
					mulher.setQuantoQueroPesar(in.nextInt());
				}
				else {
					System.out.println("Genero invalido digite novamente: ");
					System.out.println("Informe seu sexo ");
					genero = in.nextLine();
				}
			}
		}
	} 
	
	public static void clear() {
		  for (int i = 0; i < 10; ++i)  
		       System.out.println();  
	}

}
