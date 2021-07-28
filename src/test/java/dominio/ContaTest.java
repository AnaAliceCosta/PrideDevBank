package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {
	@Test
	void deveSerPossivelRealizarSaqueQuandoTenhoSaldo(){
		Conta conta = new Conta();
		conta.depositar(100);  
		conta.sacar(100);
		
		Assertions.assertTrue(conta.getSaldo() == 0);
	}
	
	
	@Test
	void deveSerPossivelTransferirParaOutraConta(){
		Conta contaOrigem = new Conta();
		contaOrigem.depositar(100);  
		Conta contaDestino = new Conta();
		
		contaOrigem.trasferir(100, contaDestino);
		
		Assertions.assertTrue(contaOrigem.getSaldo() == 0);
		Assertions.assertTrue(contaDestino.getSaldo() == 100);
	}
	
}
