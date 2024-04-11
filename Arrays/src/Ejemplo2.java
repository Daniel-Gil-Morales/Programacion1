import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {

		Scanner t = new Scanner (System.in);
		
		int numeros [] = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("Introduzca el valor para la posición " + i);
			numeros[i]=t.nextInt();
		}
	
		for(int i=0; i<5; i++) {
			System.out.println("Contenido del array: ");
		}
		
	}

}