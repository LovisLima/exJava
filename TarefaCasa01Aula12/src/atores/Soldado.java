package atores;
import recursos.Arma;
public class Soldado extends Bot {
	public Soldado () {
		
	}
	private String tropa;
	private Arma arma;
	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public String getTropa() {
		return tropa;
	}

	public void setTropa(String tropa) {
		this.tropa = tropa;
	}
	
	public double calculavida() {
		
		return this.getSaude() * 1/getForca() * 12;
	}
}
