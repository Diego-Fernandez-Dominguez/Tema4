package practicaCRUD.bol4.ejercicio3;

import java.util.Scanner;

public class FechaMain {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		/* Me he aburrido de hacer estos CRUD muy basto */

		int opc = 0;

		Fecha fe1 = new Fecha(1, 6, 2025);
		Fecha fe2 = new Fecha(29, 2, 2023);
		Fecha fe3 = new Fecha(29, 2, 2024);
		Fecha fe4 = new Fecha(32, 13, 2024);
		Fecha fe5 = new Fecha(31, 11, 2024);
		Fecha fe6 = new Fecha(31, 12, 2024);

		FechaCRUD.anyadirFecha(fe6);
		FechaCRUD.anyadirFecha(fe1);
		FechaCRUD.anyadirFecha(fe2);
		FechaCRUD.anyadirFecha(fe4);
		FechaCRUD.anyadirFecha(fe5);
		FechaCRUD.anyadirFecha(fe3);

		do {

			menu();
			System.out.println("Elige una opcion");
			opc = reader.nextInt();
			reader.nextLine();

		} while (opc != 5);

	}

	static void menu() {
		System.out.println("1. Listar");
		System.out.println("2. Anyadir");
		System.out.println("3. Es bisiesto");
		System.out.println("4. Dia siguiente");
		System.out.println("5. Modificar");
		System.out.println("6. Borrar");
		System.out.println("7. Adioh");
	}

}
