import java.util.Scanner;

public class Ej71 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        double[] numeros = new double[5];
        double suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número real: ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }

        double media = suma / 5;

        System.out.println("La media de los números es: " + media);

        System.out.print("Valores por encima de la media: ");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] > media) {
                System.out.print(numeros[i] + " ");
            }
        }

        sc.close();
    }
}

