
public class BucleFor {
	public static void main(String[] args) {

		System.out.println("Inicio");

		int contador = 0;
		while (contador < 5) {
			contador++;
			System.out.println("..." + contador);

		}

		// for (InicializaciondelBucle; condicion(es) ; incremente ) determinado

		for (int contadorFor = 0; contadorFor < 5; contadorFor++) {
			System.out.println("Hola " + (contadorFor + 1) + " desde el for");
		}

		System.out.println("Fin");

	}

}
