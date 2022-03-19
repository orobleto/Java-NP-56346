import java.util.Scanner;

public class Arreglos2 {
	public static void main(String[] args) {
		// declarar variables

		String[] cursos;// longitud,
		int cantidadCursos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de cursos: ");
		cantidadCursos = teclado.nextInt();
		cursos = new String[cantidadCursos];

		// pedir cada uno de los cursos
		for (int i = 0; i < cursos.length; i++) {
			System.out.print("Ingresa el curso " + i + ":");
			cursos[i] = teclado.next();
		}

		// imprimo los cursos
		System.out.println("Id\tDescripcion");
		for (int i = 0; i < cursos.length; i++) {
			System.out.println(i + "\t" + cursos[i]);

		}

	}
}
