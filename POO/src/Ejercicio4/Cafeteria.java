package Ejercicio4;

import java.text.DecimalFormat;

class Cafeteria {
	static final double PRECIO_EXPRESSO_PEQUENO = 1.0;
    static final double PRECIO_EXPRESSO_GRANDE = 1.1;
    static final double PRECIO_AMERICANO_PEQUENO = 1.1;
    static final double PORCENTAJE_AUMENTO_AMERICANO = 0.1;
    static final double PORCENTAJE_AUMENTO_CON_LECHE = 0.15;
    static final double PORCENTAJE_AUMENTO_CON_AZUCAR = 0.05;

    public static void realizarPedidoExpressoPequeno(boolean conLeche, boolean conAzucar) {
        double precio = PRECIO_EXPRESSO_PEQUENO;
        if (conLeche) {
            precio += (precio * PORCENTAJE_AUMENTO_CON_LECHE);
        }
        if (conAzucar) {
            precio += (precio * PORCENTAJE_AUMENTO_CON_AZUCAR);
        }
        mostrarRecibo("Café Expresso Pequeño", precio);
    }

    public static void realizarPedidoExpressoGrande(boolean conLeche, boolean conAzucar) {
        double precio = PRECIO_EXPRESSO_GRANDE;
        if (conLeche) {
            precio += (precio * PORCENTAJE_AUMENTO_CON_LECHE);
        }
        if (conAzucar) {
            precio += (precio * PORCENTAJE_AUMENTO_CON_AZUCAR);
        }
        mostrarRecibo("Café Expresso Grande", precio);
    }

    public static void realizarPedidoAmericanoPequeno(boolean conLeche, boolean conAzucar) {
        double precio = PRECIO_AMERICANO_PEQUENO + (PRECIO_AMERICANO_PEQUENO * PORCENTAJE_AUMENTO_AMERICANO);
        if (conLeche) {
            precio += (precio * PORCENTAJE_AUMENTO_CON_LECHE);
        }
        if (conAzucar) {
            precio += (precio * PORCENTAJE_AUMENTO_CON_AZUCAR);
        }
        mostrarRecibo("Café Americano Pequeño", precio);
    }

    public static void realizarPedidoAmericanoGrande(boolean conLeche, boolean conAzucar) {
        double precio = (PRECIO_AMERICANO_PEQUENO + (PRECIO_AMERICANO_PEQUENO * PORCENTAJE_AUMENTO_AMERICANO)) + PRECIO_AMERICANO_PEQUENO;
        if (conLeche) {
            precio += (precio * PORCENTAJE_AUMENTO_CON_LECHE);
        }
        if (conAzucar) {
            precio += (precio * PORCENTAJE_AUMENTO_CON_AZUCAR);
        }
        mostrarRecibo("Café Americano Grande", precio);
    }

    private static void mostrarRecibo(String producto, double precio) {
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("Producto: " + producto);
        System.out.println("Precio: " + formato.format(precio) + "€");
        System.out.println("-----");
    }
}
