package executavel;

import java.util.Scanner;


public class EntradaDados {

	public static void main(String[] args) {
	 
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o valor a ser sacado:");
		int valor = entrada.nextInt();
		
		
		
		CaixaEletronico.retirar(valor);

	}

}
