package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class Sistema {
	
 public static void main(String[] args) {
	
	
	Conta c1 = new Conta("Victor", "2363-0", new Data());
	Conta c2 = new Conta("teste", "2363-1", new Data());
	
	
	c1.deposita(1000);
	System.out.println(c1.getSaldo());
	
	c1.saca(250);
	System.out.println(c1.getSaldo());
	
	System.out.println(c1.getDataAbertura());
	
	System.out.println("Numero da conta 1: "+c1.getNumero());
	System.out.println("Numero da conta 2: "+c2.getNumero());
}
}
