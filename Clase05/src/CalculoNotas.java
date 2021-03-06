import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class CalculoNotas {
	public static void main(String[] args) {
		// declarar variables
		float[] notas;
		String[] alumnos;
		int cantidadNotas;
		float promedio;
		float notaMayor;
		float notaMenor;
		String alumnoNotaMayor;
		String alumnoNotaMenor;

		cantidadNotas = Integer.parseInt(JOptionPane.showInputDialog("Indica la cantidad de notas: "));
		notas = new float[cantidadNotas];
		alumnos = new String[cantidadNotas];
		/*
		 * for (int i = 0; i < notas.length; i++) { alumnos[i] =
		 * JOptionPane.showInputDialog("indica el nombre del alumno:"); notas[i] =
		 * Float.parseFloat(JOptionPane.showInputDialog("Ingresa la nota de " +
		 * alumnos[i] + ":")); }
		 */
		// pedir las notas
		pedirNotas(notas, alumnos);

		promedio = 0;
		notaMayor = notas[0];
		alumnoNotaMayor = alumnos[0];
		notaMenor = notas[0];
		alumnoNotaMenor = alumnos[0];
		// 8 , 5 , 10
		for (int i = 0; i < notas.length; i++) {
			promedio += notas[i];
			// comprobar que la nota que tengo es la mayor de lo contrario asignar nueva
			// nota mayor
			if (i == 0) {
				continue;
			}
			// comparo notas
			if (notas[i] > notaMayor) {
				notaMayor = notas[i];
				alumnoNotaMayor = alumnos[i];
			}
			if (notas[i] < notaMenor) {
				notaMenor = notas[i];
				alumnoNotaMenor = alumnos[i];
			}
		}
		String mensaje = "La mayor nota es " + notaMayor + " y pertenece a " + alumnoNotaMayor + "\n"
				+ "La nota menor es " + notaMenor + " y pertenece a " + alumnoNotaMenor;
		JOptionPane.showMessageDialog(null, mensaje);

		promedio = promedio / notas.length;
		JOptionPane.showMessageDialog(null,
				"Las notas son: " + Arrays.toString(notas) + String.format(", el promedio es %.2f", promedio));

		JOptionPane.showMessageDialog(null, generarHTML(notas, alumnos));
		// clacular el promedio de notas

	}

	public static void pedirNotas(float[] notas, String[] alumnos) {
		for (int i = 0; i < notas.length; i++) {
			alumnos[i] = JOptionPane.showInputDialog("indica el nombre del alumno:");
			notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la nota de " + alumnos[i] + ":"));
		}
	}

	public static String generarHTML(float[] notas, String[] alumnos) {
		String html = "<html><table> <tr><th>Nombre</th><th>Nota</th></tr> ";
		for (int i = 0; i < alumnos.length; i++) {
			html += "<tr>";
			html += "<td>" + alumnos[i] + "</td>";
			html += "<td>" + String.format("%.2f", notas[i]) + "</td>";
			html += "</tr>";
		}
		html += "</table></html>";
		return html;
	}

}
