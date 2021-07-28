package executavel;

import dominio.Conta;
import dominio.ContaCorrente;
import dominio.ContaPoupanca;

public class EntradaDados {

	public static void main(String[] args) {
	
		Conta contaAna = new Conta();
		
		contaAna.setChavePix("11992188351");
		contaAna.depositar(100);
		
		ContaCorrente contaDaGi = new ContaCorrente();

		System.out.println("conta da Gi: " +contaDaGi.getSaldo());
		
		
		System.out.println("saldo " + contaAna.getSaldo());
		System.out.println("chavePix " + contaAna.getChavePix());
		System.out.println("saldo anterior "+ contaAna.getSaldo());
		
		contaAna.trasferir(10, contaDaGi);
		System.out.println("novo saldo "+ contaAna.getSaldo());
		
		System.out.println("Novo saldo Gi "+ contaDaGi.getSaldo());
	}

}
