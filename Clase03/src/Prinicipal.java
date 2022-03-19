
public class Prinicipal {
	public static void main(String[] args) {
		System.out.println("Inicio del Programa");
		// condional mas simple IF

		// operadores relaciones y logicos
		int edad = 15;

		// joven < 18 else
		// 18 y 40 Adulto contemporaneo
		// 41 y 60 Adulto
		// 61 en adelante adulto mayor

		if (edad > 60) {
			System.out.println("Es Adulto Mayor");
		} else if (edad > 40) {
			System.out.println("Es Adulto");
		} else if (edad > 18) {
			System.out.println("Contemporaneo");
		} else {
			System.out.println("Es Menor de Edad");
		}

		System.out.println("Fin del Programa");
	}
}
