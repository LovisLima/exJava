package secretaria;
import coordenacao.Professor;

public class Aluno extends Pessoa {
	
	private long ra;
	private Professor professor;
	
	
	public long getRa() {
		return ra;
	}
	public void setRa(long ra) {
		this.ra = ra;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	

}
