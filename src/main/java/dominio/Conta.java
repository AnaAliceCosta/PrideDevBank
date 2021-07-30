package dominio;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	String numeroConta;
	protected String numeroAgencia;
	protected float saldo;
	protected String tipoConta;
	protected String cpfCorrentista;
	protected String nomeCorrentista;
	protected String chavePix[] = new String[3]; // email, cpf, telefone

	public float getSaldo() {
		return saldo;

	}

	public String getChavePix(int pos) {
		return chavePix[pos];
	}

	public void adicionarChavePix(String novaChave) {

		if (chavePix[0] == null) {
			chavePix[0] = novaChave;
		} else {
			if (chavePix[1] == null) {
				chavePix[1] = novaChave;
			}else {
				chavePix[2] = novaChave;
			}
		}
	}

	public void depositar(float valorDepositado) {
		this.saldo += valorDepositado;
	}

	public void trasferir(float valor, Conta contaDestino) {

	}

}
