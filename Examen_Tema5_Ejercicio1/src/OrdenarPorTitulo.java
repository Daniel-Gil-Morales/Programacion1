import java.util.Comparator;

public class OrdenarPorTitulo implements Comparator<Libro> {
	
    @Override
    public int compare(Libro libro1, Libro libro2) {
    	
        return libro1.getTitulo().compareTo(libro2.getTitulo());
    }
    
}