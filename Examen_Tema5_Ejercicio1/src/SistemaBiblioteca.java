import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SistemaBiblioteca {
	private List<Libro> libros;

	public SistemaBiblioteca() {
		libros = new ArrayList<>();
	}

	public void agregarLibro() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Título: ");
		String titulo = scanner.nextLine();
		
		System.out.print("Autor: ");
		String autor = scanner.nextLine();
		
		System.out.print("Año de publicación: ");
		int anyoPublicacion = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Género: ");
		String genero = scanner.nextLine();

		libros.add(new Libro(titulo, autor, anyoPublicacion, genero));
		System.out.println("Libro agregado");
	}

	public void listarLibrosOrdenadosPorTitulo() {
        Collections.sort(libros, new OrdenarPorTitulo());
        System.out.println("Listar libros ordenados por título:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

	public void listarLibrosOrdenadosPorAnyoPublicacion() {
        Collections.sort(libros, new OrdenarPorAño());
        System.out.println("Listar libros ordenados por año de publicación:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

	public void buscarLibrosPorGenero(String genero) {
		List<Libro> librosGenero = new ArrayList<>();
		for (Libro libro : libros) {
			if (libro.getGenero().equalsIgnoreCase(genero)) {
				librosGenero.add(libro);
			}
		}
		listarLibros(librosGenero, "Libros de género " + genero + ":");
	}

	private void listarLibros(List<Libro> libros, String mensaje) {
		System.out.println(mensaje);
		for (Libro libro : libros) {
			System.out.println(libro);
		}
	}
}
