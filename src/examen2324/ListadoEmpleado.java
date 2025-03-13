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

	public static boolean anyadirEmpleado(Empleado e) {

		return empleados.add(e);

	}

	public static boolean eliminarEmpleado(Empleado e) {

		return empleados.remove(e);
	}

	private static Empleado comprobarEmpleado(Empleado e) {

		Empleado emp = null;

		for (Empleado empleado : empleados) {

			if (empleado.equals(e)) {

				emp = e;

			}

		}
		return emp;

	}

	public static boolean modificarImporte(double importe) {

		boolean sePudo = false;

		if (importe > 0) {
			Empleado.setImporteHorasExtras(importe);
			sePudo = true;
		}

		return sePudo;

	}

	public static boolean modificarHorasExtras(Empleado em, int horas) {

		boolean sePudo = false;

		Empleado eModificar = comprobarEmpleado(em);

		if (eModificar != null) {
			sePudo = true;
			em.setHorasExtras(horas);
		}

		return sePudo;

	}

}
