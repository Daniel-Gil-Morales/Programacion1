
class Periodico extends Material {
	
    private String fechaPublicacion;

    public Periodico(String titulo, String autor, int añoPublicacion, String fechaPublicacion) {
        super(titulo, autor, añoPublicacion);
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public void describirMaterial() {
        System.out.println("El periódico fue publicado el " + fechaPublicacion);
    }
    
}