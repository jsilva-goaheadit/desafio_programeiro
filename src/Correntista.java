public class Correntista {
	private String cpfCliente; // cpf do correntista
	private float saldo; // saldo da conta
	
	public Correntista() {
		
	}
	
	public Correntista(String cpfCliente, float saldo) {
		this.setCpfCliente(cpfCliente);
		this.saldo = saldo;
	}

	public String getCPFCliente() {
		return getCpfCliente();
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
}
