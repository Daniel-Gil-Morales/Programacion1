 

DESPLAZARLO¿?




class prueba {


		    public static void main(String[] args) {
		        String texto = "hoy es viernes y estamos haciendo un examen. son las 19:30 de la tarde. la semana que viene es Navidad";

		        System.out.println("Cadena original:");
		        System.out.println(texto);

		        String resultado = formatearCadena(texto);

		        System.out.println("\nCadena resultante:");
		        System.out.println(resultado);
		    }

		    private static String formatearCadena(String cadena) {
		        String[] oraciones = cadena.split("\\.");

		        char[] resultado = new char[cadena.length()];
		        int indiceResultado = 0;

		        for (String oracion : oraciones) {
		            oracion = oracion.trim();

		            if (!oracion.isEmpty()) {
		                oracion = oracion.substring(0, 1).toUpperCase() + oracion.substring(1);

		                for (char c : oracion.toCharArray()) {
		                    resultado[indiceResultado++] = c;
		                }

		                resultado[indiceResultado++] = ' ';
		                resultado[indiceResultado++] = '.';
		            }
		        }

		        return new String(resultado, 0, indiceResultado);

    }
}

