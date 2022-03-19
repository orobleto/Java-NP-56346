
public class PrecioFuturo {
	public static void main(String[] args) {
		// tengo un producto que su valor es 100$
		// si mensualmente el producto se incrementa en un 2%
		// en cuantos meses pasara la barrera de los 200$

		// variables a utilizar
		double precio = 100;
		double aumento = 2;

		int cantidadMeses = 0;
		// bucle

		while (precio < 200) {
			cantidadMeses++;
			// precio = precio + (precio * ((aumento / 100))); // 0.02 + 1
			precio *= ((aumento / 100) + 1); // 0.02 + 1

		}

		System.out.println("El precio del producto actualmente es " + String.format("%.2f", precio)
				+ " y se necesitaron " + cantidadMeses + (cantidadMeses > 1 ? " meses" : " mes"));
	}
}
