package Entidades;

public class Producto implements Comparable <Producto> {
    protected String nombre;
    protected Integer precio;

    public Producto() {
    }

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getPrecio() {
        return this.precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Productos{nombre=" + this.nombre + ", precio=" + this.precio + '}';
    }


    @Override
    public int compareTo(Producto o) {
        if (this.getPrecio() > o.getPrecio()) {
            return 1;
        } else if (this.getPrecio() < o.getPrecio()) {
            return -1;
        }else {
            return 0;
        }
    }
}
