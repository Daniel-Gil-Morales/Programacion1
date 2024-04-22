
class Revista extends Material implements Prestable {
	
    private String ISSN;
    private boolean prestado;

    public Revista(String titulo, String autor, int añoPublicacion, String ISSN) {
        super(titulo, autor, añoPublicacion);
        this.ISSN = ISSN;
        this.prestado = false;
    }

    @Override
    public void describirMaterial() {
    	System.out.println("La revista tiene el ISSN: " + ISSN);
    }

    @Override
    public void prestar() {
    	if (prestado == false) {
        	
            prestado = true;
            System.out.println("Material prestado exitosamente.");
            
        } else {
        	
            System.out.println("El material ya está prestado.");
            
        }
    }

    @Override
    public void devolver() {
        prestado = false;
        System.out.println("Material devuelto exitosamente.");
        
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("ISSN: " + ISSN);
    }
    
}
