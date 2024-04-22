package Ejercicio1;

public class Principal {

	public static void main(String[] args) {

		Rectangulo rect1 = new Rectangulo(5.0, 10.0);
		Rectangulo rect2 = new Rectangulo(7.5, 12.5);
		
		System.out.println("Rectángulo 1:");

		System.out.println("Área: " + rect1.calcularArea());

		System.out.println("Perímetro: " + rect1.calcularPerimetro());

		System.out.println();



		System.out.println("Rectángulo 2:");

		System.out.println("Área: " + rect2.calcularArea());

		System.out.println("Perímetro: " + rect2.calcularPerimetro());
		
	}

}
