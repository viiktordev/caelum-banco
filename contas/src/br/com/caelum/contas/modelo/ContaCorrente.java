package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(String titular, int numero, String agencia, Data dataAbertura) {
		super(titular, numero, agencia, dataAbertura);
	}
	
	public String getTipo() {
		return "Conta Corrente";
	}

	public void saca(double valor) {
		super.saca(valor + 0.1);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.1;
	}
}
