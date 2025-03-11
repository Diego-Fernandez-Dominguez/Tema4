package examen2324;

import java.util.HashSet;
import java.util.Set;

public class ListadoEmpleado {

	private static Set<Empleado> empleados = new HashSet<Empleado>();

	public static void listarEmpleados() {
		for (Empleado e : empleados) {
			System.out.println(e);
			System.out.println("--------------------");
		}
	}

	public static String anyadirEmpleado(Empleado e) {

		String cadena;

		if (empleados.add(e)) {
			cadena = "\nSe ha podido anyadir\n";
		} else {
			cadena = "\nNo se ha podido anyadir\n";
		}

		return cadena;
	}

	public static String eliminarEmpleado(Empleado e) {

		String cadena;

		if (empleados.remove(e)) {
			cadena = "\nSe ha podido eliminar\n";
		} else {
			cadena = "\nNo se ha podido eliminar\n";
		}

		return cadena;
	}

	public static Empleado comprobarEmpleado(String dni) {

		Empleado e = null;

		for (Empleado eBusqueda : empleados) {
			if (dni.equals(eBusqueda.getDni())) {
				e = eBusqueda;
			}
		}

		return e;

	}

	public static boolean modificarImporte(double importe) {

		boolean sePudo = false;

		if (importe > 0) {
			Empleado.setImporteHorasExtras(importe);
		}

		return sePudo;

	}

}
