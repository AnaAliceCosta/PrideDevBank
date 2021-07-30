package tmp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dominio.Conta;

public class ContaTest {
	@Test
	void deveFuncionarForaDoPacote(){
		//Preparação
		Conta conta = new Conta();
		
		
		//Execução
		conta.depositar(100);
		
		
		//validação
		Assertions.assertTrue(conta.getSaldo() == 100);
	}
}
