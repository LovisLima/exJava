
public abstract class Bot implements Ataque{
 
 
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean anda() {
		return true;
	}
	
	public boolean retorna() {
		return true;
	}
	
	
	public void atira () {
		
	}
	
	public void recarrega() {
		
	}
	
 	
}


