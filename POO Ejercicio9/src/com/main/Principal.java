package com.main;
import com.registro.Empleado;
import com.registro.empleados.Gerente;
import com.registro.empleados.Programador;

public class Principal {
	public static void main(String[] args) {

		Empleado empleado = new Empleado("Paco", 26, 40000.0);
		Gerente gerente = new Gerente("Zacarías", 20, 10000.0, "Finanzas");
		Gerente gerente2 = new Gerente("Fernando", 54, 45000.0, "RRHH");
		Programador programador = new Programador("Tupadre", 25, 100000.0, "Java");

		System.out.println("Información del empleado:");
		empleado.mostrarInformacion();
		System.out.println("Bonificación: " + empleado.calcularBonificacion());

		System.out.println();
		System.out.println("Información del gerente:");
		gerente.mostrarInformacion();
		System.out.println("Bonificación: " + gerente.calcularBonificacion());
		
		System.out.println();
		System.out.println("Información del gerente:");
		gerente2.mostrarInformacion();
		System.out.println("Bonificación: " + gerente2.calcularBonificacion());

		System.out.println();
		System.out.println("Información del programador:");
		programador.mostrarInformacion();
		System.out.println("Bonificación: " + programador.calcularBonificacion());
	}
}
