
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class SistemaGestionTareas {
	private Map<String, List<Tarea>> tareas;
	private Set<Tarea> historicoTareas;

	public SistemaGestionTareas() {
		tareas = new HashMap<>();
		tareas.put("Personal", new ArrayList<>());
		tareas.put("Laboral", new ArrayList<>());
		historicoTareas = new HashSet<>();
	}

	public void agregarTarea(String categoria, String descripcion) {
		List<Tarea> lista = tareas.get(categoria);
		if (lista != null) {
			Tarea tarea = new Tarea(lista.size() + 1, descripcion);
			lista.add(tarea);
			System.out.println("Tarea agregada correctamente.");
		} else {
			System.out.println("Categoría no válida.");
		}
	}

	public void mostrarTareas() {
		System.out.println("=== Tareas ===");
		for (Map.Entry<String, List<Tarea>> entry : tareas.entrySet()) {
			System.out.println("Categoría: " + entry.getKey());
			System.out.println("Pendientes:");
			for (Tarea tarea : entry.getValue()) {
				if (!tarea.getCompletada()) {
					System.out.println(tarea);
				}
			}
			System.out.println("Completadas:");
			for (Tarea tarea : entry.getValue()) {
				if (tarea.getCompletada()) {
					System.out.println(tarea);
				}
			}
		}
	}

	public void eliminarTarea(Integer id) {
		for (List<Tarea> lista : tareas.values()) {
			for (Tarea tarea : lista) {
				if (tarea.getId().equals(id)) {
					lista.remove(tarea);
					historicoTareas.add(tarea);
					System.out.println("Tarea eliminada correctamente");
					return;
				}
			}
		}
		System.out.println("No se encontró ninguna tarea con ese id");
	}

	public void marcarTareaComoCompletada(Integer id) {
		Tarea tarea = buscarTareaPorId(id);
		if (tarea != null) {
			tarea.setCompletada(true);
			historicoTareas.add(tarea);
			System.out.println("La tarea ha sido marcada como completada.");
		} else {
			System.out.println("No se encontró ninguna tarea con ese ID.");
		}
	}

	private Tarea buscarTareaPorId(Integer id) {
		for (List<Tarea> lista : tareas.values()) {
			for (Tarea tarea : lista) {
				if (tarea.getId().equals(id)) {
					return tarea;
				}
			}
		}
		return null;
	}

	public Object getHistoricoTareas() {
		// TODO Auto-generated method stub
		return null;
	}
}