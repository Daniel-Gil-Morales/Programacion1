/*
 * Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado y cubo . Carga el array numero 
 * con valores aleatorios entre 0 y 100 excluidos. En el array cuadrado se deben almacenar los cuadrados de los valores 
 * que hay en el array numero . En el array cubo se deben almacenar los cubos de los valores que hay en numero. 
 * A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.
 * Ejemplo:
1  1  1
2  4  8
3  9  27
4  16 64
..........
 */

public class Ejercicio1 {
	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		/*
		 * Completamos el array numeros con enteros Aleatorios entre 0 y 100
		 */
		for (int i = 0; i < numero.length; i++) {
			// Generamos un número entre 0 y 100
			int numeroAleatorio = (int) (Math.random() * 100);
			/*
			 * Dado que no se especifica si el 0 y el 100 están permitidos, suponemos que no
			 * y hacemos lo siguiente:
			 */
			if (numeroAleatorio == 0) { // si es 0 le sumamos 1
				numeroAleatorio = numeroAleatorio + 1;
			} else if (numeroAleatorio == 100) { // si es 100 le restamos 1
				numeroAleatorio = numeroAleatorio - 1;
			}
			// asignamos un numero entre 1 y 99 incluidos
			numero[i] = numeroAleatorio;
			cuadrado[i] = (int) Math.pow((double) numeroAleatorio, 2.0);
			// se podría hacer también con cuadrado[i]=numero[i]*numero[i];

			/*
			 * Ahora no haría falta el casting a double porque numeroAleatorio /* ya se ha
			 * casteado previamente y ahora es un double
			 */
			cubo[i] = (int) Math.pow(numeroAleatorio, 3.0);

			System.out.println(numero[i] + " " + cuadrado[i] + " " + cubo[i]);
		}

	}

}
