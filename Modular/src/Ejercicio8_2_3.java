public class Ejercicio8_2_3 {

	public static void main(String[] args) {

		int tamanyo = 7;
		dibujarCuadrado(tamanyo);

	}

	public static void dibujarCuadrado(int tam) {
		for (int j = 0; j < tam; j++) {
			for (int i = 0; i < tam; i++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}