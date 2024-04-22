
import java.io.*;
import java.util.*;

public class Tarea implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String descripcion;
    private boolean completada;

    public Tarea(Integer id, String descripcion, boolean completada) {
        this.id = id;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "ID: " + id + " - Descripción: " + descripcion + " - Completada: " + (completada ? "Sí" : "No");
    }
}