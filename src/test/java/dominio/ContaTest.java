package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {

	
	@Test
	void deveSerPossivelTransferirParaOutraConta(){
		//preparação
		Conta contaOrigem = new Conta();
		contaOrigem.depositar(100);  
		Conta contaDestino = new Conta();
		
		
		//execucao
		contaOrigem.trasferir(100, contaDestino);
		
		
		//validação 
		Assertions.assertTrue(contaOrigem.getSaldo() == 0);
		Assertions.assertTrue(contaDestino.getSaldo() == 100);
	}
	
	
	
}
