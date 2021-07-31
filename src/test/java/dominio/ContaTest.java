package dominio;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaTest {
	
	Conta conta ;
	@BeforeEach
	void inicial() {
		conta = new Conta();
		conta.depositar(1000);
	}
	
	
	
	@Test
	void deveSerPossivelCriarUmaConta() {
		assertTrue(conta != null);
	}
	
	@Test
	void deveSerPossivelAdicionarUmaChavePix() {

		//execucão
		conta.adicionarChavePix("anaalice.cd@gmail.com");
		//validação
		assertTrue(conta.getChavePix(0).equals("anaalice.cd@gmail.com"));
	}
	@Test
	void deveSerPossivelSacarQuandoTemosLimite() {

		//execução
		conta.sacar(200);
		
		//validação
		assertTrue(800 == conta.getSaldo() );
	}

	@Test
	void deveSerPossivelTransferirParaOutraContaQuandoTemSaldo() {
		Conta contaDestino = new Conta();
		contaDestino.depositar(100);
		
		conta.trasferir(2, contaDestino);
		
		assertTrue(contaDestino.getSaldo() == 102);
	}
	
	
	
	
}
