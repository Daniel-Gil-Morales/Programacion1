import java.util.Scanner;

public class Ejercicio2DanielGilMorales {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		System.out.println("Ingrese el cargo del empleado:");
		System.out.println("1 - Prog. junior");
		System.out.println("2 - Prog. senior");
		System.out.println("3 - Jefe de proyecto");
		int cargo = t.nextInt();

		System.out.println("¿Cuántos días ha estado de viaje visitando clientes durante el mes?");
		int viajes = t.nextInt();

		System.out.println("¿Cuál es su estado civil?:");
		System.out.println("1 - Soltero");
		System.out.println("2 - Casado");
		int estadoCivil = t.nextInt();

		double sueldoBase = 0.0;
		double sueldoBruto;
		double dietas = 0.0;
		double irpf;
		double retencion;
		double sueldoNeto;

		switch (cargo) {
		case 1:
			sueldoBase = 1100;
			break;
		case 2:
			sueldoBase = 1500;
			break;
		case 3:
			sueldoBase = 1700;
			break;
		default:
			System.out.println("No válido");
		}

		dietas = viajes * 30;

		sueldoBruto = sueldoBase + dietas;

		if (estadoCivil == 1) {
			irpf = 0.25;
		} else {
			irpf = 0.20;
		}

		retencion = sueldoBruto * irpf;

		sueldoNeto = sueldoBruto - retencion;

		System.out.println("Nómina del empleado:");
		System.out.println("********************");
		System.out.println("Sueldo base: " + sueldoBase + " euros");
		System.out.println("Dietas (" + viajes + " días): " + dietas + " euros");
		System.out.println("Sueldo bruto: " + sueldoBruto + " euros");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Retención IRPF (" + (irpf * 100) + "%): " + retencion + " euros");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Sueldo neto: " + sueldoNeto + " euros");

	}

}