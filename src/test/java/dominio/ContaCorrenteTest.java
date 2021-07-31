//package dominio;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import Exceptions.SaldoInsufucienteException;
//
//public class ContaCorrenteTest {
//	ContaCorrente contaCorrente ;
//	
//	@BeforeEach
//	void inicial(){
//		contaCorrente = new ContaCorrente();
//		contaCorrente.depositar(100);
//	}
//	
//	@Test
//	void deveSerpossivelSacarUtilizandoChequeEspecial() {
//		
//		
//		
//		contaCorrente.sacar(101);
//		
//		
//		assertTrue(contaCorrente.getSaldo() == -1);
//		
//	}
//	
//	
//	@Test
//	void deveDarErroQuandoTendarSacarAcimaDoCheqeEspecialSomadoAoSaldo() {
//		
//		Assertions.assertThrows(SaldoInsufucienteException.class, 
//				()-> contaCorrente.sacar(1000));
//	}
//
//}
