package crm;

import vendas.Pedido;

public class Cliente {
	private String nome;
	private Pedido pedido[];
	private Pedido solicitante;
	
	
	public Pedido getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Pedido solicitante) {
		this.solicitante = solicitante;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pedido[] getPedido() {
		return pedido;
	}
	public void setPedido(Pedido[] pedido) {
		this.pedido = pedido;
	}
	
	
	
	

}
