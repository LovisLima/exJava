package vendas;

import estoque.Peca;

public class Orcamento {
	
	private long numero;
	private String data;
	
	private Peca peca [];

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Peca[] getPeca() {
		return peca;
	}

	public void setPeca(Peca[] peca) {
		this.peca = peca;
	}
	
	
	
}
