package boletin2.ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class AlumnoCRUD {

	// Atributo que va a ser la coleccion donde almacenar nuestros objetos
	private static Set<Alumno> alumnos = new HashSet<Alumno>();

	public static void listarAlumnos() {
		for (Alumno a : alumnos) {
			System.out.println(a);
			System.out.println("-------------------------------");
		}
	}

	public static boolean añadeAlumno(Alumno a) {

		return alumnos.add(a);

	}

	public static Alumno buscaAlumno(String nombre) {

		Alumno a = null;

		for (Alumno aBusqueda : alumnos) {
			if (aBusqueda.getNombre().equals(nombre)) {
				a = aBusqueda;
			}
		}

		return a;

	}

	public static boolean borrarAlumno(Alumno alum) {
		return alumnos.remove(alum);
	}

	public static boolean modificarMedia(String nombre, double media) {

		boolean sePudo = false;

		Alumno a = buscaAlumno(nombre);
		if (a != null) {
			a.setMedia(media);
			sePudo = true;
		}

		return sePudo;

	}

}
