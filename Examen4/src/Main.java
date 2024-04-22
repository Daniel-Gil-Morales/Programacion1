
public class Main {
    public static void main(String[] args) {
    	
        // Creación de materiales
        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954, "1234567890");
        Revista revista1 = new Revista("National Geographic", "National Geographic Society", 2020, "0987654321");
        Periodico periodico1 = new Periodico("The New York Times", "The New York Times Company", 2020, "01-01-2020");

        // Creación del gestor de préstamos
        GestorDePrestamos gestor = new GestorDePrestamos();

        // Mostrar información de los materiales
        System.out.println("Información de los materiales:");
        libro1.mostrarInformacion();
        revista1.mostrarInformacion();
        periodico1.mostrarInformacion();

        // Prestar materiales
        System.out.println();
        System.out.println("\nPrestar el libro y la revista:");
        gestor.prestarMaterial(libro1);
        gestor.prestarMaterial(revista1);

        // Verificar estado del préstamo
        System.out.println("\nVerificar estado del préstamo:");
        System.out.println("El libro está prestado? " + gestor.estaPrestado(libro1));
        System.out.println("La revista está prestada? " + gestor.estaPrestado(revista1));

        // Devolver materiales
        System.out.println("\nDevolver el libro:");
        gestor.devolverMaterial(libro1);

        // Verificar estado del préstamo después de devolver
        System.out.println("\nVerificar estado del préstamo después de devolver:");
        System.out.println("El libro está prestado? " + gestor.estaPrestado(libro1));
        
    }
}