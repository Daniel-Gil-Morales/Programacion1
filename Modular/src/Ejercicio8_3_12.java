
public class Ejercicio8_3_12 {

	public static void main(String[] args) {

		int numero1 = 12, numero2 = 10;
		
		int divisoresNumero1 [] = calcularDivisores(numero1);
		int divisoresNumero2 [] = calcularDivisores(numero2);
		
	}

	public static void calcularDivisores() {
		
		
		return divisores;
	}
	
	public static int [] encuentraDivisoresComunes(int [] array1, int [] array2) {
		
		int tamanyo = 0;
		int tamanyoArrayMasGrande = 0;
		
		if (array1.length>array2.length) {
			tamanyoArrayMasGrande = array1.length;
		} else {
			tamanyoArrayMasGrande = array2.length;
		}
		
		int [] comunes = new int[tamanyo];
		
		for(int i = 0; i)
		
	}
	
	
	
}


/*
Ejercicio 8.3.12 - Número de Divisores: Escribe un programa modular en Java que, dado un número entero positivo, calcule y muestre la cantidad de divisores 
que tiene. Define una función llamada calcularDivisores que tome el número como argumento y devuelva el número de divisores. Luego, en el programa principal, solicita 
al usuario que ingrese un número y llama a la función para mostrar la cantidad de divisores.
*/