package Servicios;

import Entidades.Bebida;
import Entidades.CuidadoPersonal;
import Entidades.Fruta;
import Entidades.Producto;

import java.util.*;

public class ServicioProductos{
    List<Producto> productos = new ArrayList();

    public void crearProductos() {
        Producto Bebida = new Bebida(1.5, "Coca-Cola Zero", 20);
        productos.add(Bebida);
        Producto Bebida1 = new Bebida(1.5, "Coca-Cola", 18);
        productos.add(Bebida1);
        Producto CuidadoPersonal = new CuidadoPersonal(500, "Shampoo Sedal", 19);
        productos.add(CuidadoPersonal);
        Producto Fruta = new Fruta("kilo", "Frutillas", 64);
        productos.add(Fruta);

        for (Producto p : productos){
            System.out.println(p);
        }

        System.out.println("=============================");
    }

    public void ordenarProductoMasCaro() {
        Collections.reverse(productos);
    }

    public void ordenarProductoMasBarato() {
        Collections.sort(productos);
    }

    public void mostrarProductoMasCaro() {
        Iterator <Producto> prod1 = productos.iterator();
        if (prod1.hasNext()) {
            Producto p = prod1.next();
            System.out.println("Producto más caro: " + p.getNombre());
        }
    }

    public void mostrarProductoMasBarato() {
        Iterator prod1 = productos.iterator();
        if (prod1.hasNext()) {
            Producto p = (Producto)prod1.next();
            System.out.println("Producto más barato: " + p.getNombre());
        }
    }
}
