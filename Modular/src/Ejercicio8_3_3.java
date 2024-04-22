public class Ejercicio8_3_3 {

	public static void main(String[] args) {

		String cadena = "Esto es una cadena";
		char c = primerCaracter(cadena);
		System.out.println("El primer caracter es: " + c);

	}

	public static char primerCaracter(String cad) {
		char a = cad.charAt(0);
		return a;

	}

}