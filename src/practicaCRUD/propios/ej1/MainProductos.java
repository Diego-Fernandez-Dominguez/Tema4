package practicaCRUD.propios.ej1;

import java.util.Scanner;

public class MainProductos {

	// Creo el escaner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Objeto producto
		Productos prod;

		// Opcion que va a ser elegida por el usuario
		int opc = 0;

		// Codigo del producto
		int codigo;

		// Nombre del producto
		String nombre;

		// Stock del producto
		int stock;

		// Precio del producto
		double precio;

		do {

			// Saco el menu por pantalla
			menu();

			// Le pido al usuario la opcion y el la pone
			System.out.println("Digame una opcion");
			opc = reader.nextInt();
			reader.nextLine();

			switch (opc) {

			// Opcion para crear el usuario
			case 1 -> {

				prod = crearProd();
				ProductosCRUD.añadirProducto(prod);

			}

			// Opcion para listar los productos guardados en la lista
			case 2 -> {
				ProductosCRUD.listarProductos();
			}

			// Opcion para cambiar el stock
			case 3 -> {
				codigo = pedirCodigo();
				nombre = pedirNombre();
				System.out.println("Dime el stock");
				stock = reader.nextInt();
				reader.nextLine();

				prod = new Productos(codigo, nombre);

				if (ProductosCRUD.modificarStock(prod, stock)) {
					System.out.println("Se pudo");
				} else {
					System.out.println("No se pudo");
				}

			}

			// Opcion para cambiar el precio del producto
			case 4 -> {
				codigo = pedirCodigo();
				nombre = pedirNombre();

				prod = new Productos(codigo, nombre);

				System.out.println("Dime el precio");
				precio = reader.nextDouble();
				reader.nextLine();
				if (ProductosCRUD.modificarPrecio(prod, precio)) {
					System.out.println("Si");
				} else {
					System.out.println("No");
				}
			}

			// Opcion para eliminar el producto
			case 5 -> {
				codigo = pedirCodigo();
				nombre = pedirNombre();
				prod = new Productos(codigo, nombre);

				if (ProductosCRUD.eliminarProducto(prod)) {
					System.out.println("Si");
				} else {
					System.out.println("No");
				}
			}

			case 6 -> {
				System.out.println("Adioh");
			}

			}
		} while (opc != 6);

	}

	static void menu() {

		System.out.println("1. Añadir producto");
		System.out.println("2. Listar productos");
		System.out.println("3. Modificar stock");
		System.out.println("4. Modificar precio unitario");
		System.out.println("5. Eliminar producto");
		System.out.println("6. Salir");

	}

	static int pedirCodigo() {

		int codigo;

		System.out.println("Digame el codigo");
		codigo = reader.nextInt();
		reader.nextLine();

		return codigo;

	}

	static String pedirNombre() {
		String nombre;

		System.out.println("Digame el nombre");
		nombre = reader.nextLine();

		return nombre;
	}

	static Productos crearProd() {

		Productos prod;

		int codigo;

		String nombre;

		double precio;

		int cantidad;

		String categoria;

		codigo = pedirCodigo();

		nombre = pedirNombre();

		System.out.println("Digame el precio");
		precio = reader.nextDouble();
		reader.nextLine();

		System.out.println("Digame la cantidad");
		cantidad = reader.nextInt();
		reader.nextLine();

		System.out.println("Digame la categoria");
		categoria = reader.nextLine();

		prod = new Productos(codigo, nombre, precio, cantidad, categoria);

		return prod;

	}

}
