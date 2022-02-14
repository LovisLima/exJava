
public class Pedido {

	
	private long numero;
	private double total;
	private Produto Item[];
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Produto[] getItem() {
		return Item;
	}
	public void setItem(Produto[] item) {
		Item = item;
	}
	
	
	
	
	
	
}
