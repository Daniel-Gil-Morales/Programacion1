import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final String JSON_FILE_PATH = "src/main/resources/peliculas.json";

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Pelicula> peliculas = cargarPeliculasDesdeJSON(objectMapper);

        if (peliculas == null) {
            System.out.println("No se pudo cargar el archivo JSON.");
            return;
        }

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                mostrarMenu();
                int opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                        votarPorPelicula(scanner, peliculas);
                        guardarPeliculasEnJSON(objectMapper, peliculas);
                        break;
                    case 2:
                        mostrarPeliculas(peliculas);
                        break;
                    case 3:
                        System.out.println("¡Gracias por usar el sistema de votación!");
                        return;
                    default:
                        System.out.println("Opción inválida. Inténtalo de nuevo.");
                }
            }
        }
    }

    private static Map<String, Pelicula> cargarPeliculasDesdeJSON(ObjectMapper objectMapper) {
        try {
            return objectMapper.readValue(new File(JSON_FILE_PATH), objectMapper.getTypeFactory().constructMapType(HashMap.class, String.class, Pelicula.class));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    
    private static void guardarPeliculasEnJSON(ObjectMapper objectMapper, Map<String, Pelicula> peliculas) {
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(JSON_FILE_PATH), peliculas);
            System.out.println("Archivo JSON actualizado guardado en " + JSON_FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void mostrarMenu() {
        System.out.println("\n=== Sistema de Votación ===");
        System.out.println("1. Votar por una película");
        System.out.println("2. Mostrar películas");
        System.out.println("3. Salir");
        System.out.print("Ingrese su opción: ");
    }

    private static void votarPorPelicula(Scanner scanner, Map<String, Pelicula> peliculas) {
        System.out.println("Por favor, ingrese el ID de la película que desea votar:");
        String idPelicula = scanner.nextLine();
        Pelicula pelicula = peliculas.get(idPelicula);

        if (pelicula != null) {
            pelicula.setVotos(pelicula.getVotos() + 1);
            System.out.println("¡Voto registrado para la película '" + pelicula.getTitulo() + "'!");
        } else {
            System.out.println("No se encontró ninguna película con el ID proporcionado.");
        }
    }

    private static void mostrarPeliculas(Map<String, Pelicula> peliculas) {
        System.out.println("\n=== Películas ===");
        for (Pelicula pelicula : peliculas.values()) {
            System.out.println(pelicula.getTitulo() + " - Votos: " + pelicula.getVotos());
        }
    }
}