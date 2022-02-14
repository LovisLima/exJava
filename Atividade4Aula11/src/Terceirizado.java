
public class Terceirizado extends Funcionario {
	
	private long contrato;
	private double valor;
	
	
	
	public long getContrato() {
		return contrato;
	}

	


	public void setContrato(long contrato) {
		this.contrato = contrato;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public double calculaRecebimento() {

		return this.getRemuneracao() + this.valor;
		
}

}