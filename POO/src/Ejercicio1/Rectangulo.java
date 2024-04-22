package Ejercicio1;

public class Rectangulo {

	double ancho;
	double alto;
	
	public Rectangulo(double ancho, double alto) {
		this.alto=alto;
		this.ancho=ancho;
	}
	
	public double calcularArea() {
		
		return ancho*alto;
	}
	
	public double calcularPerimetro() {
		
		return 2*ancho+2*alto;
	}
	
}
