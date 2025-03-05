package practicaCRUD.bol4.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class ContadorCRUD {

	private static Set<Contador> contadores = new HashSet<Contador>();

	public static void listarContadores() {
		for (Contador c : contadores) {
			System.out.println(c);
			System.out.println("--------------------------");
		}
	}

	public static boolean anyadirCont(Contador c) {

		return contadores.add(c);

	}

	public static boolean eliminarCont(Contador c) {
		return contadores.remove(c);
	}

	private static Contador buscarContador(Contador c) {

		Contador contTemp = null;

		for (Contador cBusca : contadores) {
			if (c.equals(cBusca)) {
				contTemp = cBusca;
			}
		}

		return contTemp;

	}

	public static boolean incrementar(Contador c) {

		boolean sePudo = false;

		Contador con = buscarContador(c);

		if (con != null) {
			con.incrementar();
			sePudo = true;
		}

		return sePudo;

	}

	public static boolean decrementar(Contador c) {

		boolean sePudo = false;

		Contador con = buscarContador(c);

		if (con != null) {
			con.decrementar();
			sePudo = true;
		}

		return sePudo;

	}

	public static boolean modificar(Contador c, int conta) {

		boolean sePudo = false;

		Contador contTem = buscarContador(c);

		if (contTem != null) {
			contTem.setCont(conta);
			sePudo = true;
		}

		return sePudo;

	}

}
