package Ejercicio5;

public class Principal {
	public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados(5);

        Empleado empleado1 = new Empleado("Fernandiño", "Pintor", 60000);
        Empleado empleado2 = new Empleado("SuPadre", "Ayudante Pintor", 50000);

        gestor.agregarEmpleado(empleado1);
        gestor.agregarEmpleado(empleado2);

        gestor.mostrarEmpleados();

        double salarioTotal = GestorEmpleados.calcularSalarioTotal(gestor);
        System.out.println("Salario total de todos los empleados: $" + salarioTotal);

    }
}
