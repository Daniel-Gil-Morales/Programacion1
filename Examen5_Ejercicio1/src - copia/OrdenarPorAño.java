import java.util.Comparator;

public class OrdenarPorAño implements Comparator<Libro> {
	
    @Override
    public int compare(Libro libro1, Libro libro2) {
    	
        return Integer.compare(libro2.getAnyoPublicacion(), libro1.getAnyoPublicacion());
    }
    
}