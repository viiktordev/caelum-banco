package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {
	private SeguroDeVida seguroDeVida;
	
	public void criaSeguro(Evento evento) {
		double valor = evento.getDouble("valor");
		String titular = evento.getString("titular");
		int numApolice = evento.getInt("numeroApolice");
		
		this.seguroDeVida = new SeguroDeVida(valor, titular, numApolice);
	}
}
