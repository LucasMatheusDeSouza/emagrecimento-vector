package br.com.vectorconsultoria.emagrecimento.test;
import br.com.vectorconsultoria.emagrecimento.dominio.CalculaDeficit;
import br.com.vectorconsultoria.emagrecimento.dominio.Cliente;
import br.com.vectorconsultoria.emagrecimento.dominio.Homem;
import br.com.vectorconsultoria.emagrecimento.dominio.Mulher;

public class Teste {

	public static void main(String[] args) {

		Cliente homem = new Homem();
		homem.setNome("Lucas");
		homem.setAltura(185);
		homem.setIdade(23);
		homem.setPeso(85);
		homem.setQuilosPorSemana(0.5);
		homem.setQuantoQueroPesar(70);
		
		CalculaDeficit cd = new CalculaDeficit();
		cd.calculaDeficitBasal(homem);
		homem.calculaSemanas();
		homem.mostraEvolucao();
		
	
		
				
	}

}
