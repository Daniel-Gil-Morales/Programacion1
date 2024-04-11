import java.util.Scanner;

public class Ej76 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        long[] numeros = new long[10];

        System.out.println("Ingresa 10 números enteros largos:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = t.nextLong();
        }

        while (true) {
            System.out.print("Ingresa el número que deseas buscar (o -1 para salir): ");
            long numeroBuscado = t.nextLong();

            if (numeroBuscado == -1) {
                System.out.println("Has salido del programa.");
                break;
            }

            boolean encontrado = false;

            for (int i = 0; i < 10; i++) {
                if (numeros[i] == numeroBuscado) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("El número " + numeroBuscado + " forma parte de los 10 números iniciales.");
            } else {
                System.out.println("El número " + numeroBuscado + " no se encuentra en la lista.");
            }
        }

    }
}