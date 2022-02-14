package frota;

import transporte.Viagem;

public class Veiculo {

	public Veiculo(){
		
	}
	
	private String placa;
	private long km;
	private Viagem viagem;
	

	public Viagem getViagem() {
		return viagem;
	}
	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public long getKm() {
		return km;
	}
	public void setKm(long km) {
		this.km = km;
	}
	
	
		
}
