import java.util.Scanner;

public class AdivinaElNumero {

	public static void main(String[] args) {

		// el sistema me genere un numero aleatorio entre 1 y 10 y que el usuario lo
		// adivine
		// variables
		int numeroAleatorio;
		int numeroUsuario;
		boolean adivino = false;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Bienveido a Adivina un numero...");
		System.out.println("Indica el nivel de dificultad [1:(del 1 al 10) , 2 :(del 1 al 100)]");

		if (teclado.nextInt() == 1) {
			numeroAleatorio = (int) ((Math.random() * 10) + 1); // 0 - 1 0.0000000000000000001
		} else {
			numeroAleatorio = (int) ((Math.random() * 100) + 1); // 0 - 1 0.0000000000000000001
		}

		System.out.println(numeroAleatorio);

		do {// true
			System.out.print("Introduce un numero: ");
			numeroUsuario = teclado.nextInt();

			if (numeroUsuario > numeroAleatorio) {
				System.out.println("Intenta un numero menor...");
			} else if (numeroUsuario < numeroAleatorio) {
				System.out.println("Intenta un numero mayor...");
			} else {
				adivino = true;
				System.out.println("Felicitaciones adivinaste el numero... ");
			}

		} while (!adivino);

		teclado.close();
		System.out.println("Fin del Juego");

	}

}
