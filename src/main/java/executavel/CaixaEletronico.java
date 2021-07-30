package executavel;

public class CaixaEletronico {

	public void retirar(int valor) {
		int notas[] = { 100, 50, 20, 10, 2 };
		int i = 0;
		int quantidadeDeNotas[] = new int[notas.length]; // enquanto o resto for divisivel pelas notas a divisao
															// contunua
		while (valor > 0) {
			while (valor >= notas[i]) {
				valor -= notas[i];
				quantidadeDeNotas[i]++;
			}
			System.out.println("O numero de notas de R$" + notas[i] + " é " + quantidadeDeNotas[i]);
			i++;
		}
	}


}
