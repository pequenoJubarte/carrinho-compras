package br.com.natheus;

public class Main {
	public static void main(String args[]) {
		Frete frete = new Frete();

		frete.calcularFrete("97090130", 2);
		System.out.print(frete);
	}
}
