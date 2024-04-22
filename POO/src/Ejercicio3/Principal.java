package Ejercicio3;

public class Principal {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Tu padre", "El tuyo", 25.99);
		Libro libro2 = new Libro("Joselito", "Joselito y compañia", 20.50);

		TiendaLibros tienda = new TiendaLibros(5);

		tienda.agregarLibro(libro1);
		tienda.agregarLibro(libro2);

		tienda.mostrarLibros();

		tienda.buscarLibroPorTitulo("Tu padre");
		tienda.buscarLibroPorTitulo("Joselito");

	}

}
