package atores;

public class Capelao extends Bot{
	
	public Capelao() {
		
	}
	
	private String religiao;

	public String getReligiao() {
		return religiao;
	}

	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}
	
	public double calculavida() {
		
		return this.getSaude()/getForca() * 1.10;
	}
	
}
