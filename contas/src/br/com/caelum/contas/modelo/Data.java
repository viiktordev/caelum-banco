package br.com.caelum.contas.modelo;

public class Data{
	private int dia;
    private int mes;
    private int ano;
    
    public Data() {
    	this.dia = 23;
    	this.mes = 3;
    	this.ano = 2019;
    }
    public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDataFormatada() {
    	return this.dia+"/"+this.mes+"/"+this.ano;
    }
    
}
