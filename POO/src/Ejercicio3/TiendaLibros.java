package Ejercicio3;

public class TiendaLibros {
	
	Libro[] inventario;
    int cantidadLibros;

    public TiendaLibros(int capacidadMaxima) {
        inventario = new Libro[capacidadMaxima];
        cantidadLibros = 0;
    }

    public void agregarLibro(Libro libro) {
        if (cantidadLibros < inventario.length) {
            inventario[cantidadLibros] = libro;
            cantidadLibros++;
            System.out.println("Libro agregado al inventario.");
        } else {
            System.out.println("Inventario lleno. No se puede agregar más libros.");
        }
    }

    public void mostrarLibros() {
        System.out.println("Libros disponibles en la tienda:");
        System.out.println();
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println("Título: " + inventario[i].getTitulo());
            System.out.println("Autor: " + inventario[i].getAutor());
            System.out.println("Precio: $" + inventario[i].getPrecio());
            System.out.println();
        }
    }

    public void buscarLibroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadLibros; i++) {
            if (inventario[i].getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro encontrado:");
                System.out.println("Título: " + inventario[i].getTitulo());
                System.out.println("Autor: " + inventario[i].getAutor());
                System.out.println("Precio: $" + inventario[i].getPrecio());
                System.out.println();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Libro no encontrado en la tienda.");
        }
    }
}
