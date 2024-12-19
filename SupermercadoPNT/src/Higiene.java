public class Higiene extends Producto{

    private int contenidoEnMl;

    public Higiene(String nombre, int contenidoEnMl, int precio) {
        super(nombre, precio);
        this.contenidoEnMl = contenidoEnMl;
    }

    public int getContenidoEnMl() {
        return contenidoEnMl;
    }

    public void setContenidoEnMl(int contenidoEnMl) {
        this.contenidoEnMl = contenidoEnMl;
    }

    @Override
    public String toString(){
        String divisor = " /// ";

        return "Nombre: " + getNombre() + divisor
                + "Contenido: " + getContenidoEnMl() + "ml" + divisor
                + "Precio: $" + getPrecio();
    }
}
