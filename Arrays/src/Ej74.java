import java.util.Scanner;

public class Ej74 {
    public static void main(String[] args) {

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        Scanner t = new Scanner(System.in);

        System.out.println("Introduzca el número de mes (1-12): ");
        int mes = t.nextInt();

        while (mes >= 1 && mes <= 12) {
            String nombreMes = meses[mes - 1];
            System.out.println("El mes " + mes + " es " + nombreMes);
            System.out.println("Introduzca el número de mes (1-12): ");
            mes = t.nextInt();
        }
        
        System.out.println("Ha introducido un valor no válido.");
        
    }
}