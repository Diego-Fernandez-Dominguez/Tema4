package practicaCRUD.bol4.ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class FechaCRUD {

	private static Set<Fecha> fechas = new HashSet<Fecha>();

	public static void listarFechas() {
		for (Fecha f : fechas) {
			System.out.println(f);
			System.out.println("---------------------");
		}
	}

	public static boolean anyadirFecha(Fecha f) {
		return fechas.add(f);
	}

}
