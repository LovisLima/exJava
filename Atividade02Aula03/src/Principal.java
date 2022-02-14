
public class Principal {

aluno a1;
professor p1;
	
	public static void main (String args[]) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
		
		public void entraDados() {
			a1 = new aluno();
			a1.setRa(1234);
			a1.setNome("Marilene de Moraes");
			a1.setEnem(870);
			
		}
		
		
		
		public void mostraDados() {
			
			System.out.println("RA Aluno   : " + a1.getRa());
			System.out.println("Nome Aluno : " + a1.getNome());
			System.out.println("Enem Aluno : " + a1.getEnem());
			
	}
	
}
