public class T7BEjercicio1 {
	public static void main(String[] args) {
		/*
		 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y
		 * asigna los valores según la siguiente tabla.
		 */
		int[][] num = new int[3][6];
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[2][2] = -2;
		num[2][3] = 9;
		num[1][4] = 0;
		num[2][5] = 11;
		int contador = 0;
		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 6; i++) {
				System.out.print(" " + num[contador][i] + " ");
			}
			contador++;
			if (contador == 6) {
				System.out.println();
				contador = 0;
			}
		}

	}
}