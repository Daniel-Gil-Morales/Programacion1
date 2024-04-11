import java.util.Scanner;

public class Ej77 {

	public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
		
        int numeros[] = new int[1000];
        int opcion;
		int n;
		int numbuscar;
        int contadorDeElementos = 0;
    	boolean encontrado = false;

        
        do{
        	
            System.out.println("--- MENU ---");
            System.out.println("1 - Introducir nuevo dato");
            System.out.println("2 - Comprobar un dato");
            System.out.println("3 - Salir");
            opcion = t.nextInt();
        	   
            if(opcion==1) {
            	
            	System.out.println("¿Qué número quieres introducir?:");

				numeros[contadorDeElementos]=t.nextInt();
                
                contadorDeElementos++;
                
                for(int i=0; i<contadorDeElementos; i++) {
                	System.out.println("[" + numeros[i] + "]");
                }
            	
            }else if(opcion==2) {
            	
            	System.out.println("Qué numero quieres buscar?");
            	numbuscar = t.nextInt();
            	
				for(int i=0;i<contadorDeElementos; i++) {
            		
            		if(numbuscar==numeros[1]) {
            			System.out.println("Encontrado el número " + numbuscar);
            			encontrado=true;
            		}
            		
            	}
            	
            }
            
            
        }while(opcion!=3);
		
	}

}
