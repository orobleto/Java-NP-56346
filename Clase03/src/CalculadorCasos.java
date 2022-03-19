import java.util.Scanner;

public class CalculadorCasos {
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

		switch (operacion) {
		case 's':
		case '+':
			total = numeroA + numeroB;
			break;
		case 'r':
		case '-':
			total = numeroA - numeroB;
			break;
		case 'm':
		case '*':
			total = numeroA * numeroB;
			break;
		case 'd':
		case '/':
			if (numeroB == 0) {
				System.out.println("No se puede dividir por cero...");
			} else {
				total = numeroA / numeroB;
			}
			break;
		default:
			System.out.println("Caracter incorrecto");
		}

		System.out.println("El resultado es: " + total);
		teclado.close();

	}
}
