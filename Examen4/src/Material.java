
abstract class Material {
	
    protected String titulo;
    protected String autor;
    protected int añoPublicacion;
    

    public Material(String titulo, String autor, int añoPublicacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
	}

	public abstract void describirMaterial();

    public void mostrarInformacion() {
        System.out.print("Título: " + titulo + ", Autor: " + autor + ", Año: " + añoPublicacion);
    }
    
}