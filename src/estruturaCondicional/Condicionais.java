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
				double opcaoComida;
				do {
				System.out.println("Digite as opções que voce escolheu \n 1-Qc\n 2-xsalada \n 3-xbacon \n 4- torrada simples \n 5-refrigerante");
				 opcaoComida = sc.nextInt();
				 
				 System.out.println("Voce escolheu as opções: " + opcaoComida);
				 
				if(opcaoComida == CQ) {
					//total = opcaoComida * qntd;
					
				}
				
				// Pode ler tudo como um vetor e atribuir os elemento a outras variáveis:
				//String peca1[] = entrada.nextLine().split(" ");
				//int peca1Quant = Integer.parseInt(peca1[1]);
				//double peca1Valor = Double.parseDouble(peca1[2]);
				 
				}while (opcaoComida != 0);
				
			case 6:
				System.out.println("Digite um valor");
				double valor = sc.nextDouble();
				
				if (valor > 0 && valor < 25) {
					System.out.println("Intervalo (0,25]");
				}else if(valor > 25 && valor < 50) {
					System.out.println("Intervalo (25,50]");
				}else if(valor > 50 && valor < 75) {
					System.out.println("Intervalo (50, 75]");
				}else if(valor > 75 && valor < 100) {
					System.out.println("Intervalo (75,100]");
				}else {
					System.out.println("Fora do intervalo");
				}
					
				break;
				
			case 7:
				
				break;
			}

			sc.close();
		} while (opcao != 7);
	}
}
