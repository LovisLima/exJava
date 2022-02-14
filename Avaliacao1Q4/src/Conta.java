
public class Conta {
	
	public int Id;
	public String BankName;
	public String BankAccount;
	public Cartao cartao;
	public Emprestimo emprestimo;
	public double saldo;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getBankAccount() {
		return BankAccount;
	}
	public void setBankAccount(String bankAccount) {
		BankAccount = bankAccount;
	}
	public Cartao getCartao() {
		return cartao;
	}
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	public Emprestimo getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	public double calculaMovimento() {
		double valorCartao = new Cartao().getValor();
		double valorEmprestimo = new Emprestimo().getValue();
		double movimentoTotal = this.saldo - valorCartao + valorEmprestimo;
		return movimentoTotal;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	

	
	
}
