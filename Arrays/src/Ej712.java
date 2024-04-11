public class Ej712 {
	public static void main(String[] args) {
		
		int matrizA[][]= {{5,7,9},{6,3,7},{1,4,0}};
		int matrizB[][]= {{9,1,2},{4,2,9},{1,5,6}};
		int matrizSuma[][] = new int [3][3];
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				matrizSuma[i][j]=matrizA[i][j]+matrizB[i][j];
			}
		}
		
		System.out.println("MATRIZ A: ");
		for (int fila=0;fila<3;fila++) {
			System.out.println();
			for (int columna=0;columna<3;columna++) {
				System.out.print("[" + matrizA[fila][columna] + "]");
			}
		}
		
		System.out.println("\nMATRIZ B: ");
		for (int fila=0;fila<3;fila++) {
			System.out.println();
			for (int columna=0;columna<3;columna++) {
				System.out.print("[" + matrizB[fila][columna] + "]");
			}
		}
		System.out.println();
		
		
		System.out.println("MATRIZ SUMA: ");
		
		for (int fila=0;fila<3;fila++) {
			System.out.println();
			for (int columna=0;columna<3;columna++) {
				System.out.print("[" + matrizSuma[fila][columna] + "]");
			}
		}
	}
}
