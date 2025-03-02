package boletin4.ejercicio4;

import java.util.Scanner;

public class DiscoPrincipal {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int opc = 0;

		Disco disco;

		int codigo;

		Disco dis1 = new Disco(1, "Don Pepe y los Globos", 3, "JAZZ");
		Disco dis2 = new Disco(2, "Euseboi", 67, "Blues");
		Disco dis3 = new Disco(3, "Dario", 95, "Rock");

		DiscoCRUD.añadeDisco(dis1);
		DiscoCRUD.añadeDisco(dis2);
		DiscoCRUD.añadeDisco(dis3);

		do {

			menu();
			System.out.println("Eliga una opcion");
			opc = reader.nextInt();

			System.out.println();

			reader.nextLine();

			switch (opc) {
			case 1 -> {
				DiscoCRUD.listarDiscos();
			}
			case 2 -> {
				disco = creaDisco();
				DiscoCRUD.añadeDisco(disco);

			}
			case 4 -> {

				codigo = pedirCodigo();
				disco = DiscoCRUD.buscaDisco(codigo);

				if (disco != null) {
					DiscoCRUD.borraDisco(disco);
				} else {
					System.out.println("El disco no existe");
				}

			}
			default -> {
				System.out.println("Saliendo del programa");
			}

			}

		} while (opc != 5);

		reader.close();

	}

	static void menu() {
		System.out.println("1. Listado");
		System.out.println("2. Nuevo disco");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}

	static int pedirCodigo() {

		int codigo;

		System.out.println("Digame el codigo");
		codigo = reader.nextInt();

		return codigo;

	}

	static Disco creaDisco() {

		Disco di;

		int codigo;

		String autor;

		int duracion;

		String genero;

		codigo = pedirCodigo();

		System.out.println("Digame el autor");
		autor = reader.nextLine();

		reader.nextLine();

		System.out.println("Digame la duraciom");
		duracion = reader.nextInt();

		reader.nextLine();

		System.out.println("Digame el genero");
		genero = reader.nextLine();

		reader.nextLine();

		di = new Disco(codigo, autor, duracion, genero);

		return di;

	}

}
