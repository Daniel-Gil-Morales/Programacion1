public class Ejercicio2DanielGilMorales {

	public static void main(String[] args) {

		String cadena = "HTtpS://www.Google.eS HTtp://iesAlixaR.oRg hTTps://www.juntadEandalucia.es";

		int https = contadorProtocolo(cadena, "https");
		int http = contadorProtocolo(cadena, "http");

		System.out.println("Número de URLs con protocolo HTTPS --> " + https);
		System.out.println("Número de URLs con protocolo HTTP  --> " + http);
	}

	// Método para contar la cantidad de URLs con un protocolo específico
	public static int contadorProtocolo(String cadena, String protocolo) {
		// Divide la cadena en un array de URLs
		String[] urls = cadena.trim().split("\\s+");
		int contador = 0;

		// Itera a través de las URLs
		for (String url : urls) {
			// Verifica si la URL comienza con el protocolo dado
			if (url.toLowerCase().startsWith(protocolo + "://")) {
				contador++;
			}
		}
		return contador;
	}
}
