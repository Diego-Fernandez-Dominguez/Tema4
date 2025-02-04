package boletin1.ejercicio2;

public class Persona {

	/**
	 * Dni de la persona
	 */
	String dni;

	/**
	 * Nombre de la persona
	 */
	String nombre;

	/**
	 * Apellidos de la persona
	 */
	String apellidos;

	/**
	 * Edad de la persona
	 */
	int edad;

	/**
	 * Constructor que establece los datos de la persona
	 * 
	 * @param dni       de la persona
	 * @param nombre    de la persona
	 * @param apellidos de la persona
	 * @param edad      de la persona
	 */
	Persona(String dni, String nombre, String apellidos, int edad) {

		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;

	}

}
