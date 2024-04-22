
import java.util.*;

class Tarea {
	private Integer id;
	private String descripcion;
	private Boolean completada;

	public Tarea(Integer id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
		this.completada = false;
	}

	public Integer getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Boolean getCompletada() {
		return completada;
	}

	public void setCompletada(Boolean completada) {
		this.completada = completada;
	}

	@Override
	public String toString() {
		return "id=" + id + ", descripcion=" + descripcion + ", completada=" + completada;
	}
}