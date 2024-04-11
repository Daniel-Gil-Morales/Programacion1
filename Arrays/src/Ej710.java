
public class Ej710 {

	public static void main(String[] args) {

		char caracteres[][] = new char[5][5];
		
		for(int fila=0; fila<5; fila++) {
			
			if(fila==1) {
				for(int columna=0; columna<5; columna++) {
					caracteres[fila][columna]='A';
				}
			}else {
				for(int columna=0; columna<5; columna++) {
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