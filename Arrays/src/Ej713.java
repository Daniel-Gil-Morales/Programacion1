
public class Ej713 {

	public static void main(String[] args) {

		int numeros [][] = {{2,7,5},{1,4,9},{9,7,2}};
		
		int minimo=numeros[0][0];
		
		for(int fila=0; fila<3; fila++) {
			
			for(int columna=0; columna<3; columna++) {
						
				if(numeros[fila][columna]<minimo) {
					minimo=numeros[fila][columna];
				}
				
			}
			
		}
		
		System.out.println("El mínimo es: " + minimo);
		
	}

}