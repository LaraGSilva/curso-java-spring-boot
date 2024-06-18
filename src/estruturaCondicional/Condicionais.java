package estruturaCondicional;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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

				if (numero % 2 == 0) {
					System.out.println("Esse numero é par");
				} else {
					System.out.println("Esse numero é impar");
				}
				break;
			case 3:
				System.out.println("Digite o valor de A: ");
				int a = sc.nextInt();
				sc.nextLine();
				System.out.println("Digite o valor deB: ");
				int b = sc.nextInt();
				sc.nextLine();

				if (a % b == 0) {
					System.out.println("São multiplos");
				} else if (b % a == 0) {
					System.out.println("São multiplos");
				} else {
					System.out.println("Não são multiplos");
				}
				break;

			case 4:
				sc.nextLine();
				System.out.println("Digite o horario inicial do jogo: ");
				String horaInicial = sc.nextLine();

				System.out.println("Digite o horario final  do jogo: ");
				String horaFinal = sc.nextLine();

				DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");

				LocalTime timeInicial = null;
				LocalTime timeFinal = null;

				timeInicial = LocalTime.parse(horaInicial, timeFormat);
				System.out.println("Hora " + timeInicial);
				timeFinal = LocalTime.parse(horaFinal, timeFormat);
				System.out.println("Hora " + timeFinal);

				long duracaoHours = ChronoUnit.HOURS.between(timeInicial, timeFinal);
				long duracaoMin = ChronoUnit.MINUTES.between(timeInicial, timeFinal);
				long duracaoHora = duracaoMin / 60;
				long duracaoFinal = duracaoMin % 60;

				// System.out.println("A duração do jogo foi de : " + duracaoHours);
				// System.out.println("A duração do jogo foi de: " + duracaoFinal );
				// System.out.println(duracaoMin);

				String duracaoFormatada = String.format("%02d:%02d", duracaoHora, duracaoFinal);
				System.out.println("A duração foi de " + duracaoFormatada);

				break;
			case 5:
				/*
				 * String order1 = "Cachorro Quente"; String order2 = "X-Salada"; String order3
				 * = "X-Bacon"; String order4 = "Torrada Simples"; String order5 = "Refrigente";
				 */
				System.out.println("Digite o numero do que deseja pedir: ");
				int pedido = sc.nextInt();
				System.out.println("Digite a quantidade: ");
				int quantidade = sc.nextInt();

				double CachorroQuente = 4.00;
				double XSalada = 4.50;
				double XBacon = 5.00;
				double TorradaSimples = 2.00;
				double Refrigente = 1.50;

				double total1 = 0;
				if (pedido == 1) {
					total1 = CachorroQuente * quantidade;

				} else if (pedido == 2) {
					total1 = XSalada * quantidade;

				} else if (pedido == 3) {
					total1 = XBacon * quantidade;

				} else if (pedido == 4) {
					total1 = TorradaSimples * quantidade;

				} else if (pedido == 5) {
					total1 = Refrigente * quantidade;

				}

				System.out.printf("O total a pagar é %.2f", total1);
			}

			
		} while (opcao != 7);
		sc.close();
	}
}
