package examen2324;

import java.util.Scanner;

public class MainEmpleado {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		Empleado empl;

		int opc = 0;

		String dni;

		int horasExtras;

		double importe;

		Empleado emp1 = new Empleado("12345678A", "Euseboi", 1150, 7);
		Empleado emp2 = new Empleado("23456789B", "Lorenzo", 750, 5);
		Empleado emp3 = new Empleado("34567891C", "Jose Miguel", 1500, 50);

		ListadoEmpleado.anyadirEmpleado(emp1);
		ListadoEmpleado.anyadirEmpleado(emp2);
		ListadoEmpleado.anyadirEmpleado(emp3);

		System.out.println("Wenas tardes guapetooooonnnn/aaaaa");

		do {

			menu();
			System.out.println("Eliga una opcion");
			opc = reader.nextInt();
			reader.nextLine();

			switch (opc) {

			case 1 -> {

				empl = creaEmpleado();

				System.out.println(ListadoEmpleado.anyadirEmpleado(empl));

			}

			case 2 -> {
				ListadoEmpleado.listarEmpleados();
			}

			case 3 -> {
				dni = pedirDni();
				horasExtras = pedirHoras();

				empl = ListadoEmpleado.comprobarEmpleado(dni);

				if (empl != null) {
					empl.setHorasExtras(horasExtras);
				} else {
					System.out.println("El empleado no existe");
				}

			}

			case 4 -> {

				System.out.println("Digame el importe horas extra");
				importe = reader.nextDouble();

				if (ListadoEmpleado.modificarImporte(importe)) {
					System.out.println("Se ha podido modificar el importe");
				} else {
					System.out.println("No se ha podido modificar el importe");
				}

			}

			case 5 -> {

				dni = pedirDni();

				empl = ListadoEmpleado.comprobarEmpleado(dni);

				if (empl != null) {
					ListadoEmpleado.eliminarEmpleado(empl);
				} else {
					System.out.println("No se encontro el empleado");
				}
			}

			case 0 -> {
				System.out.println("Adiohhhh");
			}
			}

		} while (opc != 0);

	}

	public static void menu() {
		System.out.println("1. Anyadir empleado");
		System.out.println("2. Listar empleados");
		System.out.println("3. Modificar horas extras");
		System.out.println("4. Modificar importe horas extra");
		System.out.println("5. Eliminar empleado");
		System.out.println("0. Salir");
	}

	private static String pedirDni() {

		String dni;

		System.out.println("Digame el DNI");
		dni = reader.nextLine();

		return dni;

	}

	private static int pedirHoras() {

		int horas;

		System.out.println("Digame las horas extras");
		horas = reader.nextInt();
		reader.nextLine();

		return horas;

	}

	public static Empleado creaEmpleado() {

		Empleado em;

		String dni;

		String nombre;

		double sueldoBase;

		int horasExtras;

		dni = pedirDni();

		System.out.println("Digame el nombre");
		nombre = reader.nextLine();

		System.out.println("Digane el sueldo");
		sueldoBase = reader.nextDouble();

		horasExtras = pedirHoras();

		em = new Empleado(dni, nombre, sueldoBase, horasExtras);

		return em;
	}

}
