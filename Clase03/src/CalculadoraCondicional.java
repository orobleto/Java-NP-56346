import java.util.Scanner;

public class CalculadoraCondicional {

	// calculadora simple
	public static void main(String[] args) {
		System.out.println("Bienvenidos a la Caculadora:");

		Scanner teclado = new Scanner(System.in);
		double numeroA, numeroB, total = 0;
		char operacion;

		System.out.print("Indica el primero numero: ");
		numeroA = teclado.nextDouble();

		System.out.print("Indica el segundo numero: ");
		numeroB = teclado.nextDouble();

		System.out.print("Indica la operacion matematica [+,-,/,*]: ");
		operacion = teclado.next().charAt(0); // Hola --- 0 1 2 3 4 5 6

		if (operacion == '+' || operacion == 's') {
			total = numeroA + numeroB;
		} else if (operacion == '-' || operacion == 'r') {
			total = numeroA - numeroB;
		} else if (operacion == '*' || operacion == 'm') {
			total = numeroA * numeroB;
		} else if (operacion == '/' || operacion == 'd') {
			if (numeroB != 0) {
				total = numeroA / numeroB;
			} else {
				System.out.println("No se puede dividir por cero");
			}
		} else {
			System.out.println(operacion + " No es una operacion valida");
		}

		System.out.println("El resultado es: " + total);
		teclado.close();
	}
}
