package practicaCRUD.propios.ej2;

import java.util.ArrayList;

public class ColorCRUD {

	private static ArrayList<Color> colores = new ArrayList<Color>();

	public static void listarColor() {
		for (Color c : colores)
			System.out.println(c);
		System.out.println("-------------");
	}

	public static boolean anyadirColor(Color c) {

		boolean sePudo = false;

		if (!colores.contains(c)) {
			colores.add(c);
			sePudo = true;
		}

		return sePudo;

	}

	public static boolean eliminarColor(Color c) {

		boolean sePudo = false;

		if (!colores.contains(c)) {
			colores.remove(c);
			sePudo = true;
		}

		return sePudo;

	}

}
