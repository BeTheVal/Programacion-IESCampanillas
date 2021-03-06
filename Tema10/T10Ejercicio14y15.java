import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class T10Ejercicio14y15 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Double> productos = new HashMap<>();
    productos.put("avena", 2.21);
    productos.put("garbanzos", 2.39);
    productos.put("tomate", 1.59);
    productos.put("jengibre", 3.13);
    productos.put("quinoa", 4.50);
    productos.put("guisantes", 1.60);
    productos.put("unidad", 1.00);
    String producto = " ";
    int cantidad = 0;
    ArrayList<Integer> cantidades = new ArrayList<>();
    ArrayList<String> producElegido = new ArrayList<>();

    while (!producto.equals("fin")) {
      System.out.println("Producto: ");
      producto = sc.next();
      if (!producto.equals("fin")) {
        System.out.println("Cantidad: ");
        cantidad = sc.nextInt();
        if (producElegido.contains(producto)) {
          int indice = producElegido.indexOf(producto);
          cantidades.set(indice, cantidades.get(indice) + cantidad);
        } else {
          producElegido.add(producto);
          cantidades.add(cantidad);
        }
      }
    }
    double total = 0;
    boolean condescuento = false;
    System.out.println("Teclee el código de descuento");
    String tienedescuento = sc.next();
    if (tienedescuento.equals("ECODTO")) {
      condescuento = true;
    }

    System.out.println("Producto Precio Cantidad Subtotal");
    System.out.println("---------------------------------");
    for (int i = 0; i < producElegido.size(); i++) {
      String produc = producElegido.get(i);
      double precio = productos.get(produc);
      int cant = cantidades.get(i);
      double subtotal = productos.get(produc) * cantidades.get(i);
      System.out.printf("%-8s %7.2f %6d  %7.2f\n", produc, precio, cant, subtotal);
      total += subtotal;

    }
    System.out.println("---------------------------------");
    if (condescuento) {
      double descuento = 10 * 100 / total;
      String descString = String.format("%.2f", descuento);
      total = total - descuento;
      System.out.println("Descuento = " + descString);
    }
    String totalString = String.format("%.2f", total);
    System.out.println("Total: " + totalString);

  }
}
