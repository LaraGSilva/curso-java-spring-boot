package poo;

import java.util.Scanner;

import entities.Triangulo;

public class ExercicoTriangulo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		double ax, bx, cx;
		double ac, bc,cc;
		
		System.out.println("Digite os valores dos lados do triangulos X: ");
		ax = sc.nextDouble();
		
		System.out.println("Digite os valores dos lados do triangulo X: ");
		bx = sc.nextDouble();
		
		System.out.println("Digite os valores dos lados do triangulo X: ");
		cx = sc.nextDouble();
		
		double p = (ax + bx + cx)/2.00;
		double areaX = Math.sqrt(p * (p - ax) * (p - bx) * (p - cx));
		
		System.out.println("Digite os valores dos lados do triangulos C: ");
		ac = sc.nextDouble();
		
		System.out.println("Digite os valores dos lados do triangulo C: ");
		bc = sc.nextDouble();
		
		System.out.println("Digite os valores dos lados do triangulo C: ");
		cc = sc.nextDouble();
		
		double v = (ac + bc+ cc)/2.00;
		double areaC = Math.sqrt(v * (v - ac) * (v - bc) * (v - cc));
		
		if (areaX < areaC) {
			System.out.println("Triangulo X maior que o C");
		}else {
			System.out.println("Triangulo C maior que o X");
		}
		
		
		Triangulo x = new Triangulo();
		
		System.out.println("Digite o valor dos lados do triangulo x-a:");
		x.a = sc.nextDouble();
		
		System.out.println("Digite o valor dos lados do triangulo x-b:");
		x.b = sc.nextDouble();
		
		System.out.println("Digite o valor dos lados do triangulo x-c:");
		x.c = sc.nextDouble();
		
		double f = (x.a + x.b+ x.c)/2.00;
		double areaf = Math.sqrt(v * (v - x.a) * (v - x.b) * (v - x.c));
		
		x.area();
		

	}

}
