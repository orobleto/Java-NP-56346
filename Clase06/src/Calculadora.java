import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		// pedir y declarar variable
		double numero1, numero2, total;
		char operador;
		numero1 = convertirCadenaADoble("Ingresa el numero 1: ");
		numero2 = convertirCadenaADoble("Ingresa el numero 2: ");
		operador = convetirCadenaAChar("Ingresa el operador", 0);
		total = calculo(operador, numero1, numero2);
		JOptionPane.showMessageDialog(null, "El resultado de " + getFormatoDouble(numero1) + " " + operador + " "
				+ getFormatoDouble(numero2) + " = " + getFormatoDouble(total));
	}

	public static double calculo(char operador, double num1, double num2) {
		double resultado;
		switch (operador) {
		case '+':
			resultado = suma(num1, num2);
			break;
		case '-':
			resultado = resta(num1, num2);
			break;
		case '*':
			resultado = multiplica(num1, num2);
			break;
		case '/':
			resultado = divido(num1, num2);
			break;

		default:
			resultado = 0;
		}

		return resultado;
	}

	public static double suma(double num1, double num2) {
		double resultado = num1 + num2;
		return resultado;
	}

	public static double resta(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplica(double num1, double num2) {
		return num1 * num2;
	}

	public static double divido(double num1, double num2) {
		if (num2 == 0) {
			return 0;
		}
		return num1 / num2;
	}

	public static double convertirCadenaADoble(String mensaje) {
		return Double.valueOf(JOptionPane.showInputDialog(mensaje));
	}

	// metodo para devolver un caracter de una posicion del string Hola 2
	public static char convetirCadenaAChar(String mensaje, int indice) {
		return Character.valueOf(JOptionPane.showInputDialog(mensaje).charAt(indice));
	}

	public static String getFormatoDouble(double numero) {
		return String.format("%.2f", numero);
	}

}
