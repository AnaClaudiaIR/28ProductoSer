import java.io.*;
import java.util.List;

public class GuardarProducto {
    //Método para guardar producto
    public static void guardar (List<Producto> productos){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("productos.ser"))){
            out.writeObject(productos);
            System.out.println("Producto guardados.");
        } catch (IOException e){
            System.out.println("Error al guardar los productos --> " + e.getMessage());
        }
    }
}
