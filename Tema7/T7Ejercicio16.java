import java.util.Scanner;

public class T7Ejercicio16 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que rellene un array de 20 elementos con números enteros
		 * aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
		 * programa mostrará el array y preguntará si el usuario quiere resaltar los
		 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
		 * array escribiendo los números que se quieren resaltar entre corchetes.
		 */
		Scanner sc = new Scanner(System.in);
		int[] numero = new int[20];
		int contador = 0;
		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * 400);
			System.out.print(numero[i] + ", ");
			if (contador == 19) {
				System.out.println(numero[i] + ".");
				System.out.println();
			}
			contador++;
		}
		System.out.println("1. Resaltar múltiplos de 5");
		System.out.println("2. Resaltar múltiplos de 7");
		int resaltar = sc.nextInt();
		if (resaltar == 1) {
			for (int i = 0; i < numero.length; i++) {
				if (numero[i] % 5 == 0) {
					System.out.print("[" + numero[i] + "]");
				}
			}
		}
		if (resaltar == 2) {
			for (int i = 0; i < numero.length; i++) {
				if (numero[i] % 7 == 0) {
					System.out.println("[" + numero[i] + "]");

				}
			}
		}

	}
}