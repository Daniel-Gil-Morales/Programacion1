
public class Ej711 {

	public static void main(String[] args) {

		char caracteres [][] = new char[5][5];
		
		for(int fila=0; fila<5; fila++) {
			
			for(int columna=0; columna<5; columna++) {
				
				if(fila==columna){
					caracteres[fila][columna]='X';
				}else {
					caracteres[fila][columna]='.';
				}				
			}
		}
		// Imprimir por pantalla
		for (int fila = 0; fila<5; fila++) {
            for (int columna = 0; columna<5; columna++) {
                System.out.print(caracteres[fila][columna]);
            }
            System.out.println();
        }
	}
}