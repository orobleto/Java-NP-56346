import java.util.Scanner;

public class PromocionacDonalds {

	// los jueves y colorada o peliroja es mayor de edad
	// tiene promocion
	public static void main(String[] args) {
		System.out.println("Promo Descuento");
		// declarando variables
		Scanner teclado = new Scanner(System.in);
		byte diaSemana;
		boolean esRojo;
		short edad;

		System.out.print("Indique el dia de la semana : [1:Lunes,2:Martes,...,7:domingo]:");
		diaSemana = teclado.nextByte();

		System.out.print("Eres Colorado o Cabello Rojo?:");
		esRojo = teclado.nextBoolean();

		System.out.print("Indica la edad que tienes:");
		edad = teclado.nextShort();

		// metodos
		if (edad > 17 && esRojo && diaSemana == 4) {
			System.out.println("Puede acceder a la promocion...");
		} else {
			System.out.println("Lo sentimos sera en otra oportunidad");
		}

		System.out.println(edad + " - " + esRojo + " - " + diaSemana);

		teclado.close();

	}
}
