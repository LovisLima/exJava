package comercial;

import estoque.Peca;

public class Orcamento {

	private long numero;
	private Peca peca[];
	private Requerente cliente[];
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Peca[] getPeca() {
		return peca;
	}
	public void setPeca(Peca[] peca) {
		this.peca = peca;
	}
	public Requerente[] getCliente() {
		return cliente;
	}
	public void setCliente(Requerente[] cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
}
