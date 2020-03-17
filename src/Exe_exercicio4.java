import java.util.ArrayList;
import java.util.List;

public class Exe_exercicio4 {

	public static void main(String[] args) {
		List<Correntista> usuarios = new ArrayList<Correntista>();
		usuarios.add(new Correntista("0000000000", 1000f));
		usuarios.add(new Correntista("1111111111", 2000f));
		usuarios.add(new Correntista("2222222222", 3000f));
		usuarios.add(new Correntista("3333333333", 4000f));
		usuarios.add(new Correntista("4444444444", 5000f));

		List<MovimentoConta> movimentacao_bancaria = new ArrayList<MovimentoConta>();
		movimentacao_bancaria.add(new MovimentoConta("0000000000", -500f));
		movimentacao_bancaria.add(new MovimentoConta("1111111111", -500f));
		movimentacao_bancaria.add(new MovimentoConta("2222222222", -500f));
		movimentacao_bancaria.add(new MovimentoConta("3333333333", -500f));
		movimentacao_bancaria.add(new MovimentoConta("4444444444", -500f));

		List<OperacoesBanco> conta_Atualizada = new ArrayList<OperacoesBanco>();

		for (int a = 0; a < usuarios.size(); a++) {
			for (int b = 0; b < movimentacao_bancaria.size(); b++) {

				if (usuarios.get(a).getCPFCliente().equals(movimentacao_bancaria.get(b).getCPFCorrentista())) {

					conta_Atualizada.add(new OperacoesBanco(usuarios.get(a).getCPFCliente(),
							usuarios.get(a).getSaldo() + movimentacao_bancaria.get(b).getValorMovimento()));

					break;
				}
			}
		}
		System.out.println("Usuarios atualizados.");
		
		OperacoesBanco teste = new OperacoesBanco();
		
		teste.encontraCorrentista(conta_Atualizada, "3333333332");

	}
}
