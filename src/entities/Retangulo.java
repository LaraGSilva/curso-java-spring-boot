package entities;

public class Retangulo {

	
		private double width;
		private double height;
		
		public double area() { 
			return width * height;
		}
		
		public double perimeter() {
			return width* 2 + height*2;
		}
		
		public double diagonal() {
			return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}
		
		
}
