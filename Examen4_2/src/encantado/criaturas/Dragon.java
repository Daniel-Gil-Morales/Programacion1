package encantado.criaturas;

import encantado.habilidades.Magico;

public class Dragon extends Criatura implements Magico {
	
    private String color;

    public Dragon(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    @Override
    public void demostrarHabilidad() {
        System.out.println(nombre + " muestra cómo el dragón utiliza su aliento de fuego o su capacidad de vuelo.");
    }

    @Override
    public void demostrarHabilidadMagica() {
        System.out.println(nombre + " invoca tormentas con su habilidad mágica.");
    }
}
