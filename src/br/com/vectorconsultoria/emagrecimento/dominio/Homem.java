package br.com.vectorconsultoria.emagrecimento.dominio;

public class Homem extends Cliente {
	
	@Override
	public double calculaTaxaBasal() {
		 
	return Math.round((88.35 + (13.4 * super.getPesoInicial()) + (4.8 * super.getAltura()) 
			- (5.7 * super.getIdade())));
		} 
		
	}

