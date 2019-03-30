package br.com.caelum.contas.modelo;


/**
 * 
 * @author oo8163
 *
 */
public abstract class Conta{
	private int numero;
    private String titular;
    private String agencia;
    private double saldo;
    private Data dataAbertura;
    
    public Conta(String titular, int numero, String agencia, Data dataAbertura){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca (double valor){
        this.saldo -= valor;
    }

    public double calculaRendimento(){
        return this.saldo * 0.1;
    }

	public double getSaldo() {
		return this.saldo;
	}
	
	public String getDataAbertura() {
		return this.dataAbertura.getDataFormatada();
	}

	public String getTitular() {
		return this.titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getAgencia() {
		return this.agencia;
	}
	
	public abstract String getTipo();
	
	
}