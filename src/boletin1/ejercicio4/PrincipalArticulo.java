package boletin1.ejercicio4;

import java.util.Scanner;

public class PrincipalArticulo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String opc = "";

		String nombre;

		double precio;

		int cuantosQuedan;

		Articulo articulo;

		// Gestimal articulos = new Gestimal();

		Articulo art1 = new Articulo("Zapatos manchados de pintura", 89.99, 3);
		Articulo art2 = new Articulo("Chicle sabor paella valenciana", 2.43, 78);
		Articulo art3 = new Articulo("Simple", 34.5, 4);

		Gestimal.añadeArticulo(art1);
		Gestimal.añadeArticulo(art2);
		Gestimal.añadeArticulo(art3);

		do {

			menu();
			System.out.println("Elige una opcion");
			opc = sc.nextLine();

			switch (opc) {

			case "a" -> Gestimal.listarArticulos();
			case "b" -> {

				articulo = creaArticulo();
				Gestimal.añadeArticulo(articulo);

			}
			case "c" -> {

				nombre = pedirNombre();
				articulo = Gestimal.buscaArticulo(nombre);
				if (articulo != null) {
					Gestimal.borrarArticulo(articulo);
				} else {
					System.out.println("Articulo no encontrado");
				}

			}
			case "d" -> {

				nombre = pedirNombre();
				System.out.println("Digame el precio");
				precio = sc.nextDouble();
				sc.nextLine();

				if (Gestimal.modificarDatos(nombre, precio)) {

					System.out.println("Se pudo modificar el articulo");

				} else {
					System.out.println("No se pudo modificar el articulo");
				}

			}
			case "e" -> {

				nombre = pedirNombre();
				System.out.println("Digame la cantidad a aumentar");
				cuantosQuedan = sc.nextInt();
				sc.nextLine();

				if (Gestimal.entradaMercancia(nombre, cuantosQuedan)) {

					System.out.println("Se pudo modificar el articulo");

				} else {
					System.out.println("No se pudo modificar el articulo");
				}

			}

			case "f" -> {

				nombre = pedirNombre();
				System.out.println("Digame la cantidad a aumentar");
				cuantosQuedan = sc.nextInt();
				sc.nextLine();

				if (Gestimal.salidaMercancia(nombre, cuantosQuedan)) {

					System.out.println("Se pudo modificar el articulo");

				} else {
					System.out.println("No se pudo modificar el articulo");
				}
			}

			case "g" -> {
				System.out.println("Saliendo del programa...");
			}
			default -> System.out.println("Opcion no valida");
			}

		} while (!opc.equals("g"));

	}

	static void menu() {
		System.out.println("a. Listado");
		System.out.println("b. Alta");
		System.out.println("c. Baja");
		System.out.println("d. Modificacion");
		System.out.println("e. Entrada mercancia");
		System.out.println("f. Salida mercancia");
		System.out.println("g. Salir");
	}

	static Articulo creaArticulo() {

		String nombre;

		double precio;

		int cuantosQuedan;

		Articulo ar;

		System.out.println("Digame el nombre");
		nombre = sc.nextLine();
		sc.nextLine();

		System.out.println("Digame el precio");
		precio = sc.nextDouble();
		sc.nextLine();

		System.out.println("Digame el cuantos quedan");
		cuantosQuedan = sc.nextInt();
		sc.nextLine();

		ar = new Articulo(nombre, precio, cuantosQuedan);

		return ar;

	}

	private static String pedirNombre() {

		String nombre;

		System.out.println("Digame el nombre del articulo");
		nombre = sc.nextLine();

		return nombre;

	}

}
