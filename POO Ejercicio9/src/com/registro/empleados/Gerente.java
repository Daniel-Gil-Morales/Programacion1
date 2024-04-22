package com.registro.empleados;
import com.registro.Empleado;

public class Gerente extends Empleado {
	
    private String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }

    @Override
    public double calcularBonificacion() {
    	
        return super.calcularBonificacion() + getSalario() * 0.15;
    }
}
