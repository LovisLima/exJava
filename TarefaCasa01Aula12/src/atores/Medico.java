package atores;
import recursos.Remedio;
public class Medico extends Bot {
	public Medico() {
	}
	private String companhia;
	private Remedio remedio;
	public Remedio getRemedio() {
		return remedio;
	}
	public void setRemedio(Remedio remedio) {
		this.remedio = remedio;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	public double calculavida() {
		
		return this.getSaude()*getForca() * 0.12;
	}
	
}