
public class OperadorTernario {

	public static void main(String[] args) {

		byte edad = 19;
		String mensaje = "";

		if (edad >= 18)
			mensaje = "Eres mayor de edad";
		else
			mensaje = "Eres menor de edad";

		// asigna un valor <---- condicion(es) ? seaVerdad : seaFalso;

		System.out.println(mensaje);

		mensaje = edad > 17 ? "Es Mayor" : "Es Menor";

		System.out.println(mensaje);

		System.out.println(edad >= 18 ? "Aca tambien es mayor" : "Aca tambien es menor");

		boolean esMayor = edad >= 18;

		System.out.println(esMayor ? "Es mayor tambien" : "Es menor tambien");

	}

}
