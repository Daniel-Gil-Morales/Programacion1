
class Libro extends Material implements Prestable {
    private String ISBN;
    private boolean prestado;

    public Libro(String titulo, String autor, int añoPublicacion, String ISBN) {
        super(titulo, autor, añoPublicacion);
        this.ISBN = ISBN;
        this.prestado = false;
    }

    @Override
    public void describirMaterial() {
        System.out.println("Este es un libro con ISBN: " + ISBN);
    }


    @Override
    public void prestar() {
        if (!prestado) {
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
        System.out.println("ISBN: " + ISBN);
    }
    
}
