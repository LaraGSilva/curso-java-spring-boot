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
					
			}

		} while (opcao != 7);
	}
}
