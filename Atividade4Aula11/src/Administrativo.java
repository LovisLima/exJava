
public class Administrativo extends Funcionario {
	
	private long Ctps;
	private long Horas_extras;
	public long getCtps() {
		return Ctps;
	}
	public void setCtps(long ctps) {
		Ctps = ctps;
	}
	public long getHoras_extras() {
		return Horas_extras;
	}
	public void setHoras_extras(long horas_extras) {
		Horas_extras = horas_extras;
	}
	
	
	public double calculaRecebimento() {
		
		return this.getRemuneracao() + this.getHoras_extras();
	}
}
