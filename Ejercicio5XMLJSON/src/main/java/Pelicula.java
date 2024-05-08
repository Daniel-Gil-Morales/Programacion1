
class Pelicula {
    private String id;
    private String titulo;
    private int votos;

    public Pelicula() {
        // Constructor por defecto necesario para la deserialización Jackson
    }

    public Pelicula(String id, String titulo, int votos) {
        this.id = id;
        this.titulo = titulo;
        this.votos = votos;
    }

    // Getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    // Método para incrementar el número de votos
    public void aumentarVotos() {
        this.votos++;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", votos=" + votos +
                '}';
    }
}