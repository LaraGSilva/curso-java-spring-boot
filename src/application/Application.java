package application;

import java.util.Scanner;

import entities.Employees;
import entities.Produto;
import entities.Retangulo;
import entities.Studient;
import util.Calculadora;
import util.CurrencyConverter;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Price: ");
		double price = sc.nextDouble();
		String name = sc.nextLine();
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();

		Produto produto = new Produto(name, );
		
		produto.setPrice(price);
		produto.setQuantity(quantity);

		System.out.printf("Product data: $%.2f, %d units, Total: $%.2f\n ", produto.getPrice(), produto.getQuantity(),
				produto.TotalValueInStock());

		System.out.println("Digite a quantiade para adicionar: ");
		quantity = sc.nextInt();
		produto.AddProducts(quantity);
		System.out.printf("Product data: $%.2f, %d units, Total: $%.2f\n ", produto.getPrice(), produto.getQuantity(),
				produto.TotalValueInStock());

		System.out.println("Digite a quantiade para remover: ");
		quantity = sc.nextInt();
		produto.RemoveProducts(quantity);
		System.out.printf("Product data: $%.2f, %d units, Total: $%.2f\n ", produto.getPrice(), produto.getQuantity(),
				produto.TotalValueInStock());

		// exc 2

		System.out.println("Enter the values of the rectangle: ");
		double lado1 = sc.nextDouble();
		double lado2 = sc.nextDouble();

		Retangulo retangulo = new Retangulo();

		retangulo.setHeight(lado1);
		retangulo.setWidth(lado2);

		System.out.println(retangulo.area());
		System.out.println(retangulo.diagonal());
		System.out.println(retangulo.perimeter());

		// exc 3

		System.out.println("Enter your name, your grossSAlary and your tax:");
		String name = sc.next();
		double grossSalary = sc.nextDouble();
		double tax = sc.nextDouble();

		Employees emp = new Employees();
		emp.setName(name);
		emp.setGrossSalary(grossSalary);
		emp.setTax(tax);
		System.out.println(emp.netSalary());

		System.out.println("Enter your name, your grossSAlary and your tax:");
		double percentage = sc.nextDouble();

		emp.increaseSalary(percentage);
		System.out.println(emp.netSalary());

		// exc 4

		System.out.println("Enter your name: ");
		String name1 = sc.next();

		System.out.println("Enter your grades: ");
		double grade1 = sc.nextDouble();
		double grade2 = sc.nextDouble();
		double grade3 = sc.nextDouble();

		Studient std = new Studient();

		std.media(grade1, grade2, grade3);
		System.out.println(std.getMedia());
		std.verifyStatus();

		System.out.println("Digite o valor para o calculo:");
		double var = sc.nextDouble();
		double c = Calculadora.circumference(var);
		double v = Calculadora.volume(var);
		System.out.println(Calculadora.PI);

		System.out.println("Digite o valor do dolar");
		double dolar = sc.nextDouble();

		System.out.println("Digite a quantidade");
		double qntd = sc.nextDouble();

		System.out.println(CurrencyConverter.converter(dolar, qntd));

	}

}
