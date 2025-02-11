package boletin2.ejercicio1;

public class PrincipalCuentaCorriente {
	public static void main(String[] args) {

		CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", 600);
		CuentaCorriente cuenta2 = new CuentaCorriente("23456789B", "Paco", 1073);
		CuentaCorriente cuenta3 = new CuentaCorriente("34567891C", "Euseboi", 6234, "EXTRANJERA");

		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);

		System.out.println();

		if (cuenta2.sacarDinero(23)) {
			System.out.println("Si se pudo sacar dinero");
		} else {
			System.out.println("No se pudo sacar dinero");
		}

		System.out.println();

		if (cuenta2.ingresarDinero(0)) {
			System.out.println("Si se pudo ingresar dinero");
		} else {
			System.out.println("No se pudo ingresar dinero");
		}

		System.out.println();

		if (cuenta1.equals(cuenta3)) {
			System.out.println("Tienen el mismo titular");
		} else {
			System.out.println("No tienen el mismo titular");
		}

		System.out.println();
		System.out.println(cuenta1.getNacion());

	}
}
