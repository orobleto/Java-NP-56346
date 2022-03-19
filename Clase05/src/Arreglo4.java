import java.util.Iterator;

import javax.swing.JOptionPane;

public class Arreglo4 {
	public static void main(String[] args) {
		// declaramos variables
		float[] notas;
		int cantidadNotas;

		cantidadNotas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de notas a ingresar:"));
		notas = new float[cantidadNotas];

		for (int i = 0; i < notas.length; i++) {
			notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la nota [" + (i + 1) + "]:"));
		}

		for (int i = 0; i < notas.length; i++) {
			JOptionPane.showMessageDialog(null, notas[i]);

		}

	}
}
