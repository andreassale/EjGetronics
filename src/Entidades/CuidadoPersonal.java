package Entidades;

public class CuidadoPersonal extends Producto {
    private Integer contenido;

    public CuidadoPersonal() {
    }

    public CuidadoPersonal(Integer contenido) {
        this.contenido = contenido;
    }

    public CuidadoPersonal(Integer contenido, String nombre, Integer precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public Integer getContenido() {
        return this.contenido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getPrecio() {
        return this.precio;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " /// Contenido: " + this.contenido + "ml /// Precio: $" + this.precio;
    }
}
