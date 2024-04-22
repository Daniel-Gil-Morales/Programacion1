import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Empleado implements Comparable<Empleado> {
    private int id;
    private String nombre;
    private String departamento;
    private double salario;

    public Empleado(int id, String nombre, String departamento, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Departamento: " + departamento + ", Salario: " + salario;
    }

    @Override
    public int compareTo(Empleado otroEmpleado) {
        return this.nombre.compareTo(otroEmpleado.nombre);
    }

    public static class ComparadorPorSalario implements java.util.Comparator<Empleado> {
        @Override
        public int compare(Empleado emp1, Empleado emp2) {
            return Double.compare(emp2.salario, emp1.salario);
        }
    }
}