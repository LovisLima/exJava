package frota;

import rh.Funcionario;

public class Autorizacao {
	public Autorizacao() {
		
	}
	
	private long numero;
	private String data;
	private Funcionario responsavel;
	
	
	
	public Funcionario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}
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
	
	
	
	
	
	

}
