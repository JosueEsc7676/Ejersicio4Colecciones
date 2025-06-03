import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RegistroProductos {
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int id = 1;

        while (true) {
            System.out.println("Registro del Producto #" + id);

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Precio: ");
            double precio = Double.parseDouble(sc.nextLine());

            Producto nuevoProducto = new Producto(id, nombre, marca, precio);
            listaProductos.add(nuevoProducto);

            System.out.print("¿Desea registrar otro producto? (s/n): ");
            String respuesta = sc.nextLine().toLowerCase();

            if (respuesta.equals("n")) {
                break;
            }

            id++;
        }

        // Mostrar productos registrados con Iterator
        System.out.println("\nPRODUCTOS REGISTRADOS:");
        Iterator<Producto> iterador = listaProductos.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
