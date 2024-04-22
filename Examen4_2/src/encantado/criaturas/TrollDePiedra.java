
package encantado.criaturas;

import encantado.habilidades.Magico;

public class TrollDePiedra extends Criatura implements Magico {
	
    private int factorRegeneracion;

    public TrollDePiedra(String nombre, int edad, int factorRegeneracion) {
        super(nombre, edad);
        this.factorRegeneracion = factorRegeneracion;
    }

    @Override
    public void demostrarHabilidad() {
        System.out.println(nombre + " describe la capacidad de regeneración del troll.");
    }

    @Override
    public void demostrarHabilidadMagica() {
        System.out.println(nombre + " muestra su fortaleza incrementada mediante habilidades mágicas.");
    }
}