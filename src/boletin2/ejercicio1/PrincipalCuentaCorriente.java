package boletin2.ejercicio1;

import java.util.Scanner;

public class PrincipalCuentaCorriente {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int opc = 0;

		int saldo;

		String dni;

		CuentaCorriente cuenta;

		CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", 600);
		CuentaCorriente cuenta2 = new CuentaCorriente("23456789B", "Paco", 1073);
		CuentaCorriente cuenta3 = new CuentaCorriente("34567891C", "Euseboi", 6234, "EXTRANJERA");

		CuentaCRUD.añadeCuenta(cuenta1);
		CuentaCRUD.añadeCuenta(cuenta2);
		CuentaCRUD.añadeCuenta(cuenta3);

		do {

			menu();
			System.out.println("Eliga una opcion");
			opc = reader.nextInt();

			reader.nextLine();

			switch (opc) {
			case 1 -> {
				CuentaCRUD.listarCuentas();
			}
			case 2 -> {
				cuenta = creaCuenta();
				CuentaCRUD.añadeCuenta(cuenta);
			}
			case 3 -> {

				dni = pedirDNI();

				cuenta = CuentaCRUD.buscarCuenta(dni);

				if (cuenta != null) {
					CuentaCRUD.borraCuenta(cuenta);
				} else {
					System.out.println("No se encontro la cuenta");
				}

			}

			case 4 -> {

				dni = pedirDNI();

				cuenta = CuentaCRUD.buscarCuenta(dni);

				if (cuenta != null) {

					System.out.println("Digame el saldo a añadir");
					saldo = reader.nextInt();

					CuentaCRUD.añadeSaldo(dni, saldo);
				} else {
					System.out.println("No se encontro la cuenta");
				}

			}

			case 5 -> {

				dni = pedirDNI();

				cuenta = CuentaCRUD.buscarCuenta(dni);

				if (cuenta != null) {

					System.out.println("Digame el saldo a añadir");
					saldo = reader.nextInt();

					CuentaCRUD.sacarSaldo(dni, saldo);
				} else {
					System.out.println("No se encontro la cuenta");
				}

			}
			case 6 -> {

				System.out.println("Saliendo del sistema");

			}
			}

		} while (opc != 6);

	}

	static void menu() {
		System.out.println("1. Listar cuentas");
		System.out.println("2. Nueva Cuenta");
		System.out.println("3. Borrar Cuenta");
		System.out.println("4. Añadir saldo");
		System.out.println("5. Quitar saldo");
		System.out.println("6. Adioh");
	}

	static String pedirDNI() {

		String dni;

		System.out.println("Digame el DNI");
		dni = reader.nextLine();

		return dni;

	}

	static CuentaCorriente creaCuenta() {

		String dni;

		String nombre;

		int saldo;

		String nacion;

		CuentaCorriente cu;

		dni = pedirDNI();
		System.out.println("Dime el saldo");
		saldo = reader.nextInt();
		reader.nextLine();
		System.out.println("Dime el nombre");
		nombre = reader.nextLine();
		reader.nextLine();
		System.out.println("Dime la nacionalidad");
		nacion = reader.nextLine();
		reader.nextLine();

		cu = new CuentaCorriente(dni, nombre, saldo, nacion);

		return cu;

	}

}
