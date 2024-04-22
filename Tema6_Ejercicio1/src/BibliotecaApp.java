import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nBienvenido al Sistema de Biblioteca");
            System.out.println("1. Agregar libro");
            System.out.println("2. Listar libros por título");
            System.out.println("3. Listar libros por año de publicación");
            System.out.println("4. Buscar libros por género");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    sistema.agregarLibro(teclado);
                    break;
                case 2:
                    sistema.listarLibrosOrdenadosPorTitulo();
                    break;
                case 3:
                    sistema.listarLibrosOrdenadosPorAnyoPublicacion();
                    break;
                case 4:
                    System.out.print("Ingrese el género a buscar: ");
                    String genero = teclado.nextLine();
                    sistema.buscarLibrosPorGenero(genero);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        } while (opcion != 5);

        teclado.close();
    }
}