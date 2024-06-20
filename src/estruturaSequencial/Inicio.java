package estruturaSequencial;

import java.util.*;

public class Inicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		String nome = "Lara";
		double salario = 3500.89899990;
		char sexo = 'F';
		int idade = 20;
		double metros = 164.4;

		System.out.println("O nome dela é " + nome);
		System.out.printf("O salario dela é %.2f%n", salario);
		System.out.println("O sexo dela é " + sexo);
		System.out.println("A idade dela é " + idade);
		System.out.printf("Os metros são =  %.2f metros%n", metros);

		// Usando o printF não é necessario ficar colocando texto e
		// variavel tudo junto. Da para colocar tudo em uma linha, usar o format
		// e depois colocar as variaveis como argumentos no fim dos parenteses
		//%f = ponto flutuante 
		//%d= inteiro 
		//%s =texto 
		//%n= quebra a linha

		// System.out.printf("podemos formatar o valor da seguinte %.2f variavel%n");
		System.out.printf("o nome é %s, o salario é %.2f salario%n, a idade é %d e os metros são %.2f metros%n", nome,
				salario, idade, metros);

		double idade2 = 15.55;

		// Boa pratica é indicar o tipo de dado que voce esta usando, entao se for
		// double colocar um .0 e um float usar uF depois do numero.

		int a, b;
		double resultado;

		a = 5;
		b = 2;

		resultado = (double) a / b;
		System.out.println(resultado);

		System.out.println("Digite o seu nome: ");
		String name = sc.next();

		System.out.printf("Seu nome é " + name);

		System.out.println("Digite a sua idade: ");
		int age = sc.nextInt();
		System.out.println(age);

		System.out.println("Digite o seu salario: ");
		double salary = sc.nextDouble();
		System.out.println(salary);

		System.out.println(Locale.getDefault());
		sc.close();

		
		String n1, n2, n3;
		
		n1 = sc.nextLine();
		n2 = sc.nextLine();
		n3 = sc.nextLine();
		
	}

}