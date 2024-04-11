
public class Ej79_arraySimple {

	public static void main(String[] args) {

		int desordenado[] = { 10, 5, 15, 17, 2, 6, 9, 2, 1, 77 };
		int ordenado[] = new int[10];

		int minimo = Integer.MAX_VALUE;

		for (int j = 0; j < ordenado.length; j++) {

			for (int i = 0; i < desordenado.length; i++) {

				if (desordenado[i] < minimo) {

					minimo = desordenado[i];
					ordenado[i]=Integer.MAX_VALUE;

				}

			}
			ordenado[j]=minimo;
		}

		System.out.println();
		for (int i = 0; i < desordenado.length; i++) {

			System.out.print("[" + desordenado[i] + "]");

		}

		System.out.println();
		for (int i = 0; i < desordenado.length; i++) {

			System.out.print("[" + ordenado[i] + "]");

		}

	}

}