import java.util.Scanner;

public class Ejercicio2DanielGilMorales {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		int usuario;
		do {
			System.out.println("Introduzca su usuario: ");
			usuario = t.nextInt();
		} while (usuario != 12345);

		while (usuario == 12345) {

			int intentoscontrasena = 0;

			while (intentoscontrasena <= 3) {
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
					intentoscontrasena++;
					System.out.println("Contraseña incorrecta. Intentos restantes: " + (3 - intentoscontrasena));
					if (intentoscontrasena == 3) {
						System.out.println("Has llegado al número máximo de intentos. Login incorrecto.");
						return;
					}
				}
			}
		}
	}
}
