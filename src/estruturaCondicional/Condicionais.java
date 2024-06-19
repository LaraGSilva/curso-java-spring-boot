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
            sc.nextLine(); // Limpar o buffer após nextInt()

            switch (opcao) {
                case 1:
                    System.out.println("Digite um numero");
                    int number = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer após nextInt()

                    if (number >= 0) {
                        System.out.println("Esse numero é positivo");
                    } else if (number < 0) {
                        System.out.println("Esse numero é negativo");
                    }
                    break;

                case 2:
                    System.out.println("Digite um numero");
                    int numero = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer após nextInt()

                    if (numero % 2 == 0) {
                        System.out.println("Esse numero é par");
                    } else {
                        System.out.println("Esse numero é ímpar");
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor de A: ");
                    int a = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer após nextInt()
                    System.out.println("Digite o valor de B: ");
                    int b = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer após nextInt()

                    if (a % b == 0) {
                        System.out.println("São múltiplos");
                    } else if (b % a == 0) {
                        System.out.println("São múltiplos");
                    } else {
                        System.out.println("Não são múltiplos");
                    }
                    break;

                case 4:
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
                    System.out.println("Digite o numero do que deseja pedir: ");
                    int pedido = sc.nextInt();
                    System.out.println("Digite a quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer após nextInt()

                    double CachorroQuente = 4.00;
                    double XSalada = 4.50;
                    double XBacon = 5.00;
                    double TorradaSimples = 2.00;
                    double Refrigente = 1.50;

                    double total1 = 0;
                    switch (pedido) {
                        case 1:
                            total1 = CachorroQuente * quantidade;
                            break;
                        case 2:
                            total1 = XSalada * quantidade;
                            break;
                        case 3:
                            total1 = XBacon * quantidade;
                            break;
                        case 4:
                            total1 = TorradaSimples * quantidade;
                            break;
                        case 5:
                            total1 = Refrigente * quantidade;
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }

                    System.out.printf("O total a pagar é %.2f", total1);
                    break;

                case 6:
                    System.out.println("Digite um valor");
                    double valor = sc.nextDouble();
                    sc.nextLine(); // Limpar o buffer após nextDouble()

                    if (valor > 0 && valor < 25) {
                        System.out.println("Intervalo (0,25]");
                    } else if (valor >= 25 && valor < 50) {
                        System.out.println("Intervalo [25,50)");
                    } else if (valor >= 50 && valor < 75) {
                        System.out.println("Intervalo [50,75)");
                    } else if (valor >= 75 && valor <= 100) {
                        System.out.println("Intervalo [75,100]");
                    } else {
                        System.out.println("Fora do intervalo");
                    }
                    break;

                case 7:
                    System.out.println("Digite o valor de x");
                    int x = sc.nextInt();
                    System.out.println("Digite o valor de y");
                    int y = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer após nextInt()

                    if (x == 0 && y == 0) {
                        System.out.println("O ponto está na origem");
                    } else if (x > 0 && y > 0) {
                        System.out.println("O ponto está no Q1");
                    } else if (x < 0 && y > 0) {
                        System.out.println("O ponto está no Q2");
                    } else if (x < 0 && y < 0) {
                        System.out.println("O ponto está no Q3");
                    } else if (x > 0 && y < 0) {
                        System.out.println("O ponto está no Q4");
                    } else {
                        System.out.println("O ponto não está em nenhum quadrante");
                    }
                    break;

                case 8:
                    System.out.println("Digite o seu salário: ");
                    double salario = sc.nextDouble();
                    sc.nextLine(); // Limpar o buffer após nextDouble()

                    if (salario > 0.0 && salario < 2000.0) {
                        System.out.println("Isento");
                    } else if (salario >= 2000.01 && salario < 3000.0) {
                        double pagar = salario * 0.08;
                        System.out.printf("Deve pagar = %.2f", pagar);
                    } else if (salario >= 3000.01 && salario < 4500.0) {
                        double pagar = salario * 0.18;
                        System.out.printf("Deve pagar = %.2f", pagar);
                    } else if (salario >= 4500.0) {
                        double pagar = salario * 0.28;
                        System.out.printf("Deve pagar = %.2f", pagar);
                    } else {
                        System.out.println("Fora do range");
                    }
                    break;

                default:
                    System.out.println("Insira um número válido");
                    break;
            }

        } while (opcao != 9);

        sc.close();
    }
}
