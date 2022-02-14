package vendas;

import crm.Cliente;

public class Pedido {
	
	private long numero;
	private Cliente solicitante;
	private Produto item[];
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Cliente getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Cliente solicitante) {
		this.solicitante = solicitante;
	}
	public Produto[] getItem() {
		return item;
	}
	public void setItem(Produto[] item) {
		this.item = item;
	}
	

}
