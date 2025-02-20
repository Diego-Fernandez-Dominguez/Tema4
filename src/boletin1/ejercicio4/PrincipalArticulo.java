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

		Gestimal articulos = new Gestimal();

		Articulo art1 = new Articulo("Zapatos manchados de pintura", 89.99, 3);
		Articulo art2 = new Articulo("Chicle sabor paella valenciana", 2.43, 78);

		articulos.añadeArticulo(art1);
		articulos.añadeArticulo(art2);

		do {

			menu();
			System.out.println("Elige una opcion");
			opc = sc.nextLine();
			sc.nextLine();

			switch (opc) {

			case "a" -> articulos.listarArticulos();
			case "b" -> {

				articulo = creaArticulo();
				articulos.añadeArticulo(articulo);

			}
			case "c" -> {

				nombre = pedirNombre();
				articulo = articulos.buscaArticulo(nombre);
				if (articulo != null) {
					articulos.borrarArticulo(articulo);
				} else {
					System.out.println("Articulo no encontrado");
				}

			}
			case "d" -> {

				nombre = pedirNombre();
				articulo = articulos.buscaArticulo(nombre);
				if (articulo != null) {

					System.out.println("Digame el precio");
					precio = sc.nextDouble();
					sc.nextLine();

					System.out.println("Digame el cuantos quedan");
					cuantosQuedan = sc.nextInt();
					sc.nextLine();

					articulo.setPrecio(precio);
					articulo.setCuantosQuedan(cuantosQuedan);

				} else {
					System.out.println("Articulo no encontrado");
				}

			}

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
