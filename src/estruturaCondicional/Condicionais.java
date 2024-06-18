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
                        System.out.println("Esse numero é negativo");
                    }
                    break;

                case 2:
                    System.out.println("Digite um numero");
                    int numero = sc.nextInt();

                    if (numero % 2 == 0) {
                        System.out.println("Esse numero é par");
                    } else {
                        System.out.println("Esse numero é ímpar");
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor de A: ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o valor de B: ");
                    int b = sc.nextInt();
                    sc.nextLine();

                    if (a % b == 0) {
                        System.out.println("São múltiplos");
                    } else if (b % a == 0) {
                        System.out.println("São múltiplos");
                    } else {
                        System.out.println("Não são múltiplos");
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("Digite o horário inicial do jogo (HH:mm): ");
                    String horaInicial = sc.nextLine();

                    System.out.println("Digite o horário final do jogo (HH:mm): ");
                    String horaFinal = sc.nextLine();

                    DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");

                    LocalTime timeInicial = LocalTime.parse(horaInicial, timeFormat);
                    System.out.println("Hora inicial: " + timeInicial);
                    LocalTime timeFinal = LocalTime.parse(horaFinal, timeFormat);
                    System.out.println("Hora final: " + timeFinal);

                    long duracaoMin = ChronoUnit.MINUTES.between(timeInicial, timeFinal);
                    long duracaoHora = duracaoMin / 60;
                    long duracaoFinal = duracaoMin % 60;

                    String duracaoFormatada = String.format("%02d:%02d", duracaoHora, duracaoFinal);
                    System.out.println("A duração foi de " + duracaoFormatada);
                    break;

                case 5:
                    double CQ = 4.00;
                    double xsalada = 4.50;
                    double xbacon = 5.00;
                    double torradaSimples = 2.00;
                    double refrigerante = 1.50;
                    int opcaoComida;
                    do {
                        System.out.println(
                            "Digite as opções que você escolheu \n 1-Qc\n 2-xsalada \n 3-xbacon \n 4- torrada simples \n 5-refrigerante");
                        opcaoComida = sc.nextInt();
                        sc.nextLine(); // Limpar o buffer após nextInt()
                        System.out.println("Você escolheu as opções: " + opcaoComida);

                        // Pode ler tudo como um vetor e atribuir os elementos a outras variáveis:
                        // String peca1[] = entrada.nextLine().split(" ");
                        // int peca1Quant = Integer.parseInt(peca1[1]);
                        // double peca1Valor = Double.parseDouble(peca1[2]);
                    } while (opcaoComida != 0);
                    break;

                case 6:
                    System.out.println("Digite um valor");
                    double valor = sc.nextDouble();

                    if (valor > 0 && valor < 25) {
                        System.out.println("Intervalo (0,25]");
                    } else if (valor > 25 && valor < 50) {
                        System.out.println("Intervalo (25,50]");
                    } else if (valor > 50 && valor < 75) {
                        System.out.println("Intervalo (50, 75]");
                    } else if (valor > 75 && valor < 100) {
                        System.out.println("Intervalo (75,100]");
                    } else {
                        System.out.println("Fora do intervalo");
                    }
                    break;

                case 7:
                    break;
            }
        } while (opcao != 7);

        sc.close();
    }
}
