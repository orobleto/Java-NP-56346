import javax.swing.JOptionPane;

public class GenerarRGB {

	// COLOR RGB(0 - 255, 0- 255, 0 - 255 )
	public static void main(String[] args) {
		int red, green, blue;
		red = generarNumero(255);
		green = generarNumero(255);
		blue = generarNumero(255);

		// color RGB

		String colorRGB = "RGB( " + red + " , " + green + " , " + blue + " )";

		// color hex

		String colorHEX = "#" + generarHexadecimal(red) + generarHexadecimal(green) + generarHexadecimal(blue);

		JOptionPane.showMessageDialog(null, "Color Generado" + "\n\t" + colorRGB + "\n\t" + colorHEX);

	}

	public static int generarNumero(int maximo) {
		return (int) Math.round(Math.random() * maximo);
	}

	public static String generarHexadecimal(int numero) {
		String hexadecimal = Integer.toHexString(numero);
		return (hexadecimal.length() > 1 ? hexadecimal : "0" + hexadecimal);
	}

}
