/*
 * 	Ejercicio 2
	Realiza un programa que muestre por pantalla un array bidimensional cuadrado cuyo tamaño será solicitado al usuario y que deberá rellenarse con números entre 18 y 65.
	A continuación, el programa debe mostrar los números de la diagonal que van desde la esquina
	superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo y la media de los números que hay en esa diagonal.
	
	Se valorará que la solución requiera el mínimo número de recorridos posibles del array. 
 */
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int[][] numeros;
		int[] diagonal;
		int tamanyo = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la dimensión del array: ");
		tamanyo = teclado.nextInt();
		numeros = new int[tamanyo][tamanyo];
		diagonal = new int[tamanyo];

		int minimo = 65, maximo = 18, suma = 0;
		double promedio;

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros.length; j++) {

				int diferencia = 65 - 18;
				int numeroAInsertar = (int) (Math.random() * diferencia) + 18;
				numeros[i][j] = numeroAInsertar;

				if (i == j) {
					System.out.print(" " + numeros[i][j] + " ");

					if (numeros[i][j] < minimo)
						minimo = numeros[i][j];
					if (numeros[i][j] > maximo)
						maximo = numeros[i][j];

					suma = suma + numeros[i][j];

				}
			}

		}
		// también podemos usar tamanyo
		promedio = (double) suma / numeros.length;
		System.out.println("\nMAX: " + maximo);
		System.out.println("MIN: " + minimo);
		System.out.println("PRO: " + promedio);

		/*
		 * //Calcular maximo de la diagonal int maximo=diagonal[0]; for (int
		 * i=0;i<diagonal.length;i++) { if (diagonal[i]>maximo) maximo=diagonal[i]; }
		 * System.out.println("\nMAX: " + maximo); //Calcular minimo de la diagonal int
		 * minimo=diagonal[0]; for (int i=0;i<diagonal.length;i++) { if
		 * (diagonal[i]<minimo) minimo=diagonal[i]; } System.out.println("MIN: " +
		 * minimo); double promedio=0; int suma=0; for (int i=0;i<diagonal.length;i++) {
		 * suma=suma + diagonal[i];
		 * 
		 * } promedio=(double) suma/diagonal.length; System.out.println("PROMEDIO: " +
		 * promedio);
		 */

	}
}
