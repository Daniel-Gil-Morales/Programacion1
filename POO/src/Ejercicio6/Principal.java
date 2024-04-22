package Ejercicio6;

public class Principal {

	public static void main(String[] args) {

        Estudiante alumno1 = new Estudiante();

        System.out.println();
        System.out.println("Detalles del estudiante:");
        alumno1.mostrarInformacion();

        System.out.println();
        System.out.println("¿" + alumno1.nombre + " ha aprobado? " + Estudiante.aprobo(alumno1.getNota()));
        System.out.println("¿" + alumno1.nombre + " es menor de edad? " + Estudiante.esMenorDeEdad(alumno1.getEdad()));

        Curso curso = new Curso(3);

        curso.agregarEstudiante(alumno1);
        curso.agregarEstudiante(new Estudiante("Pedrin", 21, 9));
        curso.agregarEstudiante(new Estudiante("Fialho", 19, 2));
       
        System.out.println();
        System.out.println("Información de los estudiantes en el curso:");
        System.out.println();
        
        curso.mostrarInformacionEstudiantes();

        System.out.println();
        System.out.println("Número de estudiantes aprobados en el curso: " + curso.contarAprobados());
    }

}
