import java.util.Scanner;

public class Ej77_2 {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        int numeros[] = new int[1000];
        int opcion;
        int n;
        int numbuscar;

        int contadorDeElementos = 0;

        do{

            System.out.println("--- MENU ---");
            System.out.println("1 - Introducir nuevo dato");
            System.out.println("2 - Comprobar un dato");
            System.out.println("3 - Salir");
            opcion = t.nextInt();

            if (opcion == 1) {

                System.out.println("¿Qué número quieres introducir?:");
                numeros[contadorDeElementos]=t.nextInt();
                
                contadorDeElementos++;
                
                for(int i=0; i<contadorDeElementos; i++) {
                	System.out.println("[" + numeros[i] + "]");
                }

            }
                
                                
            if (opcion == 2) {

                boolean encontrado = false;
                System.out.println("Qué número quieres buscar?");
                numbuscar = t.nextInt();

                for (int i = 0; i < contadorDeElementos; i++) {
                    if (numeros[i] == numbuscar) {
                        encontrado = true;
                    }
                }

                if (encontrado) {
                    System.out.println("El número está dentro del array.");
                    System.out.println();
                } else {
                    System.out.println("El número no está dentro del array.");
                    System.out.println();
                }
            }

        }while (opcion != 3);
        
    }
}