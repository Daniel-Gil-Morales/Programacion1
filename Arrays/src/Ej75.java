
public class Ej75 {

	public static void main(String[] args) {
        
		final int TAMANYO=10;
        double numeros[] = {10.0,15.0,1.0,4.0,5.0,7.0,8.0,21.0,25.0,27.0};
        double media, varianza, desviacion;
		double suma=0.0;
        
		//Calcular promedio
		for (int i=0; i<TAMANYO; i++) {
			suma=suma+numeros[i];
		}
		media=suma/10.0;
		
        System.out.println("La media aritmética es: " + media);
		
        //Calcular varianza
        double sumaVarianza=0.0;
        for (int i=0; i<TAMANYO; i++) {
			sumaVarianza=sumaVarianza+(numeros[i]-media)*(numeros[i]-media);
		}
        varianza=sumaVarianza/(TAMANYO-1);
        System.out.println("La varianza es: " + varianza);
        desviacion=Math.sqrt(varianza);
        
        
	}

}
