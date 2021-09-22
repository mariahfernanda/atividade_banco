package app;

import model.Conta;

public class Banco {

	public static void main(String[] args) {

		Conta contaDaMaria = new Conta();
		contaDaMaria.titlar = "Maria Fernanda";
		contaDaMaria.agencia = "0505-4";
		contaDaMaria.numero = "2004-5";
		contaDaMaria.tipoConta = "Corrente";
		contaDaMaria.saldo = 1000;

		Conta contaDoPedro = new Conta();
		contaDoPedro.titlar = "Pedro Henrique";
		contaDoPedro.agencia = "0505-4";
		contaDoPedro.numero = "1015-8";
		contaDoPedro.tipoConta = "Poupança";
		contaDoPedro.saldo = 500;

		// ver saldo da Maria

		System.out.println("Saldo da Maria : " + contaDaMaria.saldo);
		System.out.println("Saldo do Pedro : " + contaDoPedro.saldo);
		System.out.println("");

		// deposito
		contaDaMaria.depositar(100);
		System.out.println("Saldo da Maria com deposito : " + contaDaMaria.saldo);

		contaDoPedro.depositar(100.45);
		System.out.println("Saldo do Pedro com deposito : " + contaDoPedro.saldo);
	}

}
