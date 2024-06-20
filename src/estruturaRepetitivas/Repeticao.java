package estruturaRepetitivas;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * While é uma estrutura utilizada quando nao sabemos a quantiade de vezes que a
		 * repeticao deve acontecer, entao a repeticao obedece a condicao se for verdade
		 * e para se for falsa
		 */
		int opcao = 0;
		do {
			System.out.println("Digite uma opcao");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite um numero: ");
				int x = sc.nextInt();

				int soma = 0;

				while (x != 0) {
					soma += x;
					x = sc.nextInt();
				}
				System.out.printf("Soma:%d", soma);
				break;

			case 2:
				System.out.println("Digite a senha correta");
				int senha = sc.nextInt();

				while (senha != 2002) {
					System.out.println("Tente novamente");
					senha = sc.nextInt();
				}

				System.out.println("Acesso permitido");
				break;

			case 3:

				System.out.println("Digite o valor de w: ");
				int w = sc.nextInt();

				System.out.println("Digite o valor de z: ");
				int z = sc.nextInt();

				while (w != 0 && z != 0) {

					if (w == 0 && z == 0) {
						System.out.println("O ponto esta na origem");
					} else if (w > 0 && z > 0) {
						System.out.println("O ponto esta no Q1");
					} else if (w < 0 && z < 0) {
						System.out.println("O ponto esta no Q3");
					} else if (w > 0 && z < 0) {
						System.out.println("O ponto esta no Q4");
					} else if (w < 0 && z > 0) {
						System.out.println("O ponto esta no Q2");
					} else {
						System.out.println("O ponto nao esta em nehum lugar");
					}
					break;
				}

			case 4:
				System.out.println("Digite o codigo que deseja avaliar: ");
				int codigo = sc.nextInt();
				int soma1 = 0;
				int soma2 = 0;
				int soma3 = 0;
				while (codigo != 4) {
					if (codigo == 1) {
						soma1 += 1;
						System.out.printf("Alcool: %d", soma1);
					} else if (codigo == 2) {
						soma2 += 1;
						System.out.printf("Gasolina: %d", soma2);
					} else if (codigo == 3) {
						soma3 += 1;
						System.out.printf("Diesel: %d", soma3);
					}else {
						System.out.println("Obrigada");
					}
					
					codigo = sc.nextInt();
				}

			}

		} while (opcao != 2);

		sc.close();
	}
}