import java.util.Scanner;

public class Ejercicio1DanielGilMorales {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		int usuario;
		do {
			System.out.println("Introduzca su usuario: ");
			usuario = t.nextInt();
		} while (usuario != 12345);

		while (usuario == 12345) {
			System.out.print("Introduzca la contraseña: ");
			int contrasena = t.nextInt();

			if (contrasena == 54321) {

				int n1 = 2;
				int n2 = 4;
				int resultado = 6;
				System.out.print("Introduzca el resultado de la siguiente suma: " + n1 + " + " + n2 + " = ");
				int suma = t.nextInt();

				if (suma == resultado) {

					System.out.println("Login correcto");
					break;

				} else {

					System.out.println("Login fallido");
					break;

				}

			} else {
				System.out.println("Contraseña incorrecta.");
			}
		}
	}
}
