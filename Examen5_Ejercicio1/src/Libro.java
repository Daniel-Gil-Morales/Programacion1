import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Libro {
	
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero;

    public Libro(String titulo, String autor, int anyoPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anyoPublicacion;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnyoPublicacion() {
        return anoPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
    	
        return "titulo=" + titulo + ", autor=" + autor + ", anyoPublicacion=" + anoPublicacion + ", genero=" + genero;
    }
}







