import java.util.Scanner;
public class T5Ejercicio11 {
    public static void main(String[] args) {
    //Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número: ");
        int numeroIntroducido = Integer.parseInt(sc.nextLine());
        sc.close();
        for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
            System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
          }

    }
}