package lola;


public interface Movimento {
	
	public int distancia = 1;
	
	public abstract void anda(int passos);
	
	public abstract int pos(); 

}
