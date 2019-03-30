package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(String titular, int numero, String agencia, Data dataAbertura) {
		super(titular, numero, agencia, dataAbertura);
	}
	
	public String getTipo() {
		return "Conta Poupança";
	}
}
