package Ejercicio6;

public class Estudiante {

	String nombre;
    int edad;
    double nota;

    public Estudiante() {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public Estudiante(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
    }

    public static boolean aprobo(double nota) {
        return nota >= 5.0;
    }

    public static boolean esMenorDeEdad(int edad) {
        return edad < 18;
    }    
}
