package ejercicio1XMLJSON;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.File;
import java.io.IOException;

@JacksonXmlRootElement(localName = "Producto")
class Producto {
    @JacksonXmlProperty
    private int id;
    @JacksonXmlProperty
    private String nombre;
    @JacksonXmlProperty
    private double precio;
    @JacksonXmlProperty
    private int cantidadEnStock;

    // Constructor por defecto necesario para Jackson
    public Producto() {}

    // Constructor con parámetros
    public Producto(int id, String nombre, double precio, int cantidadEnStock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    // Método para incrementar el precio en un 10% y reducir la cantidad en stock en 5 unidades
    public void modificarProducto() {
        precio *= 1.10; // Incremento del precio en un 10%
        cantidadEnStock -= 5; // Reducción de la cantidad en stock en 5 unidades
    }
}

