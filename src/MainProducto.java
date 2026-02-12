import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MainProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Pipas",1.15,90));
        productos.add(new Producto("Patatas Fritas", 1.50, 45));
        productos.add(new Producto("Refresco Cola", 1.80, 60));
        productos.add(new Producto("Chicles Menta", 0.95, 120));
        productos.add(new Producto("Chocolate con Leche", 2.10, 35));
        productos.add(new Producto("Agua Mineral", 0.80, 100));
        productos.add(new Producto("Barrita Energética", 1.25, 50));
        productos.add(new Producto("Galletas Rellenas", 1.90, 25));
        productos.add(new Producto("Zumo de Naranja", 1.45, 40));
        productos.add(new Producto("Frutos Secos Mix", 2.30, 30));

        do {
            System.out.println("Introduce el precio: ");
            double precio = Double.parseDouble(sc.nextLine());

            for(Producto producto : productos) {
                if(precio <= producto.getPrecio()) { //Precio mayor a un valor dado
                    System.out.println("Nombre: " + producto.getNombre());
                    System.out.println("Cantidad: " + producto.getCantidad());
                    System.out.println("Precio: " + producto.getPrecio() + "€");
                    System.out.println();
                }
            }
            System.out.println("¿Continuar? (s/n): ");
            opcion = sc.nextLine();
        } while (opcion.equalsIgnoreCase("s"));
    }
}
