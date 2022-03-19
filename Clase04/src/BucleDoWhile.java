
public class BucleDoWhile {
	public static void main(String[] args) {
		System.out.println("Incio");
		int cantidadSaludos = 5;
		int contador = 10;

		do {
			System.out.println("Saludo " + contador);
			contador++;

		} while (contador <= cantidadSaludos);

		System.out.println("Fin");
	}

}
