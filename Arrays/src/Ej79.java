import java.util.Scanner;

public class Ej79 {
	public static void main(String[] args) {
		int[][] datos = new int[3][3];
		Scanner teclado;
		teclado = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				datos[i][j] = teclado.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + datos[i][j] + "]");
			}
		}
		int determinante = datos[0][0] * datos[1][1] * datos[2][2] + datos[0][1] * datos[1][2] * datos[2][0]
				+ datos[1][0] * datos[2][1] * datos[0][2] - datos[0][2] * datos[1][1] * datos[2][0]
				- datos[0][1] * datos[1][0] * datos[2][2] - datos[1][2] * datos[2][1] * datos[0][0];
		System.out.print("El determinante es: " + determinante);

	}
}
