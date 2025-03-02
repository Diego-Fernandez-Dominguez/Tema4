package boletin2.ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class CuentaCRUD {

	private static Set<CuentaCorriente> cuentas = new HashSet<CuentaCorriente>();

	public static void listarCuentas() {

		for (CuentaCorriente c : cuentas) {
			System.out.println(c);
			System.out.println("-----------------------");
		}

	}

	public static boolean añadeCuenta(CuentaCorriente cuenta) {
		return cuentas.add(cuenta);
	}

	public static CuentaCorriente buscarCuenta(String dni) {

		CuentaCorriente cu = null;

		for (CuentaCorriente cBusqueda : cuentas) {
			if (cBusqueda.getDni().equals(dni)) {
				cu = cBusqueda;
			}
		}

		return cu;
	}

	public static boolean borraCuenta(CuentaCorriente cu) {

		return cuentas.remove(cu);

	}

	public static boolean añadeSaldo(String dni, int saldo) {

		boolean sePudo = false;

		CuentaCorriente c = null;

		buscarCuenta(dni);
		if (dni != null) {

			c.ingresarDinero(saldo);
			sePudo = true;
		}

		return sePudo;

	}

	public static boolean sacarSaldo(String dni, int saldo) {

		boolean sePudo = false;

		CuentaCorriente c = null;

		buscarCuenta(dni);
		if (dni != null) {

			c.sacarDinero(saldo);
			sePudo = true;
		}

		return sePudo;

	}

}
