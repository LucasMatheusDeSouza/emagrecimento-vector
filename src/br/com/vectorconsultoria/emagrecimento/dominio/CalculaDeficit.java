package br.com.vectorconsultoria.emagrecimento.dominio;

public class CalculaDeficit {
	
	private double deficitCalculado;

	public void calculaDeficitBasal(Cliente genero) {

		if (genero.getQuilosPorSemana() == 0.5) {
			System.out.println(genero.getNome() + " esse é o seu deficit diario: " + (genero.calculaTaxaBasal() - 550) + " irá gerar 0.5kg por semana");

		} else if (genero.getQuilosPorSemana() == 1) {
			System.out.println(genero.getNome() + " esse é o deficit diario: " + (genero.calculaTaxaBasal() - 1100) + " irá gerar 1kg por semana");
		} else {
			
			System.out.println("Informações invalidas");
		}

	}
	
	public double getDeficitCalculado() {
		return deficitCalculado;
	}
}
