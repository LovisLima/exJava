
public abstract class Software  implements Rede{

	
	private String nome;
	private String linguagem;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	public boolean enviar() {
		return true;
	
	
	}
	
	public boolean receber() {
		return true;
		
	}
	
	public boolean logar() {
		return true;
	}
	
	public void registrar() {
		
	}
	
	public void logout() {
		
	}
	
	
	
}
