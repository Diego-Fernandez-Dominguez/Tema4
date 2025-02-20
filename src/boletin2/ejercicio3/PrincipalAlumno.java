package boletin2.ejercicio3;

import java.util.Scanner;

public class PrincipalAlumno {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opc;

		String nombre;

		double media;

		Alumno alumno;

		AlumnoCRUD alumnos = new AlumnoCRUD();

		/*
		 * Alumno alum1 = new Alumno("Euseboi Tercero de la Familia", 2.1); Alumno alum2
		 * = new Alumno("Daniel Diaz Uña", 9.5); Alumno alum3 = new
		 * Alumno("Adrian Moreno Montero", 6.7);
		 */

		// Menu hecho con do-while y un switch

		do {
			menu();
			System.out.println("Elige una opcion");
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {

			case 1 -> {
				alumnos.listarAlumnos();
			}
			case 2 -> {

				alumno = creaAlumno();
				alumnos.añadeAlumno(alumno);

			}
			case 3 -> {

				nombre = pedirNombre();
				alumno = alumnos.buscaAlumno(nombre);
				if (alumno != null) {
					System.out.println("Digame la nueva media");
					System.out.println("Digame la media");
					media = sc.nextDouble();
					
					alumno.setMedia(media);
				}else {
					System.out.println("El alumno no existe");
				}

			}
			case 4 -> {

				nombre = pedirNombre();
				alumno = alumnos.buscaAlumno(nombre);
				if (alumno != null) {
					alumnos.borrarAlumno(alumno);
				}else {
					System.out.println("El alumno no existe");
				}
			}
			}

		} while (opc != 5);

		alumnos.listarAlumnos();

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
