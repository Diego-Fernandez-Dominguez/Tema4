package boletin2.ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class AlumnoCRUD {

	// Atributo que va a ser la coleccion donde almacenar nuestros objetos
	private Set<Alumno> alumnos = new HashSet<Alumno>();

	public void listarAlumnos() {
		for (Alumno a : alumnos) {
			System.out.println(a);
			System.out.println("-------------------------------");
		}
	}

	public boolean añadeAlumno(Alumno a) {

		return alumnos.add(a);

	}

	public Alumno buscaAlumno(String nombre) {

		Alumno a = null;

		for (Alumno aBusqueda : alumnos) {
			if (aBusqueda.getNombre() == nombre) {
				a = aBusqueda;
			}
		}

		return a;

	}
	
	public boolean borrarAlumno(Alumno alum) {
		return alumnos.remove(alum);
	}

}
