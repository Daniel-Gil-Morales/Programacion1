import java.util.Scanner;

public class Ejercicio8_3_0 {

	public static void main(String[] args) {

		int ancho, alto;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca ancho: ");
		ancho = teclado.nextInt();
		System.out.println("Introduzca alto: ");
		alto = teclado.nextInt();

		int area = 0;

		area = dibujarRectangulo(ancho, alto);
		System.out.println("Su área es: " + area);

	}

	public static int dibujarRectangulo(int anc, int alt) {

		for (int j = 0; j < alt; j++) {
			for (int i = 0; i < anc; i++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		return anc * alt;
	}

}