package practicaCRUD.propios.ej2;

import java.util.Scanner;

public class ColorMain {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		Color col;

		int opc = 0;

		do {

			menu();
			System.out.println("Dime una opcion");

			switch (opc) {

			case 1 -> {
				ColorCRUD.listarColor();
			}
			case 2 -> {
				col = crearColor();
				ColorCRUD.anyadirColor(col);

			}

			case 3 -> {
				col = crearColor();
				ColorCRUD.eliminarColor(col);
			}

			case 4 -> {
				
			}
			}

		} while (opc != 5);

	}

	public static void menu() {
		System.out.println("1. Listar");
		System.out.println("2. Crear");
		System.out.println("3. Borrar");
		System.out.println("4. Cambiar col;0r");
		System.out.println("5. Adioh");
		System.out.println("6. -");
	}

	public static Color crearColor() {

		Color col;

		String color;

		String objeto;

		System.out.println("Dime el color");
		color = reader.nextLine();

		System.out.println("Dime el objeto");
		objeto = reader.nextLine();

		col = new Color(color, objeto);

		return col;

	}

}
