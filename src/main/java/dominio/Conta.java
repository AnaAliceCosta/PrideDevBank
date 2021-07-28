package dominio;

public class Conta {
	String numeroConta;
	protected String numeroAgencia;
	protected float saldo;
	protected String tipoConta;
	protected String cpfCorrentista;
	protected String nomeCorrentista;
	protected String chavePix;

	public float getSaldo() {
		return saldo;

	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

	public void depositar(float valorDepositado) {
		this.saldo += valorDepositado;
	}

	public void sacar(float valorSaque)  {

		if (valorSaque  <= this.saldo) {
			this.saldo = this.saldo - valorSaque;
		}else{
			throw new RuntimeException("Saldo insuficiente");
		}
	}
	
	public void trasferir(float valorTransferencia, Conta outraConta) {
		this.sacar(valorTransferencia);
		outraConta.depositar(valorTransferencia);
		
	}

}
