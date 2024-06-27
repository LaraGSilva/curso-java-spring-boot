package entities;

public class Employees {
	
	private String name;
	private double grossSalary;
	private double tax;
	
	public double netSalary() {
		
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		double netSalary = grossSalary - tax;
		netSalary +=  grossSalary * percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
