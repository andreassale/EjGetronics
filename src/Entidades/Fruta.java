package Entidades;

public class Fruta extends Producto {
    private String unidadDeVenta;

    public Fruta() {
    }

    public Fruta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    public Fruta(String unidadDeVenta, String nombre, Integer precio) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return this.unidadDeVenta;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getPrecio() {
        return this.precio;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " /// Precio: $" + this.precio + " /// Unidad de venta: " + this.unidadDeVenta;
    }
}
