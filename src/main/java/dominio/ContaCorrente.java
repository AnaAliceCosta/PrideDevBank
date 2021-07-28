package dominio;

public class ContaCorrente extends Conta{
	private float chequeEspecial = 100;
	

	@Override
	public void sacar(float valorSaque)  {
		if (valorSaque  <= this.saldo + chequeEspecial) {
			this.saldo = this.saldo - valorSaque;
		}else{
			throw new RuntimeException("Saldo insuficiente");
		}
	}

	
}
