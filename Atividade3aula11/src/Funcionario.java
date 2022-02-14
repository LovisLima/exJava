
public abstract class Funcionario {
	
	private String nome;
	private double remuneracao;
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getRemuneracao() {
		return remuneracao;
	}



	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}



	public abstract double calculaRecebimento();
	

}
