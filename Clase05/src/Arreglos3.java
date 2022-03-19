import java.util.Iterator;
import java.util.Scanner;

public class Arreglos3 {
	public static void main(String[] args) {
		double[] notas;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de notas: ");
		notas = new double[teclado.nextInt()];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Ingresa la nota " + (i + 1) + ": ");
			notas[i] = teclado.nextDouble();
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
}
