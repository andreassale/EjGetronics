import Servicios.ServicioProductos;

public class Main {
    public static void main(String[] args) {
        ServicioProductos servicio = new ServicioProductos();
        servicio.crearProductos();
        servicio.ordenarProductoMasCaro();
        servicio.mostrarProductoMasCaro();
        servicio.ordenarProductoMasBarato();
        servicio.mostrarProductoMasBarato();
    }
}