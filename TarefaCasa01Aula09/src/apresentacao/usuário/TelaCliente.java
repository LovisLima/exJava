package apresentacao.usuário;

import apresentacao.logica.Validacao;
import negocio.Componente;
import negocio.Constante;

public class TelaCliente extends Tela {
	
	private String titulo;
	private Validacao validacao;
	private Componente componente;
	private Constante constante;
	
	

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}

	public Constante getConstante() {
		return constante;
	}

	public void setConstante(Constante constante) {
		this.constante = constante;
	}

	public Validacao getValidacao() {
		return validacao;
	}

	public void setValidacao(Validacao validacao) {
		this.validacao = validacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	

}
