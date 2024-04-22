package Ejercicio6;

public class Curso {

	Estudiante[] estudiantes;
	int estudiantesAprobados;

	public Curso(int capacidadMaxima) {
		this.estudiantes = new Estudiante[capacidadMaxima];
		this.estudiantesAprobados = 0;
	}

	public void agregarEstudiante(Estudiante estudiante) {
		estudiantes[estudiantesAprobados] = estudiante;
		if (Estudiante.aprobo(estudiante.getNota())) {
			estudiantesAprobados++;
		}
	}

	public int contarAprobados() {
		return estudiantesAprobados;
	}

	public void mostrarInformacionEstudiantes() {
		for (Estudiante estudiante : estudiantes) {
			if (estudiante != null) {
				estudiante.mostrarInformacion();
				System.out.println();
			}
		}
	}

}
