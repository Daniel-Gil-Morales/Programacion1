public class Ejercicio1DanielGilMorales {

    public static void main(String[] args) {
        // Cadena original
        String cadena = "hoy es viernes y estamos haciendo un examen. son las 19:30 de la tarde. la semana que viene es Navidad";

        // Muestra la cadena original
        System.out.println(cadena);

        // Obtiene la cadena modificada
        String resultado = cambiarcadena(cadena);

        // Muestra la cadena modificada
        System.out.println(resultado);
    }

    private static String cambiarcadena(String cadena) {
        // Divide la cadena en oraciones usando el punto como limite
        String[] oraciones = cadena.split("\\.");

        // Crea un array de caracteres para almacenar
        char[] resultado = new char[cadena.length()];
        int indice = 0;

        // Bucle para las oraciones
        for (String oracion : oraciones) {
            // Elimina los espacios en blanco al principio y al final de la oración
            oracion = oracion.trim();

            // Mira si la oración no está vacía
            if (!oracion.isEmpty()) {
                // Convierte la primera letra de la oración a mayúscula
                oracion = oracion.substring(0, 1).toUpperCase() + oracion.substring(1);

                // Copia los caracteres de la oración modificada al array de resultado
                for (char a : oracion.toCharArray()) {
                    resultado[indice++] = a;
                }

                // Agrega un punto al final de la oración
                resultado[indice++] = '.';
            }
        }

        // Crea y devulve una nueva cadena a partir del array de resultado
        return new String(resultado, 0, indice);
    }
}
