package boletin4.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class DiscoCRUD {

	// Atributo que va a ser la coleccion donde almacenar nuestros objetos
	private static Set<Disco> discos = new HashSet<Disco>();

	public static void listarDiscos() {
		for (Disco d : discos) {
			System.out.println(d);
			System.out.println("---------------------");
		}
	}

	public static boolean añadeDisco(Disco d) {

		return discos.add(d);

	}

	public static Disco buscaDisco(int codigo) {

		Disco d = null;

		for (Disco dBusqueda : discos) {
			if (dBusqueda.getCodigo() == codigo) {
				d = dBusqueda;
			}
		}

		return d;

	}

	public static boolean borraDisco(Disco d) {

		return discos.remove(d);

	}

}
