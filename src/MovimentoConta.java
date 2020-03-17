public class MovimentoConta extends Correntista {
	private String cpf_cliente;
	private float movimentacao;

	public MovimentoConta(String cpfCliente, float saldo) {
		super(cpfCliente, saldo);
		this.movimentacao = saldo;
		this.cpf_cliente = cpfCliente;
	}

	public String getCPFCorrentista() {

		return cpf_cliente;
	}

	public float getValorMovimento() {
		return movimentacao;
	}
}
