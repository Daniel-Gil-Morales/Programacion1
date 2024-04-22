package Ejercicio2;

public class CuentaBancaria {

	String titular;
    double saldo;
	
	public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cant) {
        if (cant > 0) {
            saldo += cant;
            System.out.println("Depósito de " + cant + "€ realizado con éxito.");
        } else {
            System.out.println("El monto del depósito debe ser mayor que cero.");
        }
    }

    public void retirar(double cant) {
        if (cant > 0 && cant <= saldo) {
            saldo -= cant;
            System.out.println("Retiro de $" + cant + " realizado con éxito.");
        } else {
            System.out.println("Monto insuficiente para realizar el retiro.");
        }
    }

    public void obtenerSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: €" + saldo);
    }
}
