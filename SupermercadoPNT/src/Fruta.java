public class Fruta extends Producto {

    private String unidadDeVenta;

    public Fruta(String nombre, int precio, String unidadDeVenta) {
        super (nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString(){
        String divisor = " /// ";

        return "Nombre: " + getNombre() + divisor
                + "Precio: $" + getPrecio() + divisor
                + "Unidad de venta: " + getUnidadDeVenta();
    }
}
