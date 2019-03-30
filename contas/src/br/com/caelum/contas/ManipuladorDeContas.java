package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.Data;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	private Conta conta;
	
	public void criaConta(Evento evento) {
		String tipo = evento.getSelecionadoNoRadio("tipo");
		String titular = evento.getString("titular");
		int numero = evento.getInt("numero");
		String agencia = evento.getString("agencia");
		
		if(tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente(titular, numero, agencia, new Data());
		}else if(tipo.equals("Conta Poupanca")) {
			this.conta = new ContaPoupanca(titular, numero, agencia, new Data());
		}
	}
	
	public void deposita(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		this.conta.deposita(valor);
	}
	
	public void saca(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		this.conta.saca(valor);
	}
}
