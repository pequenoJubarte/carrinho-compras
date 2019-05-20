package br.com.natheus;

import java.rmi.RemoteException;

import org.tempuri.CResultado;
import org.tempuri.CServico;
import org.tempuri.CalcPrecoPrazoWSSoapProxy;

public class Frete {
	private final String cepRemetente = "97105900";
	
	public float calcularFrete(String cepDestinatario,int quantidadeTotal) {
		Float peso = quantidadeTotal * 0.2f;
		float precoFrete = 0;
		
		CalcPrecoPrazoWSSoapProxy soap = new CalcPrecoPrazoWSSoapProxy();
		CResultado resultado = new CResultado();
		try {
			resultado = soap.calcPreco("UFSM", "senha", "40010", cepRemetente, cepDestinatario, Float.toString(peso), 1, 16,2,11,2, "n",18.5, "n");
		} catch (RemoteException e) {
			System.out.print("Erro com o CEP !!!\n");
			e.printStackTrace();
			return 0;
		}
		
		CServico[] listaResultados = resultado.getServicos();
		for(CServico resultados : listaResultados) {
			precoFrete = Float.parseFloat(resultados.getValor().replace("," , "."));
		}
		
		return precoFrete;
	}
	
	public String getCepRemetente() {
		return cepRemetente;
	}
}
