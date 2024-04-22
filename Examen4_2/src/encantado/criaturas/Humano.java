
package encantado.criaturas;

public class Humano extends Criatura {
	
    private int inteligencia;

    public Humano(String nombre, int edad, int inteligencia) {
        super(nombre, edad);
        this.inteligencia = inteligencia;
    }

    @Override
    public void demostrarHabilidad() {
        System.out.println(nombre + " resalta habilidades como la resolución de problemas o la creación de herramientas.");
    }
   
}