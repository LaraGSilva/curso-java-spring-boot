package estruturaRepetitivas;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {

		/*
		 * While é uma estrutura utilizada quando nao sabemos a quantiade de vezes que a
		 * repeticao deve acontecer, entao a repeticao obedece a condicao se for verdade
		 * e para se for falsa
		 */

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int soma = 0;

		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.printf("Soma:%d", soma);

		sc.close();
	}
}
