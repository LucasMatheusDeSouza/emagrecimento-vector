package br.com.vectorconsultoria.emagrecimento.dominio;

public class Mulher extends Cliente {

	@Override
	public double calculaTaxaBasal() {
		return Math.round((447.6 + (9.2 * super.getPesoInicial()) 
				+ (3.1 * super.getAltura()) - (4.3 * super.getIdade())));
		 
	}

}
