package Ejemplo1;

public class Persona {

	String dni;
	String nombre;
	int edad;
	
	public Persona() {
		
	}
	
	public Persona(String nom) {
		nombre=nom;
	}
	
	public Persona(String nom, int ed) {
		nombre=nom;
		edad=ed;
	}
	
	public void saludar() {
		System.out.println("Hola mi nombre es: " + nombre);
	}
	
}
