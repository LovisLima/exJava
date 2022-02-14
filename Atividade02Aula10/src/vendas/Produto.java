package vendas;

public class Produto {
	private long codigo;
	private String data;
	private Pedido pedido[];
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Pedido[] getPedido() {
		return pedido;
	}
	public void setPedido(Pedido[] pedido) {
		this.pedido = pedido;
	}
	
	

}
