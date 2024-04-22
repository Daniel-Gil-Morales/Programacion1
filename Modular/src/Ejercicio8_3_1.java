public class Ejercicio8_3_1 {

	public static void main(String[] args) {

		float numero1 = 5.0f;
		float numero2 = 3.2f;

		float valorAlCubo1, valorAlCubo2;

		valorAlCubo1 = calcularCubo(numero1);
		valorAlCubo2 = calcularCubo(numero2);

		System.out.println("El cubo de " + numero1 + " es " + valorAlCubo1);
		System.out.println("El cubo de " + numero2 + " es " + valorAlCubo2);

	}

	public static float calcularCubo(float n) {
		float cubo = 0.0f;
		cubo = n * n * n;
		return cubo;
	}

}