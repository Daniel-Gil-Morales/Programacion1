
package encantado.criaturas;

public abstract class Criatura {
	
    protected String nombre;
    protected int edad;

    public Criatura(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
    }

    public abstract void demostrarHabilidad();
    
}