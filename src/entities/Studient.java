package entities;

public class Studient {

	private String name;
	private double grade1;
	private double grade2;
	private double grade3;
	private double media;
	
	public double media(double grade1, double grade2, double grade3) {
		
		double media = ((grade1*0.30) + (grade2*0.35) + (grade3*0.35))/3;
		
		return Math.round(media);
	}
	
	public void verifyStatus() {
	
		if (media < 6 ) {
			double points = 6 - media;
			System.out.printf("FAILED, do you need more %.2f", points, "points");
		}else {
			System.out.println("PASS");
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade1() {
		return grade1;
	}

	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}

	public double getGrade3() {
		return grade3;
	}

	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}

	public double getMedia() {
		return media;
	}
	
}