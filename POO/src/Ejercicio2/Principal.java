package Ejercicio2;

public class Principal {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 1000.0);
		CuentaBancaria cuenta2 = new CuentaBancaria("María García", 500.0);

		cuenta1.depositar(200.0);
		cuenta1.retirar(50.0);

		cuenta2.depositar(100.0);
		cuenta2.retirar(600.0);

		System.out.println();
		cuenta1.obtenerSaldo();
		System.out.println();
		cuenta2.obtenerSaldo();

	}

}
