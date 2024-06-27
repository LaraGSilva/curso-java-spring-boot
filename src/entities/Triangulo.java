package entities;

public class Triangulo {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		
		double f = (a + b+ c)/2.00;
		double area = Math.sqrt(f * (f - a) * (f - b) * (f - c));
		
		return area;
		
	}
	
	
}
