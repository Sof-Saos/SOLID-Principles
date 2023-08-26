import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Producto producto = new Producto();

        Electronico tv = new Electronico("Smart TV", 3000000, 4, "Samsung");
        Ropa blusas = new Ropa("Colección primavera", 35000, 7, "S");
        Libro clasicos = new Libro("Moby-Dick", "Herman Melville", 35000, 4);

        tv.agregarAlStock(tv);
        blusas.agregarAlStock(blusas);
        clasicos.agregarAlStock(clasicos);


        System.out.println("Bienvenido a la tienda CLASSY 101!");
        do {
            System.out.println("1. Ver productos en stock");
            System.out.println("2. Ver carrito");
            System.out.println("3. Agregar producto a su carrito");
            System.out.println("4. Quitar producto de su carrito");
            System.out.println("5. Salir de la tienda");
            System.out.print("Escoge una opción: " );
            op = sc.nextInt();
            System.out.println();

            switch (op) {
                case 1:
                    producto.mostrarStock();
                    break;
                case 2:
                    producto.verCarrito();
                    break;
                case 3:
                    blusas.agregarAlCarrito(blusas);
                    tv.agregarAlCarrito(tv);
                    System.out.println("Productos agregados correctamente");
                    break;
                case 4:
                    blusas.quitarProductoCarrito(blusas);
                    tv.quitarProductoCarrito(tv);
                    System.out.println("Productos sacados correctamente");
                    break;
                case 5:
                    System.out.println("Gracias por visitarnos! Vuelva pronto");
                    break;
            }
        } while (op!=5);
    }
}
