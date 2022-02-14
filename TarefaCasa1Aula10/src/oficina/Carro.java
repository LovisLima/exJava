package oficina;

import equipe.Piloto;

public class Carro {
	private long numero;
	private int potencia;
	private Piloto piloto [];
	private Pneus pneus [];
	
	

	public Pneus[] getPneus() {
		return pneus;
	}
	public void setPneus(Pneus[] pneus) {
		this.pneus = pneus;
	}
	public Piloto[] getPiloto() {
		return piloto;
	}
	public void setPiloto(Piloto[] piloto) {
		this.piloto = piloto;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	

}
