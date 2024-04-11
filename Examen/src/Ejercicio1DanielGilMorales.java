
import java.util.Scanner;

public class Ejercicio1DanielGilMorales {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        long numero = scanner.nextLong();

        long copianumero = numero;//Copio los datos del numero para no perderlo
        int sumaPares = 0;
        int sumaImpares = 0;

        System.out.print("Dígitos pares: ");
        while (copianumero > 0) {
            int digito = (int) (copianumero % 10);
            if (digito % 2 == 0) {
                System.out.print(digito + " ");
                sumaPares += digito;
            }
            copianumero /= 10;
        }
        System.out.println();

        System.out.print("Dígitos impares: ");
        copianumero = numero;
        while (copianumero > 0) {
            int digito = (int) (copianumero % 10);
            if (digito % 2 != 0) {
                System.out.print(digito + " ");
                sumaImpares += digito;
            }
            copianumero /= 10;
        }
        System.out.println();

        System.out.println("Suma de dígitos pares: " + sumaPares);
        System.out.println("Suma de dígitos impares: " + sumaImpares);
    }
}