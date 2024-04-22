package com.registro.empleados;
import com.registro.Empleado;

public class Programador extends Empleado {
	
    private String lenguaje;

    public Programador(String nombre, int edad, double salario, String lenguaje) {
        super(nombre, edad, salario);
        this.lenguaje = lenguaje;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Lenguaje: " + lenguaje);
    }

    @Override
    public double calcularBonificacion() {
    	
        return super.calcularBonificacion() + getSalario() * 0.10;
    }
}
