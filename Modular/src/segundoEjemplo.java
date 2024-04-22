
public class segundoEjemplo {

	public static void main(String[] args) {

		double numero1 = 5.0, numero2 = 7.0;
		double suma = 0, resta = 0, mult = 0, div = 0;

		suma = sumar(numero1, numero2);
		System.out.println("Suma: " + suma);

		System.out.println();
		
		resta = restar(numero1, numero2);
		System.out.println("Resta: " + resta);
		
		System.out.println();
		
		mult = mult(numero1, numero2);
		System.out.println("Multiplicación: " + mult);
		
		System.out.println();
		
		div = div(numero1, numero2);
		System.out.println("División: " + div);
		
		
	}

	public static double sumar(double n1, double n2) {

		double suma = n1 + n2;
		return suma;

	}

	public static double restar(double n1, double n2) {

		double resta = n1 - n2;
		return resta;

	}

	public static double mult(double n1, double n2) {

		double mult = n1 * n2;
		return mult;

	}
	
	public static double div(double n1, double n2) {

		double div = n1 / n2;
		return div;

	}

}
