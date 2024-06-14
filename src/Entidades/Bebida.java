package Entidades;

public class Bebida extends Producto {
    private double litros;

    public Bebida() {
    }

    public Bebida(double litros) {
        this.litros = litros;
    }

    public Bebida(double litros, String nombre, Integer precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return this.litros;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getPrecio() {
        return this.precio;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " /// Litros: " + this.litros + " /// Precio: $" + this.precio;
    }
}
