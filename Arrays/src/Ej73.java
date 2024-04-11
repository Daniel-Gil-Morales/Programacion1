import java.util.Scanner;

public class Ej73 {
    public static void main(String[] args) {
    	
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        Scanner t = new Scanner(System.in);
        
       System.out.println("Introduzca el mes: ");
       int mes=t.nextInt();
       
       while(mes >=1 && mes<=12){
    	   System.out.println(meses[mes-1]);
    	   System.out.println("Introduzca el mes: ");
    	   mes=t.nextInt();
       }
       System.out.println("Terminado. Ha introducido un valor no válido.");
    }
}