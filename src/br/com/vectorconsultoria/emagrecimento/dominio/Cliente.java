package br.com.vectorconsultoria.emagrecimento.dominio;

public abstract class Cliente extends Pessoa {

	private int quantoQueroPesar;
	private double quilosPorSemana;

	public abstract double calculaTaxaBasal();

	public void setQuantoQueroPesar(int quantoQueroPesar) {
		this.quantoQueroPesar = quantoQueroPesar;
	}

	public void setQuilosPorSemana(double quilosPorSemana) {
		if (quilosPorSemana == 1 || quilosPorSemana == 0.5) {
			this.quilosPorSemana = quilosPorSemana;
		} else {
			System.out.println("Valor Invalido");
		}
	}

	// tempo em semanas para atingir o resultado

	public double getQuilosPorSemana() {
		return quilosPorSemana;
	}

	public void mostraEvolucao() {
		int semanas = 0;

		double peso = super.getPesoInicial() - this.quantoQueroPesar;
		System.out.println(
				"Perdendo " + this.quilosPorSemana + " por semana levará " + peso / this.quilosPorSemana + " semanas para chegar em " + quantoQueroPesar + "kg");
		for (double x = super.getPesoInicial(); x >= quantoQueroPesar; x -= this.quilosPorSemana) {
			System.out.println("semana " + semanas + " " + x + " peso");
			semanas++;
		}
	}
}

//		if (quilosPorSemana == 0.5 && genero == "M") {
//			taxaBasal = (88.35 + (13.4 * super.getPesoInicial()) + (4.8 * super.getAltura()) - (5.7 * super.getIdade()) - 550);
//		} else if (quilosPorSemana == 1 && genero == "M") {
//			taxaBasal = (88.35 + (13.4 * super.getPesoInicial()) + (4.8 * super.getAltura()) - (5.7 * super.getIdade())
//					- 1100);
//		}else {
//			System.out.println("Dados invalidos");
//		}
//	}