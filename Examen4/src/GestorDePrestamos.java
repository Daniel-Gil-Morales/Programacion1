
class GestorDePrestamos {
	
    public void prestarMaterial(Prestable p) {
        p.prestar();
    }

    public void devolverMaterial(Prestable p) {
        p.devolver();
    }

    public boolean estaPrestado(Prestable p) {
        return p.estaPrestado();
    }
    
}