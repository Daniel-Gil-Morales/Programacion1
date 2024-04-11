
public class Ej715 {

	public static void main(String[] args) {

		int numeros[][] = { { 5, 4, 7 }, { 8, 9, 7 }, { 3, 6, 9 } };
		double mediaColumna, mediaFila;

		int sumaFila;
		int sumaColumna;

		for (int fila = 0; fila < 3; fila++) {
			sumaFila=0;
			for (int columna = 0; columna < 3; columna++) {

				sumaFila = sumaFila + numeros[fila][columna];

			}

			mediaFila = (double) (sumaFila / 3.0);
			System.out.println("La media de la fila " + fila + " es: " + mediaFila);

		}

		for (int columna = 0; columna < 3; columna++) {

			sumaColumna = 0;
			for (int fila = 0; fila < 3; fila++) {
				sumaColumna = sumaColumna + numeros[fila][columna];
			}

			mediaColumna = sumaColumna / 3.0;
			System.out.println("La media de la Columna 0 es: " + mediaColumna);
		}

	}

}
