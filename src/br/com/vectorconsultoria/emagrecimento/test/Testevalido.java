package br.com.vectorconsultoria.emagrecimento.test;

import java.util.Scanner;

import br.com.vectorconsultoria.emagrecimento.dominio.Cliente;
import br.com.vectorconsultoria.emagrecimento.dominio.Formulario;
import br.com.vectorconsultoria.emagrecimento.dominio.Homem;

public class Testevalido {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	Cliente lucas = new Homem ();
	Formulario form = new Formulario();
		form.preencheFormulario(lucas);
	}
}
