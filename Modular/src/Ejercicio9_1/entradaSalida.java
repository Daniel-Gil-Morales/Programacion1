package Ejercicio9_1;

import java.util.Scanner;

public class entradaSalida {

    public static void escribir(String s) {
        System.out.println(s);
    }

    public static void escribirSinSalto(String s) {
        System.out.print(s);
    }

    public static String leerCadena() {
        Scanner scanner = new Scanner(System.in);
        escribirSinSalto("Ingrese un texto: ");
        return scanner.nextLine();
    }

    public static int leerEntero() {
        Scanner scanner = new Scanner(System.in);
        escribirSinSalto("Ingrese un número entero: ");
        while (!scanner.hasNextInt()) {
            escribirSinSalto("Error. Ingrese un número entero válido: ");
            scanner.next(); // Consumir la entrada no válida
        }
        return scanner.nextInt();
    }
}
