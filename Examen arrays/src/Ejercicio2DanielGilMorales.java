import java.util.Arrays;
import java.util.Random;

public class Ejercicio2DanielGilMorales {

    public static void main(String[] args) {
        // Crea el array
        int[][] array = numerosAleatorios(5, 5);

        // Muestra el array original
        System.out.println("Array original:");
        imprimirArray(array);

        // Extrae la fila del array
        int indiceFila = 2;
        int[] fila = extraerFila(array, indiceFila);

        // Extrae la cloumna del array
        int indiceColumna = 3;
        int[] columna = extraerColumna(array, indiceColumna);
        

        // Imprime la fila y la columna extraídas
        System.out.println();
        System.out.println("Fila extraída para el índice " + indiceFila + ": " + Arrays.toString(fila));
        System.out.println("Columna extraída para el índice " + indiceColumna + ": " + Arrays.toString(columna));

        // Desplaza la columna del array
        System.out.println();
        int desplazamiento = 2;
        int[][] arrayDesplazada = desplazarColumna(array, desplazamiento);
        System.out.println("Array desplazado " + desplazamiento + " veces:");
        imprimirArray(arrayDesplazada);
    }

    // Genera un array de numeros aleatorios
    private static int[][] numerosAleatorios(int filas, int columnas) {
        int[][] array = new int[filas][columnas];
        Random random = new Random();

        // Rellena el array con números aleatorios entre 0 y 99
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        return array;
    }

    // Extrae una fila del array
    private static int[] extraerFila(int[][] array, int indice) {
        if (indice >= 0 && indice < array.length) {
            return Arrays.copyOf(array[indice], array[indice].length);
        } else {
            // Si el indice no es válido devuelve un array con valores 0
            return new int[array[0].length];
        }
    }

    // Extrae una columna del array
    private static int[] extraerColumna(int[][] array, int indice) {
        if (indice >= 0 && indice < array[0].length) {
            int[] columna = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                columna[i] = array[i][indice];
            }
            return columna;
        } else {
            // Si el indice no es válido devuelve un array con valores 0
            return new int[array.length];
        }
    }

    // Desplaza la columna del array
    private static int[][] desplazarColumna(int[][] array, int desplazamiento) {
        int numColumnas = array[0].length;

        // Asegura que el desplazamiento sea igual o mayor que 0
        desplazamiento = (desplazamiento % numColumnas + numColumnas) % numColumnas;

        int[][] arrayDesplazada = new int[array.length][numColumnas];

        // Desplaza las columnas
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < numColumnas; j++) {
            	arrayDesplazada[i][j] = array[i][(j - desplazamiento + numColumnas) % numColumnas];
            }
        }

        return arrayDesplazada;
    }

    // Imprime el array
    private static void imprimirArray(int[][] array) {
        for (int[] fila : array) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
