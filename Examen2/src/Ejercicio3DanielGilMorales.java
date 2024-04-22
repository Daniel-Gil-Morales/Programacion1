import java.util.Scanner;

public class Ejercicio3DanielGilMorales {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		double total = 0;

		while (true) {
			System.out.println("Bienvenido a la Cafetería");
			System.out.println("Menú:");
			System.out.println("1. Café - 2.5€");
			System.out.println("2. Té - 2.0€");
			System.out.println("3. Pastel - 3.0€");
			System.out.println("4. Sándwich - 4.0€");
			System.out.println("5. Terminar");
			System.out.println("6. Cancelar");

			System.out.print("Seleccione un producto: ");
			int opcion = t.nextInt();

			double precio = 0;

			System.out.println();
			
			switch (opcion) {
			case 1:
				System.out.println("Ha seleccionado Café - 2.5€");
				precio = 2.5;
				break;
			case 2:
				System.out.println("Ha seleccionado Té - 2.0€");
				precio = 2.0;
				break;
			case 3:
				System.out.println("Ha seleccionado Pastel - 3.0€");
				precio = 3.0;
				break;
			case 4:
				System.out.println("Ha seleccionado Sándwich - 4.0€");
				precio = 4.0;
				break;
			case 5:
				System.out.println("Pedido terminado. Total: " + total + "€. Gracias por su compra.");
				return;
			case 6:
				System.out.println("Pedido cancelado. No se realizará ninguna compra.");
				return;
			default:
				System.out.println("Opción no válida. Por favor, seleccione un número válido.");
				break;
			}

			total = total + precio;
			System.out.println("Precio del producto seleccionado: " + precio + "€");
			System.out.println("Total acumulado: " + total + "€");
			System.out.println();
		}
	}

}
