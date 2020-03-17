import java.util.List;

public class OperacoesBanco extends Correntista {
	private String cpfCliente;
	private float saldo;

	public OperacoesBanco() {
		super();
	}

	public OperacoesBanco(String cpfCliente, float saldo) {
		super(cpfCliente, saldo);
		this.cpfCliente = cpfCliente;
		this.saldo = saldo;
	}

	public void encontraCorrentista(List<OperacoesBanco> correntistas, String cpf_correntista) {
		Boolean achar = true;
		for (int a = 0; a < correntistas.size(); a++) {
			if (cpf_correntista == correntistas.get(a).cpfCliente) {
				System.out.println(
						"Usuario localizado, seu saldo atual é de: " + correntistas.get(a).getSaldo() + "reais.");
				achar = false;
				break;
			}
		}
		if (achar == true) {
			System.out.println("Null");
		}
	}

	public String getCPFcliente() {

		return cpfCliente;
	}

	public float getSaldo() {
		return saldo;
	}

}