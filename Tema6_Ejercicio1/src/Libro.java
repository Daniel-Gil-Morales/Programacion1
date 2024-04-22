
import java.io.*;
import java.util.*;

class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String titulo;
    private String autor;
    private int anyoPublicacion;
    private String genero;

    public Libro(String titulo, String autor, int anyoPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + anyoPublicacion + ", Género: " + genero;
    }
}