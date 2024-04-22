
import java.io.*;
import java.util.*;

public class SistemaDeGestionDeTareas {
    private Map<String, List<Tarea>> tareas;
    private String archivoTareas = "tareas.dat";

    public SistemaDeGestionDeTareas() {
        tareas = cargarTareas();
    }

    public void agregarTarea(String categoria, Tarea tarea) {
        if (!tareas.containsKey(categoria)) {
            tareas.put(categoria, new ArrayList<>());
        }
        tareas.get(categoria).add(tarea);
        guardarTareas();
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        for (Map.Entry<String, List<Tarea>> entry : tareas.entrySet()) {
            System.out.println("\nCategoría: " + entry.getKey());
            System.out.println("Tareas Pendientes:");
            List<Tarea> pendientes = new ArrayList<>();
            List<Tarea> completadas = new ArrayList<>();
            for (Tarea tarea : entry.getValue()) {
                if (tarea.isCompletada()) {
                    completadas.add(tarea);
                } else {
                    pendientes.add(tarea);
                }
            }
            mostrarListaTareas(pendientes);
            System.out.println("Tareas Completadas:");
            mostrarListaTareas(completadas);
        }
    }

    private void mostrarListaTareas(List<Tarea> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay tareas en esta categoría.");
            return;
        }
        for (Tarea tarea : lista) {
            System.out.println("- " + tarea);
        }
    }

    public void eliminarTarea(Integer id) {
        for (List<Tarea> listaTareas : tareas.values()) {
            Iterator<Tarea> iterator = listaTareas.iterator();
            while (iterator.hasNext()) {
                Tarea tarea = iterator.next();
                if (tarea.getId().equals(id)) {
                    iterator.remove();
                    break;
                }
            }
        }
        guardarTareas();
    }

    public void marcarTareaComoCompletada(Integer id) {
        for (List<Tarea> listaTareas : tareas.values()) {
            for (Tarea tarea : listaTareas) {
                if (tarea.getId().equals(id)) {
                    tarea.setCompletada(true);
                    break;
                }
            }
        }
        guardarTareas();
    }

    private void guardarTareas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoTareas))) {
            oos.writeObject(tareas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private Map<String, List<Tarea>> cargarTareas() {
        Map<String, List<Tarea>> tareas = new HashMap<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoTareas))) {
            tareas = (Map<String, List<Tarea>>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo de tareas. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar las tareas desde el archivo. Se creará uno nuevo.");
        }
        return tareas;
    }
}