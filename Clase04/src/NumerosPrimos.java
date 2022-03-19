
public class NumerosPrimos {

	public static void main(String[] args) {
		// del 1 al 100 cuantos numeros primos hay
		// numero primo

		for (int i = 2; i <= 100; i++) {
			boolean esPrimo = true;
			for (int j = 2; j < Math.sqrt(i); j++) { // 6 4 raiz cuadrada del numero 16 = 4
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}
			/*
			 * if (!esPrimo) { continue; }
			 */

			System.out.println(" El numero " + i + (esPrimo ? " es primo" : " no es primo"));

		}
	}
}
