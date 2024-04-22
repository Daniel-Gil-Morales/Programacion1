import java.util.Scanner;

public class Ejercicio4DanielGilMorales {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);

		while (true) {
			int cantidadCafe = 0;
			int cantidadTe = 0;
			int cantidadPastel = 0;
			int cantidadSandwich = 0;
			double total = 0;

			System.out.println("Bienvenido a la Cafetería");
			System.out.println("Menú:");
			System.out.println("1. Café - 2.5€");
			System.out.println("2. Té - 2.0€");
			System.out.println("3. Pastel - 3.0€");
			System.out.println("4. Sándwich - 4.0€");
			System.out.println("5. Terminar");
			System.out.println("6. Cancelar");

			while (true) {
				System.out.print("Seleccione un número para elegir un producto: ");
				int opcion = t.nextInt();

				double precio = 0;

				System.out.println();
				
				switch (opcion) {
				case 1:
					cantidadCafe++;
					precio = 2.5;
					break;
				case 2:
					cantidadTe++;
					precio = 2.0;
					break;
				case 3:
					cantidadPastel++;
					precio = 3.0;
					break;
				case 4:
					cantidadSandwich++;
					precio = 4.0;
					break;
				case 5:
					System.out.println("Resumen del Pedido:");
					System.out.println("Café - Cantidad: " + cantidadCafe + " - Precio Total: " + (cantidadCafe * 2.5) + "€");
					System.out.println("Té - Cantidad: " + cantidadTe + " - Precio Total: " + (cantidadTe * 2.0) + "€");
					System.out.println("Pastel - Cantidad: " + cantidadPastel + " - Precio Total: " + (cantidadPastel * 3.0) + "€");
					System.out.println("Sándwich - Cantidad: " + cantidadSandwich + " - Precio Total: " + (cantidadSandwich * 4.0) + "€");
					System.out.println("Precio Total del Pedido: " + total + "€");
					System.out.println("Pedido terminado. Gracias por su compra.");
					return;
				case 6:
					System.out.println("Pedido cancelado. No se realizará ninguna compra.");
					return;
				default:
					System.out.println("Opción no válida. Por favor, seleccione un número válido.");
					break;
				}

				total = total + precio;
				System.out.println("Ha seleccionado - Cantidad: 1 - Precio: " + precio + "€");
				System.out.println("Total acumulado: " + total + "€");
				System.out.println();
			}
		}
	}

}