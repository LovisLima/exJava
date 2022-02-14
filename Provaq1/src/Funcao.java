
public abstract class Funcao extends Processo implements FuncaoB ,Componente, Sistema {
	
	private String tipo;
	 
	public double soma() {
		 return 0;
	 }
	
	
	public int conta () {
		return 0;
	}
	
	public void gera() {
		
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
