package boletin2.ejercicio3;

import java.util.Scanner;

public class PrincipalAlumno {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opc;

		String nombre;

		double media;

		Alumno alumno;

		//AlumnoCRUD alumnos = new AlumnoCRUD();

		Alumno alum1 = new Alumno("Euseboi Tercero de la Familia", 2.1);
		Alumno alum2 = new Alumno("Daniel Diaz Uña", 9.5);
		Alumno alum3 = new Alumno("Adrian Moreno Montero", 5.7);
		Alumno alum4 = new Alumno("Simple", 7.3);

		AlumnoCRUD.añadeAlumno(alum1);
		AlumnoCRUD.añadeAlumno(alum2);
		AlumnoCRUD.añadeAlumno(alum3);
		AlumnoCRUD.añadeAlumno(alum4);

		// Menu hecho con do-while y un switch

		do {
			menu();
			System.out.println("Elige una opcion");
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {

			case 1 -> {
				AlumnoCRUD.listarAlumnos();
			}
			case 2 -> {

				alumno = creaAlumno();
				AlumnoCRUD.añadeAlumno(alumno);

			}
			case 3 -> {

				nombre = pedirNombre();
				System.out.println("Digame la nueva media");
				media = sc.nextDouble();

				if (AlumnoCRUD.modificarMedia(nombre, media)) {
					System.out.println("Se pudo cambiar la media");
				} else {
					System.out.println("No se pudo modificar la media");
				}

			}

			case 4 -> {

				nombre = pedirNombre();
				alumno = AlumnoCRUD.buscaAlumno(nombre);
				if (alumno != null) {
					AlumnoCRUD.borrarAlumno(alumno);
				} else {
					System.out.println("El alumno no existe");
				}
			}
			case 5 -> System.out.println("Saliendo del sistema...");

			default -> System.out.println("Opción no válida");

			}

		} while (opc != 5);

		sc.close();

	}

	static void menu() {
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}

	static Alumno creaAlumno() {

		String nombre;

		double media;

		Alumno al;

		nombre = pedirNombre();

		System.out.println("Digame la media");
		media = sc.nextDouble();

		al = new Alumno(nombre, media);

		return al;

	}

	private static String pedirNombre() {

		String nombre;

		System.out.println("Digame el nombre del alumno");
		nombre = sc.nextLine();

		return nombre;

	}

}
