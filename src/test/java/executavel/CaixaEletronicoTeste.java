package executavel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaixaEletronicoTeste {
	@Test
	void deveSerPossivelSacar() {
		int[] quantidadeDeNotas = CaixaEletronico.retirar(100);
			
		Assertions.assertTrue(quantidadeDeNotas[0] == 1);
	}

}
