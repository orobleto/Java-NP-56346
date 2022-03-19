import java.util.Arrays;

public class Arreglos6 {
	public static void main(String[] args) {
		String[] meses1 = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		String[] meses2 = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		String[] meses3;
		String[] semestre2;

		System.out.println(Arrays.equals(meses1, meses2));

		String mesesCadena = Arrays.toString(meses1);
		System.out.println(mesesCadena);

		meses3 = Arrays.copyOf(meses2, 4);

		System.out.println(Arrays.toString(meses3));

		meses2[0] = "ENERO";
		System.out.println(Arrays.toString(meses2));
		System.out.println(Arrays.toString(meses3));

		semestre2 = Arrays.copyOfRange(meses1, 6, 12);
		System.out.println(Arrays.toString(semestre2));

		Arrays.sort(semestre2);

		System.out.println(Arrays.toString(semestre2));

	}
}
