
public class Principal {
Aluno a1;

	public static void main (String args[]) {
	
	Principal p = new Principal();
	p.entraDados();
	p.mostraDados();
	}


	public void entraDados() {
		a1 = new Aluno();
		a1.setRa(1234);
		a1.setNome("Maria Chiquinha");
		a1.setCidade("Araraquara");
	}
	
	
	public void mostraDados() {
		System.out.println("Ra:" + a1.getRa());
		System.out.println("Nome:" + a1.getNome());
		System.out.println("Cidade:" + a1.getCidade());
		
		
	
		
	}
}
