import javax.swing.JOptionPane;

public class Principal {

	// java standard
	public static void main(String[] args) {
		int total = suma(5, 16);
		mostrar(total + "");
		mostrar("" + suma(8, 26));
		suma(25, 8);

	}

	public static int suma(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public static void imprimirSaludo() {
		System.out.println("Hola desde metodo");
	}

	public static void mostrar(String cadena) {
		JOptionPane.showMessageDialog(null, cadena);
	}

}
