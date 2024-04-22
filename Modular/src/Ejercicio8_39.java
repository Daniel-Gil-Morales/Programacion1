
public class Ejercicio8_39 {

	public static void main(String[] args) {

		int numeros[] = {1,1,2,3,4,4,5,5,5,7,8,9,9,10};
		int maximo = 0;
		
		maximo = calcularMaximo(numeros);
		
		System.out.println("El máximo es ");
		
	}

	public static int calcularMaximo(int numeros []) {
		
		int max = 0;
		
		for(int i=0; i<numeros.length; i++) {
			
			if(numeros[i]>=max) {
				
				max = numeros[i];
				
			}
			
		}
		
		return max;		
	}
	
	
}
