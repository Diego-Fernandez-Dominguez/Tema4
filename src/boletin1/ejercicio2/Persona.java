package boletin1.ejercicio2;

public class Persona {

	/**
	 * Dni de la persona
	 */
	private String dni = "12345678A";

	/**
	 * Nombre de la persona
	 */
	private String nombre = "NombrePredeterminado";

	/**
	 * Apellidos de la persona
	 */
	private String apellidos = "Apellido1 Apellido2";

	/**
	 * Edad de la persona
	 */
	private int edad = 0;

	/**
	 * Constructor que establece los datos de la persona
	 * 
	 * @param dni       de la persona
	 * @param nombre    de la persona
	 * @param apellidos de la persona
	 * @param edad      de la persona
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {

		if (dni != null && dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		}

		if (nombre != null && nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (apellidos != null && apellidos.isBlank()) {
			this.apellidos = apellidos;
		}

		if (edad >= 0) {
			this.edad = edad;
		}

	}

	/**
	 * Devuelve el dni de la persona
	 * 
	 * @return dni de la persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Devuelve el nombre de la persona
	 * 
	 * @return Nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre de la persona
	 * 
	 * @param nombre de la persona
	 */
	public void setNombre(String nombre) {
		if (nombre != null && nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Devuelve los apellidos de la persona
	 * 
	 * @return Apellidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Modifica los apellidos de la persona
	 * 
	 * @param apellidos de la persona
	 */
	public void setApellidos(String apellidos) {
		if (apellidos != null && apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
	}

	/**
	 * Devuelve la edad de la persona
	 * 
	 * @return Edad de la persona
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Modifica la edad de la persona
	 * 
	 * @param edad de la persona
	 */
	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		}
	}

	public boolean esMayorEdad() {

		boolean mayor;

		if (this.edad >= 18) {
			mayor = true;
		} else {
			mayor = false;
		}

		return mayor;

	}

	public boolean esJubilado() {

		boolean jubilado;

		if (this.edad >= 65) {
			jubilado = true;
		} else {
			jubilado = false;
		}

		return jubilado;

	}

	public int diferenciaEdad(Persona p) {

		int diferencia;

		diferencia = Math.abs(this.edad - p.edad);

		return diferencia;

	}
	
	public String toString() {
		
		String cadena="";
		
		cadena+= "DNI: " + this.dni + "Nombre: " + this.nombre + "Apellidos: " + this.apellidos + "Edad: " + this.edad ;
		
		return cadena;
	}

}
