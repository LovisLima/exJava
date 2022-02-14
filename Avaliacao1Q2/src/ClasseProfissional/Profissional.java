package ClasseProfissional;

import Certificacoes.Certificado;
import Creditacao.Acreditado;

public class Profissional {
	
	public String classeReguladora;
	public String Name;
	public String Contato;
	public Certificado certificado;
	public Acreditado acreditado;
	
	
	public String getClasseReguladora() {
		return classeReguladora;
	}
	public void setClasseReguladora(String classeReguladora) {
		this.classeReguladora = classeReguladora;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContato() {
		return Contato;
	}
	public void setContato(String contato) {
		Contato = contato;
	}

	
	
}
