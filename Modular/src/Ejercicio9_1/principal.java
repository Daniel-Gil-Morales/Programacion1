package Ejercicio9_1;

public class principal {

    public static void main(String[] args) {
        entradaSalida.escribir("Hola, esto es una prueba.");

        String texto = entradaSalida.leerCadena();
        entradaSalida.escribir("Has ingresado: " + texto);

        int numero = entradaSalida.leerEntero();
        entradaSalida.escribir("Has ingresado el número: " + numero);
    }
}
