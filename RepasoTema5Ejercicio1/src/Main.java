import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            int opcion = obtenerOpcionMenu(scanner);

            switch (opcion) {
                case 1:
                    agregarEmpleado(scanner, listaEmpleados);
                    break;
                case 2:
                    mostrarEmpleadosOrdenadosPorNombre(listaEmpleados);
                    break;
                case 3:
                    mostrarEmpleadosOrdenadosPorSalario(listaEmpleados);
                    break;
                case 4:
                    buscarPorDepartamento1(scanner, listaEmpleados);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
                    break;
            }
        }
    }

    private static int obtenerOpcionMenu(Scanner scanner) {
        int opcion = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados ordenados por nombre");
            System.out.println("3. Mostrar empleados ordenados por salario");
            System.out.println("4. Búsqueda por departamento");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción:");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea después de nextInt()

                if (opcion >= 1 && opcion <= 5) {
                    entradaValida = true;
                } else {
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
                }
            } else {
                System.out.println("Por favor ingresa un número válido.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
        return opcion;
    }

    private static void agregarEmpleado(Scanner scanner, ArrayList<Empleado> listaEmpleados) {
        System.out.println("Ingrese el ID del empleado:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt()

        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el departamento del empleado:");
        String departamento = scanner.nextLine();

        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();

        listaEmpleados.add(new Empleado(id, nombre, departamento, salario));
        System.out.println("Empleado agregado correctamente.");
    }

    private static void mostrarEmpleadosOrdenadosPorNombre(ArrayList<Empleado> listaEmpleados) {
        if (listaEmpleados.isEmpty()) {
            System.out.println("La lista de empleados está vacía.");
            return;
        }

        listaEmpleados.sort(null); // Usa el compareTo de Empleado para ordenar por nombre

        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado);
        }
    }

    private static void mostrarEmpleadosOrdenadosPorSalario(ArrayList<Empleado> listaEmpleados) {
        if (listaEmpleados.isEmpty()) {
            System.out.println("La lista de empleados está vacía.");
            return;
        }

        listaEmpleados.sort(new Empleado.ComparadorPorSalario()); // Usa el comparador por salario

        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado);
        }
    }

    private static void buscarPorDepartamento1(Scanner scanner, ArrayList<Empleado> listaEmpleados) {
        System.out.println("Ingrese el nombre del departamento:");
        String departamento = scanner.nextLine();

        boolean encontrado = false;
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getDepartamento().equalsIgnoreCase(departamento)) {
                System.out.println(empleado);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron empleados en el departamento especificado.");
        }
    }
    
    private static void buscarPorDepartamento(Scanner scanner, ArrayList<Empleado> listaEmpleados) {
        System.out.println("Ingrese el nombre del departamento:");
        String departamento = scanner.nextLine();

        boolean encontrado = false;
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getDepartamento().equalsIgnoreCase(departamento)) {
                System.out.println(empleado);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron empleados en el departamento especificado.");
        }
    }
}