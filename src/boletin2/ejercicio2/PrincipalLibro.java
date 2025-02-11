package boletin2.ejercicio2;

public class PrincipalLibro {
	public static void main(String[] args) {

		Libro libro1 = new Libro("Vaya bufarrada historica macho", "Calacas Chidas");
		Libro libro2 = new Libro("Nunca me rendire", "El Rendiciones", -1, 0);
		Libro libro3 = new Libro("Vaya subnor el de arriba", "", 10, 6, "LIRICO");

		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(libro3);

		System.out.println();

		if (libro3.devolucion(7)) {
			System.out.println("Se pudieron devolver los libros");
		} else {
			System.out.println("No se pudieron devolver los libros");
		}

		if (libro3.prestamo(3)) {
			System.out.println("Se pudieron dar los libros");
		} else {
			System.out.println("No se pudieron dar los libros");
		}

		System.out.println();

		if (libro1.equals(libro2)) {
			System.out.println("Son el mismo libro");
		} else {
			System.out.println("No son el mismo libro");
		}

	}

}
