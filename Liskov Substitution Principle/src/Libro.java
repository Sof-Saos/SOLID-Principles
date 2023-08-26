public class Libro extends Producto{
    private String autor;

    public Libro(String nombre, String autor, double precio, int cantidadDisponible) {
        super(nombre, precio, cantidadDisponible);
        this.autor = autor;
    }

    public void obtenerAutor(){
        System.out.println("El autor del libro " + nombre + " es " + autor);
    }
}
