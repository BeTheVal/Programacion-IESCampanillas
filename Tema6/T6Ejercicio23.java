public class T6Ejercicio23 {
	public static void main(String[] args) {
		/*
		 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y
		 * 8. Escribe un programa que genere de forma aleatoria la tirada de cinco
		 * dados.
		 */
		for (int i = 0; i < 5; i++) {
			int dadoResultado = (int) ((Math.random() * 6) + 1);
			switch (dadoResultado) {
			case 1:
				System.out.println("As");
				break;
			case 2:
				System.out.println("K");
				break;
			case 3:
				System.out.println("Q");
				break;
			case 4:
				System.out.println("J");
				break;
			case 5:
				System.out.println("7");
				break;
			case 6:
				System.out.println("8");
				break;
			default:
			}

		}
	}
}