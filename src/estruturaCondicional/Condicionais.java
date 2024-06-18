package estruturaCondicional;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n ########### Digite a opção que deseja ########### \n");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:

				System.out.println("Digite um numero");
				int number = sc.nextInt();

				if (number >= 0) {
					System.out.println("Esse numero é positivo");
				} else if (number < 0) {
					System.out.println("Esse numero é negatvio");
				}
				break;
			case 2:
				System.out.println("Digite um numero");
				int numero = sc.nextInt();
				
				if (numero % 2  == 0) {
					System.out.println("Esse numero é par");
				}else {
					System.out.println("Esse numero é impar");
				}
				break;
			case 3:
				System.out.println("Digite o valor de A: ");
				int a = sc.nextInt();
				System.out.println("Digite o valor deB: ");
				int b = sc.nextInt();
				
				if(a % b  == 0) {
					System.out.println("São multiplos");
				}else if (b % a  == 0){
					System.out.println("São multiplos");
				}else {
					System.out.println("Não são multiplos");
				}
				break;
				
			case 4:
				System.out.println("Digite a duracao do jogo: ");
				double horario = sc.nextDouble();
				
				if (horario > 24) {
					System.out.println("O jogo durou mais de um dia");
				}else {
					System.out.println(" O joo durou: " + horario);
				}
				break;
				
			case 5:
				double CQ = 4.00;
				double xsalada = 4.50;
				double xbacon = 5.00;
				double torradaSimples = 2.00;
				double refrigerante = 1.50;
				int opcaoComida;
				do {
				System.out.println("Digite as opções que voce escolheu \n 1-Qc\n 2-xsalada \n 3-xbacon \n 4- torrada simples \n 5-refrigerante");
				 opcaoComida = sc.nextInt();
				 System.out.println("Voce escolheu as opções: " + opcaoComida);
				 
				 int[] pedido = new int[5];
				 for(i <0; pedido.length)
				}while (opcaoComida != 0);
			}

			sc.close();
		} while (opcao != 7);
	}
}
