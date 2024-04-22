
public class Ejercicio8_3_15 {
	
	public static void main(String[] args) {
		int numero1 = 5;
		int numero2 = 10;
		int mcm = 0;

		mcm = minimoComunMultiplo(numero1, numero2);

		System.out.println();
		System.out.println("El mínimo común múltiplo es: " + mcm);

	}
	
	public static int calcularNumeroDivisores(int numero) {
		int contadorDivisores = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contadorDivisores++;
			}

		}
		return contadorDivisores;
	}

	/* Nos devuelve un array con los divisores del número */
	public static int[] calcularDivisores(int n) {
		/*
		 * Usamos el método calcularNumeroDivisores para determinar el tamaño del array
		 * que vamos a devolver
		 */
		int numeroDivisores = calcularNumeroDivisores(n);
		int divisores[] = new int[numeroDivisores];
		int j = 0;
		for (int divisor = 1; divisor <= n; divisor++) {
			if (n % divisor == 0) {
				divisores[j] = divisor;
				j++;

			}
		}
		return divisores;
	}

	/*
	 * Busca un elemento dentro del array pasado como parámetro y lo devuelve si lo
	 * encuentra, en caso contrario devuelve -1
	 */
	public static int buscarElemento(int elemento, int[] array) {
		int buscado = -1;

		for (int i = 0; i < array.length; i++) {
			if (elemento == array[i])
				buscado = array[i];
		}

		return buscado;
	}

	/*
	 * devuelve un array con el tamaño del array más pequeño que contiene los
	 * elementos comunes a ambos arrays pasados como parámetros
	 */
	public static int[] encuentraDivisoresComunes(int[] array1, int[] array2) {
		int tamanyoArrayMasPequenyo = 0;
		int tamanyoArrayMasGrande = 0;
		int[] arrayMasGrande;
		int[] arrayPequenyo;
		if (array1.length > array2.length) {
			tamanyoArrayMasGrande = array1.length;
			arrayMasGrande = array1;
			arrayPequenyo = array2;
		} else {
			tamanyoArrayMasGrande = array2.length;
			arrayMasGrande = array2;
			arrayPequenyo = array1;
		}

		if (array1.length > array2.length) {
			tamanyoArrayMasPequenyo = array2.length;
		} else {
			tamanyoArrayMasPequenyo = array1.length;
		}

		int[] comunes = new int[tamanyoArrayMasPequenyo];
		int j = 0;
		for (int i = 0; i < tamanyoArrayMasGrande; i++) {
			int buscado = buscarElemento(arrayMasGrande[i], arrayPequenyo);
			if (buscado != -1) {
				comunes[j] = buscado;
				j++;
			}
		}

		return comunes;

	}

	/*
	 * encuentra el elemento más grande del array pasado como parámetro y lo
	 * devuelve
	 */
	public static int encuentraMaximo(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

	/*
	 * Este método recibe dos números enteros y devuelve el mcd de ambos números
	 */
	public static int maximoComunDivisor(int numero1, int numero2) {

		int divisoresNumero1[] = calcularDivisores(numero1);
		int divisoresNumero2[] = calcularDivisores(numero2);

		int divisoresComunes[] = encuentraDivisoresComunes(divisoresNumero1, divisoresNumero2);
		int mdc = encuentraMaximo(divisoresComunes);
		return mdc;

	}

	/*
	 * Calcula el mínimo común múltiplo de dos números y lo devuelve. Hace uso del
	 * método maximoComunDivisor (y sus métodos auxiliares) realizados en el
	 * ejercicio anterior
	 */

	public static int minimoComunMultiplo(int num1, int num2) {
		int mcd = maximoComunDivisor(num1, num2);
		int mcm = (num1 * num2) / mcd;
		return mcm;

	}

}
