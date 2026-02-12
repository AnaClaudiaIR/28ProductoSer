import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LeerProducto {
    //Método para leer fichero
    public static void leer(){
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("productos.ser"))){
            List<Producto> productos = (ArrayList<Producto>) in.readObject();
            for (Producto producto:productos){
                System.out.println("Nombre: "+producto.getNombre());
                System.out.println("Precio: "+producto.getPrecio());
                System.out.println("Cantidad: "+producto.getCantidad());
            }
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Error al leer el producto --> "+e.getMessage());
        }
    }
}
