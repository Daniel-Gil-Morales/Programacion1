import java.util.Scanner;

public class Ejercicio3DanielGilMorales {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		System.out.println("Indique la altura del reloj de arena que sea un número impar mayor o igual a 3: ");
		int altura = t.nextInt();

		if (altura % 2 == 0 || altura < 3) {
			System.out.println("La altura debe ser un número impar mayor o igual a 3");
		} else {
			// Dibuja la parte superior del reloj de arena
			// Pongo (altura / 2 + 1) porque si por ejemplo 7/2 es 3.5 para el programa es 4, entonces saca 4 alturas del triangulo
			for (int i = 0; i < altura / 2 + 1; i++) {
				// Deja los espacios en blanco
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				// Dibuja los asteriscos
				for (int k = 0; k < altura - 2 * i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

			// Dibuja la mitad de abajo del reloj
			for (int i = altura / 2; i > 0; i--) {
				// Deja los espacios en blanco
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				// Dibuja los asteriscos
				for (int k = 0; k < 2 * (altura / 2 - i) + 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

			// Dibuja la última linea
			for (int i = 0; i < altura; i++) {
				System.out.print("*");
			}
		}

	}
}