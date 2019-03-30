package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {

	private double valor;
	private String titular;
	private int numeroApolice;
	
	public SeguroDeVida(double valor, String titular, int numApolice) {
		this.valor = valor;
		this.titular = titular;
		this.numeroApolice = numApolice;
	}
	
	@Override
	public double getValorImposto() {
		return 42 + this.valor * 0.2;
	}

	public double getValor() {
		return valor;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}
	
	
}
