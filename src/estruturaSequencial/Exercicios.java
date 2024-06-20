package estruturaSequencial;

import java.util.Scanner;

public class Exercicios {

	public double calculaSalario(double horasTrabalhadas, double valorHora) {

		double salario = horasTrabalhadas * valorHora;
		return salario;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao;
		do {
			System.out.println("\n ******************** Digite a opção que deseja: *****************\n");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				int n1, n2, resultado;

				System.out.println("Digite um valor: ");
				n1 = sc.nextInt();

				System.out.println("Digite o segundo valor: ");
				n2 = sc.nextInt();

				resultado = n1 + n2;

				System.out.printf("O resultado da soma entre os dois numeros é: %d", resultado);
				break;

			case 2:
				double pi = 3.14159;
				double raio;
				double area;

				System.out.println("Digite o valor do raio: ");
				raio = sc.nextDouble();
				System.out.println(raio);

				double raioElevado = Math.pow(raio, 2.0);
				area = pi * raioElevado;

				System.out.printf("A area do circulo é %.2f", area);
				break;

			case 3:
				int a, b, c, d, diferenca;

				System.out.println("Digite o valor de A: ");
				a = sc.nextInt();

				System.out.println("Digite o valor de B: ");
				b = sc.nextInt();

				System.out.println("Digite o valor de C: ");
				c = sc.nextInt();

				System.out.println("Digite o valor de D: ");
				d = sc.nextInt();

				diferenca = (a * b) - (c * d);
				System.out.printf("A diferença é %d", diferenca);

				break;

			case 4:
				System.out.println("Digite o numero do funcionario: ");
				int number = sc.nextInt();

				System.out.println("Digite as horas trabalhadas: ");
				double horasTrabalhadas = sc.nextDouble();

				System.out.println("Digite o valor da hora trabalhada: ");
				double valorHora = sc.nextDouble();
				Exercicios exc = new Exercicios();

				double salario = exc.calculaSalario(horasTrabalhadas, valorHora);
				System.out.println("Horas trabalhadas: " + horasTrabalhadas);
				System.out.println("Valor da hora: " + valorHora);
				System.out.println("Salário calculado: " + salario);

				break;

			case 5:
				System.out.println("Digite a quantidade de camisetas compradas: ");
				int quantidade = sc.nextInt();

				System.out.println("Digite o valor de cada camiseta: ");
				double valor = sc.nextDouble();

				double pgt = quantidade * valor;
				System.out.printf("Valor a pagar: %.2f", pgt);
				break;

			case 6:
				System.out.println("Digite o valor de A: ");
				double A = sc.nextDouble();
				
				System.out.println("Digite o valor de B: ");
				double B = sc.nextDouble();
				
				System.out.println("Digite o valor de C: ");
				double C = sc.nextDouble();
				
				double pi2 = 3.14159;
				double triangulo = (A*C)/2;
				double circulo = pi2 *  Math.pow(C, 2.0);
				double trapezio = (A + B)*C/2;
				double quadrado = Math.pow(B, 2.0);
				double retangulo = A * B;
				
				
				System.out.printf("triangulo: %.2f\n", triangulo);
				System.out.printf("circulo: %.2f\n", circulo);
				System.out.printf("trapezio: %.2f\n", trapezio);
				System.out.printf("quadrado: %.2f\n", quadrado);
				System.out.printf("retangulo: %.2f\n", retangulo);
			}
		} while (opcao != 6);

	}
}