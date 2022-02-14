
public class NotaFiscal extends Documento implements Pagamentos {
	
	public double total;
	public Item item[];

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	public  double pagarTotal() {
		return 0;
	}
	
	public double pagarJuros() {
		return 0;
	}
	
	
	

}
