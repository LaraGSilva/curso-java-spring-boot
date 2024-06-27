package application;

import java.util.Scanner;

import entities.Produto;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		String name = sc.next();
		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		
		Produto produto = new Produto();
		produto.setName(name);
		produto.setPrice(price);
		produto.setQuantity(quantity);
		
		
	
		System.out.printf("Product data: $%.2f, %d units, Total: $%.2f\n ", produto.getPrice(), produto.getQuantity(), produto.TotalValueInStock());
		
		System.out.println("Digite a quantiade para adicionar: ");
		quantity = sc.nextInt();
		produto.AddProducts(quantity);
		System.out.printf("Product data: $%.2f, %d units, Total: $%.2f\n ", produto.getPrice(), produto.getQuantity(), produto.TotalValueInStock());
		
		System.out.println("Digite a quantiade para remover: ");
		quantity = sc.nextInt();
		produto.RemoveProducts(quantity);
		System.out.printf("Product data: $%.2f, %d units, Total: $%.2f\n ", produto.getPrice(), produto.getQuantity(), produto.TotalValueInStock());
		
		
		
	}

}
