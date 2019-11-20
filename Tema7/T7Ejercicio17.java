import java.util.Scanner;

public class T7Ejercicio17 {
  public static void main(String[] args) {
    /*
     * Escribe un programa que muestre por pantalla un array de 10 números enteros
     * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
     * número al usuario. Se debe comprobar que el número introducido por teclado se
     * encuentra dentro del array, en caso contrario se mostrará un mensaje por
     * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca
     * uno correctamente. A continuación, el programa rotará el array hacia la
     * derecha las veces que haga falta hasta que el número introducido quede
     * situado en la posición 0 del array. Por último, se mostrará el array rotado
     * por pantalla.
     */
    Scanner sc = new Scanner(System.in);
    int[] num = new int[10];
    boolean existeNumero = false;
    for (int i = 0; i < num.length; i++) {
      num[i] = (int) (Math.random() * 100);
    }
    // pinta la array
    int contador = 0;
    for (int i = 0; i < num.length; i++) {
      System.out.print(" " + num[i] + " ");
      if (contador == num.length) {
        System.out.println();

      }
    }
    int numeroIntroducido;

    do {
      System.out.println("Introduzca el número a mover:");
      numeroIntroducido = sc.nextInt();
      // Comprobación de número
      for (int i = 0; i < num.length; i++) {
        if (num[i] == numeroIntroducido) {
          existeNumero = true;
        }
      }
    } while (!existeNumero);

    int auxiliar = numeroIntroducido;
    for (int i = 0; i < num.length; i++) {

    }
  }
}
/*
 * Desplazamiento con valor auxiliar
 * 
 * 1º Declarar una variable para guardar valores 2º guardar el ultimo numero en
 * esa variable 3º Desplazar todos los numeros 4º meter la variable en el primer
 * lugar
 */