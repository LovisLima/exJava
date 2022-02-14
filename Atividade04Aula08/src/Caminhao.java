
public class Caminhao {

	private String placa;
	private int ano;
	Pedido pedido[];
	private Carreta carreta[];
	
	public Carreta[] getCarreta() {
		return carreta;
	}
	public void setCarreta(Carreta[] carreta) {
		this.carreta = carreta;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Pedido[] getPedido() {
		return pedido;
	}
	public void setPedido(Pedido[] pedido) {
		this.pedido = pedido;
	}
	
	
	
}
