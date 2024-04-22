
package main;

import java.util.ArrayList;
import java.util.List;
import encantado.criaturas.*;
import encantado.habilidades.*;

public class RegistroCriaturas {
	public static void main(String[] args) {
		// Lista para todas las criaturas
		List<Criatura> todasLasCriaturas = new ArrayList<>();

		// Lista específicamente para criaturas mágicas
		List<Magico> criaturasMagicas = new ArrayList<>();

		// Creación de criaturas
		Dragon smaug = new Dragon("Smaug", 500, "Rojo");
		TrollDePiedra grendel = new TrollDePiedra("Grendel", 150, 20);
		Humano arthur = new Humano("Arthur", 35, 120); // Usando un nombre genérico para el humano

		// Agregar criaturas a la lista de todas las criaturas
		todasLasCriaturas.add(smaug);
		todasLasCriaturas.add(grendel);
		todasLasCriaturas.add(arthur);

		// Agregar criaturas mágicas a la lista de criaturas mágicas
		criaturasMagicas.add(smaug);
		criaturasMagicas.add(grendel); // Asumiendo que TrollDePiedra implementa Magico

		// Mostrar información de todas las criaturas
		System.out.println("Todas las criaturas:");
		for (Criatura criatura : todasLasCriaturas) {
			System.out.println(criatura.getNombre()); // Método implementado en Criatura
			criatura.mostrarInfo(); // Suponiendo que este método está implementado para imprimir información
									// relevante de la criatura
		}

		// Demostrar habilidades mágicas de las criaturas mágicas
		System.out.println("\nCriaturas mágicas:");
		for (Magico magico : criaturasMagicas) {
			magico.demostrarHabilidadMagica(); // Suponiendo que este método está implementado para mostrar las
												// habilidades mágicas
		}
	}
}