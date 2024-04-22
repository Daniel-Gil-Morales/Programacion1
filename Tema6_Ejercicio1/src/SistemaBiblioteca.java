
import java.io.*;
import java.util.*;

class SistemaBiblioteca {
    private ArrayList<Libro> libros;

    public SistemaBiblioteca() {
        libros = cargarLibrosDesdeArchivo();
    }

    public void agregarLibro(Scanner teclado) {
        System.out.print("Ingrese el título del libro: ");
        String titulo = teclado.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = teclado.nextLine();
        System.out.print("Ingrese el año de publicación del libro: ");
        int anyoPublicacion = teclado.nextInt();
        teclado.nextLine(); // Consumir la nueva línea
        System.out.print("Ingrese el género del libro: ");
        String genero = teclado.nextLine();

        libros.add(new Libro(titulo, autor, anyoPublicacion, genero));
        guardarLibrosEnArchivo();
        System.out.println("Libro agregado con éxito.");
    }

    public void listarLibrosOrdenadosPorTitulo() {
        ArrayList<Libro> copiaLibros = new ArrayList<>(libros);
        Collections.sort(copiaLibros, Comparator.comparing(Libro::getTitulo));
        System.out.println("\nLista de libros ordenados por título:");
        for (Libro libro : copiaLibros) {
            System.out.println(libro);
        }
    }

    public void listarLibrosOrdenadosPorAnyoPublicacion() {
        ArrayList<Libro> copiaLibros = new ArrayList<>(libros);
        Collections.sort(copiaLibros, Comparator.comparingInt(Libro::getAnyoPublicacion).reversed());
        System.out.println("\nLista de libros ordenados por año de publicación:");
        for (Libro libro : copiaLibros) {
            System.out.println(libro);
        }
    }

    public void buscarLibrosPorGenero(String genero) {
        System.out.println("\nLibros del género '" + genero + "':");
        for (Libro libro : libros) {
            if (libro.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(libro);
            }
        }
    }

    private ArrayList<Libro> cargarLibrosDesdeArchivo() {
        File archivo = new File("biblioteca.dat");
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                return (ArrayList<Libro>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al cargar los libros desde el archivo.");
            }
        } else {
            return cargarLibrosDesdeTexto("libros_iniciales.txt");
        }
        return new ArrayList<>();
    }

    private void guardarLibrosEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("biblioteca.dat"))) {
            oos.writeObject(libros);
        } catch (IOException e) {
            System.err.println("Error al guardar los libros en el archivo.");
        }
    }

    private ArrayList<Libro> cargarLibrosDesdeTexto(String archivo) {
        ArrayList<Libro> libros = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(archivo))) {
            while (scanner.hasNextLine()) {
                String[] datos = scanner.nextLine().split(":");
                String titulo = datos[0];
                String autor = datos[1];
                int anyoPublicacion = Integer.parseInt(datos[2]);
                String genero = datos[3];
                libros.add(new Libro(titulo, autor, anyoPublicacion, genero));
            }
        } catch (FileNotFoundException e) {
            System.err.println("No se encontró el archivo: " + archivo);
        }
        return libros;
    }
}