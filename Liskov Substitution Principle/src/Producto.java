import java.util.ArrayList;

public  class Producto {
    protected String nombre;
    protected double precio;
    private int cantidadDisponible;
    private static ArrayList<Producto> carrito;
    public static ArrayList<Producto> stock = new ArrayList<>();

    public Producto(){}
    public Producto(String nombre, double precio,  int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.carrito = new ArrayList<>();
        this.cantidadDisponible = cantidadDisponible;
    }

    public static void agregarAlStock(Producto producto) {
        stock.add(producto);
    }

    public static void quitarProductoStock(Producto producto){
        stock.remove(producto);
    }
    public static void mostrarStock() {
        for (Producto producto : stock) {
            System.out.println("\033[34m" + producto.getClass().getSimpleName() + " \u001B[0m");
            System.out.println(producto.nombre + "\nCantidad disponible: " + producto.cantidadDisponible + "\nPrecio: " + producto.precio);

            if (producto instanceof Libro) {
                ((Libro) producto).obtenerAutor();
                System.out.println();
            }
             else if (producto instanceof Ropa) {
                ((Ropa) producto).mostrarTalla();
                System.out.println();
            }
             else if (producto instanceof Electronico) {
                System.out.print("Este producto cuenta con un super descuento del 10%, lo podrá obtener por solo:  " );
                double precioDescuento = ((Electronico) producto).calcularPrecio(10);
                System.out.println(precioDescuento);
                System.out.println();
             }
       }
    }

    public static void agregarAlCarrito(Producto producto) {
        carrito.add(producto);
        stock.remove(producto);
    }

    public static void quitarProductoCarrito(Producto producto){
        carrito.remove(producto);
        stock.add(producto);
    }
    public static void verCarrito(){
        System.out.println("\033[33m Productos en el carrito " + "\uD83D\uDED2" + " \u001B[0m");
        for (Producto producto: carrito) {
            System.out.println(" - " + producto.nombre + " Precio: " + producto.precio);
        }
        System.out.println();
    }
    public double calcularDescuento(int porcentaje) {
        return (porcentaje * precio)/100;
    }

}
