package Ejercicio5;

public class GestorEmpleados {
	
	Empleado[] empleados;
    int numEmpleados;

    public GestorEmpleados(int capacidadMaxima) {
        empleados = new Empleado[capacidadMaxima];
        numEmpleados = 0;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (numEmpleados < empleados.length) {
            empleados[numEmpleados] = empleado;
            numEmpleados++;
            System.out.println("Empleado agregado al sistema.");
        } else {
            System.out.println("No se puede agregar más empleados. Capacidad máxima alcanzada.");
        }
    }
    
    public void mostrarEmpleados() {
        System.out.println("Lista de Empleados:");
        for (int i = 0; i < numEmpleados; i++) {
            empleados[i].mostrarInformacion();
            System.out.println("--------------------");
        }
    }
    
    public static double calcularSalarioTotal(GestorEmpleados gestor) {
        double salarioTotal = 0;
        for (int i = 0; i < gestor.numEmpleados; i++) {
            salarioTotal += gestor.empleados[i].getSalario();
        }
        return salarioTotal;
    }

	public static double calcularSalarioTotal(Empleado[] empleados2) {
		
		return 0;
	}

}
