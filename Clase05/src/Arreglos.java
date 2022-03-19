
public class Arreglos {
	public static void main(String[] args) {

		// tipo de datos

		// siempre llevan un tamaño fijo, longitu, cantidad de elementos.
		String apellido;
		String[] nombres;
		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre"};

		nombres = new String[2];// un entero
		apellido = "Robleto";
		nombres[0] = "Octavio";
		nombres[1] = "Romina";

		System.out.println(apellido);
		System.out.println(nombres[0]);

		// System.out.println(nombres[2]);

		for (int i = 0; i < 10; i++) {
			System.out.println(meses[i]);
		}

		for (int i = 0; i < 2; i++) {
			System.out.println(nombres[i]);
		}

		System.out.println(nombres.length); // equals();

		for (int i = 0; i < meses.length; i++) {
			System.out.println(meses[i]);

		}

	}
}
