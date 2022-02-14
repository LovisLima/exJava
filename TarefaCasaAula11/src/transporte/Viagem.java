package transporte;

import frota.Autorizacao;

public class Viagem {
	public Viagem() {
	
	}
	
	private String data;
	private long km;
	private Motorista motorista [];
	private Autorizacao autorizacao;
	
	
	
	public Autorizacao getAutorizacao() {
		return autorizacao;
	}
	public void setAutorizacao(Autorizacao autorizacao) {
		this.autorizacao = autorizacao;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public long getKm() {
		return km;
	}
	public void setKm(long km) {
		this.km = km;
	}
	public Motorista[] getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista[] motorista) {
		this.motorista = motorista;
	}
	
	

}
