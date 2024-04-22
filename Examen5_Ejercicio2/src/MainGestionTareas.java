
import java.util.Scanner;


public class MainGestionTareas {
    public static void main(String[] args) {
        SistemaGestionTareas sistema = new SistemaGestionTareas();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Sistema de Gestión de Tareas ===");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Eliminar tarea");
           System.out.println("4. Marcar tarea como completada");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Introduce la categoría de la tarea ('Personal' o 'Laboral'):");
                    String categoria = scanner.nextLine();
                    System.out.println("Introduce la descripción de la tarea:");
                    String descripcion = scanner.nextLine();
                    sistema.agregarTarea(categoria, descripcion);
                    break;
                case 2:
                    sistema.mostrarTareas();
                    break;
                case 3:
                    System.out.println("Introduce el ID de la tarea a eliminar:");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    sistema.eliminarTarea(idEliminar);
                    break;
                case 4:
                    System.out.println("Introduce el ID de la tarea a marcar como completada:");
                    int idCompletar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    sistema.marcarTareaComoCompletada(idCompletar);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
