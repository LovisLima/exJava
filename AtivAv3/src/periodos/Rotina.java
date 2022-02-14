package periodos;

import elemento.Maquina;
import lola.Movimento;


public abstract class Rotina extends Maquina implements Movimento {
	
	private int Ciclos;

	public int getCiclos() {
		return Ciclos;
	}

	public void setCiclos(int ciclos) {
		Ciclos = ciclos;
	}
	
	
	
	

}
