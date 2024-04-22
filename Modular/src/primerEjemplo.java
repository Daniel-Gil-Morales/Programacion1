
public class primerEjemplo {

	public static void main(String[] args) {

		String cadena1 = "Esta es la primera cadena";
		String cadena2 = "Esta es la segunda cadena";
		String cadena3 = "Esta es la tercera cadena";

		imprimeSubrayado(cadena1);

		imprimeSubrayado(cadena2);

		imprimeSubrayado(cadena3);

	}

	public static void imprimeSubrayado(String cadena) {

		System.out.println(cadena);

		for (int i = 0; i < 30; i++) {

			System.out.print("_");

		}
		System.out.println();
		System.out.println();
	}

}