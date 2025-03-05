package practicaCRUD.bol4.ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class HoraCRUD {

	private static Set<Hora> horas = new HashSet<Hora>();

	/**
	 * Metodo que lista las horas que estan dentro de la lista horas
	 */
	public static void listarHoras() {
		for (Hora h : horas) {
			System.out.println(h);
			System.out.println("---------------------");
		}
	}

	/**
	 * Metodo que anyade una hora a la lista
	 * 
	 * @param h Hora que se va a introducir en la lista
	 * @return Devuelve true si se ha anyadido y false si no se ha anyade
	 */
	public static boolean anyadeHora(Hora h) {
		return horas.add(h);
	}

	/**
	 * Metodo que elimina una hora a la lista
	 * 
	 * @param h Hora que se va a eliminar de la lista
	 * @return Devuelve true si se ha eliminado y false si no se ha eliminado
	 */
	public static boolean eliminarHora(Hora h) {
		return horas.remove(h);
	}

	/**
	 * Metodo que comprueba si una hora esta en la lista
	 * 
	 * @param h Hora que se va a comprobar
	 * @return Devuelve un objeto hora nulo si no esta y si esta devuelve ese objeto
	 */
	private static Hora buscaHora(Hora h) {

		Hora hor = null;

		for (Hora hBusqueda : horas) {
			if (h.equals(hBusqueda)) {
				hor = hBusqueda;
			}
		}

		return hor;

	}

	/**
	 * Metodo que va a anyadir 1 segundo a la hora
	 * 
	 * @param h1 Hora a la que se le va a anyadir 1 segundo
	 * @return Devuelve true si se ha anyadido y false si no ha podido
	 */
	public static boolean incremenarSeg(Hora h1) {

		boolean sePudo = false;

		Hora hMod = buscaHora(h1);

		if (hMod != null) {
			hMod.incrementarSegundo();
			sePudo = true;
		}

		return sePudo;

	}

}
