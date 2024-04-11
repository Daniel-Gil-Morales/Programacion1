public class Ej714 {

    public static void main(String[] args) {

        int numeros[][] = { { 2, 7, 5, 2, 7 }, { 1, 4, 9, 4, 3 }, { 9, 7, 2, 1, 0 }, { 7, 5, 3, 7, 1 }, { 8, 7, 9, 4, 9 } };

        for (int fila = 0; fila < 5; fila++) {

            for (int columna = 0; columna < 5; columna++) {

                if (fila == columna) {
                    numeros[fila][columna] = fila + 1;
                } else {
                	numeros[fila][columna] = 0;
                }
            }
        }
        
        // Imprimir por pantalla
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(numeros[fila][columna] + " ");
            }
            System.out.println();
        }

    }
}