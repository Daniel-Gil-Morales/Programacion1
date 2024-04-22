package Ejercicio5;

public class Empleado {

	String nombre;
    String puesto;
    double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
    }
    
    public static double calcularSalarioTotal(GestorEmpleados gestor) {
        double salarioTotal = 0;
        for (Empleado empleado : gestor.empleados) {
            salarioTotal += empleado.getSalario();
        }
        return salarioTotal;
    }


	public double getSalario() {
		// TODO Auto-generated method stub
		return salario;
	}	
}
