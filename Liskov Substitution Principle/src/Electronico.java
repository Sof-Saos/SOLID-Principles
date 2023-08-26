public class Electronico extends Producto{
    private String marca;

    private int precioFinal;
    public Electronico(String nombre, double precio, int cantidadDisponible, String marca) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
    }

    public double calcularPrecio(int porcentaje) {
        double descuento = super.calcularDescuento(porcentaje);
        precioFinal = (int)(precio - descuento);
        return precioFinal;
    }
}
