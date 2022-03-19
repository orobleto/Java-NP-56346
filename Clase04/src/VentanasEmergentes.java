import javax.swing.JOptionPane;

public class VentanasEmergentes {
	public static void main(String[] args) {
		// Java FX
		// Java Swing
		JOptionPane.showMessageDialog(null, "Hola Mundo");

		String mensaje = JOptionPane.showInputDialog("Introduce un valor:");
		
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
