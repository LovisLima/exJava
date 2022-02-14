package transporte;

import crm.Proprietario;
import estoque.Container;

public class Navio {
	private long numero;
	private String nome;
	private Container container[];
	private Proprietario proprietario;
	
	
	
	public Container[] getContainer() {
		return container;
	}
	public void setContainer(Container[] container) {
		this.container = container;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
