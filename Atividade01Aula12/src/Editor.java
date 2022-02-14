
public abstract class Editor implements Impressao {
	private String nome;
	private int linhas;
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public void imprimir() {

	}

	public void limparCache(){
		
	}
	
	public boolean getStatusImpressora() {
	return true;
		
	}
	
}