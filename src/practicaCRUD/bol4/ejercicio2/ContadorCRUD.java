package practicaCRUD.bol4.ejercicio2;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase que va a manejar el conjunto de contadores
 */
public class ContadorCRUD {

	/**
	 * Lista en la que se van a guardar los contadores
	 */
	private static Set<Contador> contadores = new HashSet<Contador>();

	/**
	 * Metodo que saca por pantalla los contadores que estan en la lista
	 */
	public static void listarContadores() {
		for (Contador c : contadores) {
			System.out.println(c);
			System.out.println("--------------------------");
		}
	}

	/**
	 * Metodo para anyadir un contador a la lista
	 * 
	 * @param c Contador a anyadir a la lista
	 * @return Devuelve true si se ha podido anyadir y false si no
	 */
	public static boolean anyadirCont(Contador c) {

		return contadores.add(c);

	}

	/**
	 * Metodo para eliminar un contador de la lista
	 * 
	 * @param c Contador a eliminar de la lista
	 * @return Devuelve true si se ha podido eliminar y false si no
	 */
	public static boolean eliminarCont(Contador c) {
		return contadores.remove(c);
	}

	/**
	 * Metodo para buscar un contador en la lista
	 * 
	 * @param c Contador a buscar
	 * @return Devuelve un contador nulo si el contador a buscar no se encuentra y
	 *         si se encuentra se devuelve el objeto encontrado
	 */
	private static Contador buscarContador(Contador c) {

		Contador contTemp = null;

		for (Contador cBusca : contadores) {
			if (c.equals(cBusca)) {
				contTemp = cBusca;
			}
		}

		return contTemp;

	}

	/**
	 * Metodo para incrementar en 1 el contador introducido por el usuario
	 * 
	 * @param c Contador introducido por el usuario
	 * @return Devuelve true si se ha incrementado y false si no se ha podido
	 */
	public static boolean incrementar(Contador c) {

		boolean sePudo = false;

		Contador con = buscarContador(c);

		if (con != null) {
			con.incrementar();
			sePudo = true;
		}

		return sePudo;

	}

	/**
	 * Metodo para decrementar en 1 el contador introducido por el usuario
	 * 
	 * @param c Contador introducido por el usuario
	 * @return Devuelve true si se ha decrementado y false si no se ha podido
	 */
	public static boolean decrementar(Contador c) {

		boolean sePudo = false;

		Contador con = buscarContador(c);

		if (con != null) {
			con.decrementar();
			sePudo = true;
		}

		return sePudo;

	}

	/**
	 * Metodo para modificar un contador
	 * 
	 * @param c     Contador a modificar
	 * @param conta Numero por el que se quiere cambiar el contador
	 * @return Devuelve true si se ha modificado y false si no se ha conseguido
	 */
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
