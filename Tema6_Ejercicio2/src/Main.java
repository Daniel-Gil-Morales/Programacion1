
public class Main {
    public static void main(String[] args) {
        SistemaDeGestionDeTareas sistema = new SistemaDeGestionDeTareas();

        // Agregar algunas tareas
        sistema.agregarTarea("Personal", new Tarea(1, "Ir al médico", false));
        sistema.agregarTarea("Personal", new Tarea(2, "Leer un libro", false));
        sistema.agregarTarea("Laboral", new Tarea(3, "Preparar reunión con clientes", false));
        sistema.agregarTarea("Laboral", new Tarea(4, "Actualizar reportes", false));

        // Mostrar tareas antes de la modificación
        System.out.println("Tareas después de agregar:");
        sistema.mostrarTareas();

        // Marcar una tarea como completada
        sistema.marcarTareaComoCompletada(1);

        // Mostrar tareas después de marcar una como completada
        System.out.println("Tareas después de marcar como completada:");
        sistema.mostrarTareas();

        // Eliminar una tarea
        sistema.eliminarTarea(3);

        // Mostrar tareas después de eliminar
        System.out.println("Tareas después de eliminar:");
        sistema.mostrarTareas();
    }
}