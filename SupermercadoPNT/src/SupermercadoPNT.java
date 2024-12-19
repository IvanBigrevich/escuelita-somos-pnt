import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SupermercadoPNT {
    public static void main(String[] args) {
        List<Producto> productos = buscarProductos();

        for(Producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("=============================");

        Producto productoMasCaro = Collections.max(productos);
        Producto productoMasBarato = Collections.min(productos);

        System.out.println("Producto más caro: " + productoMasCaro.nombre);
        System.out.println("Producto más barato: " + productoMasBarato.nombre);
    }

    private static List<Producto> buscarProductos() {
        List<Producto> productos = new ArrayList<>();

        Bebida cocaComun = new Bebida("Coca-Cola Zero", 1.5, 20);
        Bebida cocaZero = new Bebida("Coca-Cola", 1.5, 18);
        Higiene shampooSedal = new Higiene("Shampoo Sedal", 500, 19);
        Fruta frutillas = new Fruta("Frutillas", 64, "kilo");

        productos.add(cocaComun);
        productos.add(cocaZero);
        productos.add(shampooSedal);
        productos.add(frutillas);

        return productos;
    }
}