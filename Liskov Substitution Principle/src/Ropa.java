public class Ropa extends Producto {
    private String talla;

    public Ropa(String nombre, double precio, int cantidadDisponible, String talla) {
        super(nombre, precio, cantidadDisponible);
        this.talla = talla;
    }

    public void mostrarTalla() {
        System.out.println("La talla de la prenda " + nombre + " es: " + talla);
    }
}
