import java.util.Arrays;
import java.util.Random;

public class Ejercicio1DanielGilMorales {

    public static void main(String[] args) {
        float[] numeros = new float[10];
        inicializarArray(numeros);
        mostrarResultados(numeros);
    }

    // Método para mostrar resultados
    public static void mostrarResultados(float[] array) {
        System.out.println("Contenido del array: " + Arrays.toString(array));
        System.out.println("El máximo es: " + maximo(array));
        System.out.println("El mínimo es: " + minimo(array));
        System.out.println("La media es: " + media(array));
    }
    
    // Método para inicializar el array con números aleatorios
    public static void inicializarArray(float[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextFloat() * 100;
        }
    }

    // Método para calcular la media del array
    public static float media(float[] array) {
        float suma = 0;
        for (float num : array) {
            suma += num;
        }
        return suma / array.length;
    }

    // Método para sacar el valor mínimo
    public static float minimo(float[] array) {
        float minimo = array[0];
        for (float num : array) {
            if (num < minimo) {
                minimo = num;
            }
        }
        return minimo;
    }

    // Método para sacar el valor máximo
    public static float maximo(float[] array) {
        float maximo = array[0];
        for (float num : array) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }
}
