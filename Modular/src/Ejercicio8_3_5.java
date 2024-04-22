public class Ejercicio8_3_5 {

	public static void main(String[] args) {

		boolean esPrimo;
		int numero = 21;

		esPrimo = esNumeroPrimo(numero);
		if (esPrimo) {
			System.out.println("El número " + numero + " es primo.");
		} else {
			System.out.println("El número " + numero + " no es primo.");

		}

	}

	public static boolean esNumeroPrimo(int n) {
		boolean primo = false;

		int contadorDivisores = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				contadorDivisores++;
			}

		}
		if (contadorDivisores == 2) {
			primo = true;
		}

		return primo;
	}

}