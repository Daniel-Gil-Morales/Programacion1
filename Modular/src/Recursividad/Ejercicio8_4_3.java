package Recursividad;

public class Ejercicio8_4_3 {

	public static void main(String[] args) {

		int [] numeros = {2,45,3,4,5,11,23,11,23,56,77,21,34,99};
		int inicio = 0;
		int fin = numeros.length;
		boolean encontrado = false;
		int elemento = 10;
		
		encontrado = buscar(numeros, elemento, inicio, fin);
		
		if (encontrado) {
			System.out.println("Elemento " + elemento + " encontrado en el array");
		} else {
			System.out.println("Elemento " + elemento + " NO encontrado en el array");
		}
		
	}

	public static boolean buscar(int[] array, int elemento, int inicio, int fin) {

		boolean enc = false;

		// Caso base
		if (array[inicio] == elemento || array[fin] == elemento) {
			enc = true;
		} else if(inicio<fin){ // Caso recursivo
			enc = buscar(array, elemento, inicio + 1, fin-1);
		}

		return enc;
	}

}
