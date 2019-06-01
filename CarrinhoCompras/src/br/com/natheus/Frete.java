package br.com.natheus;

import java.awt.font.NumericShaper;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.tempuri.CResultado;
import org.tempuri.CServico;
import org.tempuri.CalcPrecoPrazoWSSoapProxy;

public class Frete {
	private final String CEPREMETENTE = "97105900", EMPRESA = "UFSM", SENHA = "senha", SERVICO = "04014",
			MAOPROPRIA = "n", AVISO = "n";
	private final int CODIGOFORMATO = 1;
	private final double COMPRIMENTO = 16, ALTURA = 2, LARGURA = 11, DIAMETRO = 2, VALORDECLARADO = 19.5;

	public double calcularFrete(String cepDestinatario, int quantidadeTotal) {
		Float peso = quantidadeTotal * 0.2f;
		double precoFrete = 0;

		CalcPrecoPrazoWSSoapProxy soap = new CalcPrecoPrazoWSSoapProxy();
		CResultado resultado = new CResultado();
		try {
			resultado = soap.calcPreco(EMPRESA, SENHA, SERVICO, CEPREMETENTE, cepDestinatario, Float.toString(peso),
					CODIGOFORMATO, COMPRIMENTO, ALTURA, LARGURA, DIAMETRO, MAOPROPRIA, VALORDECLARADO, AVISO);
		} catch (RemoteException e) {
			System.out.print("Erro com o CEP !!!\n");
			e.printStackTrace();
			return 0;
		}
		CServico[] listaResultados = resultado.getServicos();
		try {
			for (CServico resultados : listaResultados) {
				Locale ptBR = new Locale("pt", "BR");
				precoFrete = NumberFormat.getInstance(ptBR).parse(resultados.getValor()).doubleValue();
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return precoFrete;
	}

	public String getCEPREMETENTE() {
		return CEPREMETENTE;
	}

	public String getEMPRESA() {
		return EMPRESA;
	}

	public String getSENHA() {
		return SENHA;
	}

	public String getSERVICO() {
		return SERVICO;
	}

	public String getMAOPROPRIA() {
		return MAOPROPRIA;
	}

	public String getAVISO() {
		return AVISO;
	}

	public int getCODIGOFORMATO() {
		return CODIGOFORMATO;
	}

	public double getCOMPRIMENTO() {
		return COMPRIMENTO;
	}

	public double getALTURA() {
		return ALTURA;
	}

	public double getLARGURA() {
		return LARGURA;
	}

	public double getDIAMETRO() {
		return DIAMETRO;
	}

	public double getVALORDECLARADO() {
		return VALORDECLARADO;
	}
}
