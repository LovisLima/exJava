
public class Diretoria extends Funcionario {

	
	private double total_acoes;
	
	
	
	public double getTotal_acoes() {
		return total_acoes;
	}



	public void setTotal_acoes(double total_acoes) {
		this.total_acoes = total_acoes;
	}



	public double calculaRecebimento() {
		
		return this.getRemuneracao() + this.getTotal_acoes();
	}



	}

