import java.util.Scanner;

public class Ejercicio3DanielGilMorales {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		int opcion;

		do {
			opcion = mostrarMenu(t);

			switch (opcion) {
			case 1:
				convertirH(t, "H1");
				break;
			case 2:
				convertirH(t, "H2");
				break;
			case 3:
				convertirParrafo(t);
				break;
			case 4:
				break;
			default:
				System.out.println("Error. Intentalo de nuevo.");
			}

		} while (opcion != 4);

		imprimirFinalHTML();

	}

	private static int mostrarMenu(Scanner t) {
		System.out.println("Seleccione la operación a realizar:");
		System.out.println("1.- Convertir a H1");
		System.out.println("2.- Convertir a H2");
		System.out.println("3.- Convertir en párrafo");
		System.out.println("4.- Terminar");
		System.out.print("Ingrese su opción: ");

		return t.nextInt();
	}

	private static void convertirH(Scanner t, String etiqueta) {
		System.out.print("Introduzca el texto para convertir a " + etiqueta);
		String texto = t.next();
		System.out.println("<" + etiqueta + ">" + texto + "</" + etiqueta + ">");
	}

	private static void convertirParrafo(Scanner t) {
		System.out.print("Introduzca el texto para convertir en párrafo: ");
		String texto = t.next();
		System.out.println("<p>" + texto + "</p >");
	}

	private static void imprimirFinalHTML() {
		System.out.println("</body>");
		System.out.println("</html>");
	}
}
