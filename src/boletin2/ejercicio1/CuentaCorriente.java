package boletin2.ejercicio1;

public class CuentaCorriente {

	private String dni = "no especificado";

	private String nombre = "no especificado";

	private double saldo = 0.1;

	Nacionalidad nacion = Nacionalidad.ESPAÑOLA;

	enum Nacionalidad {

		ESPAÑOLA, EXTRANJERA

	}

	/**
	 * 
	 * @param dni
	 * @param saldo
	 */
	public CuentaCorriente(String dni, double saldo) {

		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (saldo > 0) {
			this.saldo = saldo;
		}

	}

	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param saldo
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {

		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (saldo > 0) {
			this.saldo = saldo;
		}

	}

	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param saldo
	 * @param nacion
	 */
	public CuentaCorriente(String dni, String nombre, int saldo, String nacion) {

		nacion = nacion.toUpperCase();

		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (saldo > 0) {
			this.saldo = saldo;
		}

		comprobarNacion(nacion);

	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {

		if (saldo > 0) {
			this.saldo = saldo;
		}

		this.saldo = saldo;
	}

	public Nacionalidad getNacion() {
		return nacion;
	}

	public void setNacion(String nacion) {

		nacion = nacion.toUpperCase();

		comprobarNacion(nacion);

	}

	public void comprobarNacion(String nacion) {

		switch (nacion) {

		case "EXTRANJERA" -> {
			this.nacion = Nacionalidad.EXTRANJERA;
		}

		default -> {
			this.nacion = Nacionalidad.ESPAÑOLA;
		}

		}
	}

	public boolean sacarDinero(int dinero) {

		boolean sePudo = false;

		if (saldo >= dinero) {
			saldo -= dinero;

			sePudo = true;

		}

		return sePudo;

	}

	public boolean ingresarDinero(int dinero) {

		boolean sePudo = false;

		if (dinero > 0) {

			saldo += dinero;
			sePudo = true;

		}

		return sePudo;

	}

	@Override
	public String toString() {

		String cadena = "";

		cadena += "DNI: " + dni + " - Nombre: " + nombre + " - Saldo: " + saldo + " - Nacionalidad: " + nacion;

		return cadena;

	}

	public boolean equals(Object obj) {

		CuentaCorriente cuenta2 = (CuentaCorriente) obj;

		boolean iguales = false;

		if (this.nombre.equals(cuenta2.nombre) && this.dni.equals(cuenta2.dni)) {
			iguales = true;
		}

		return iguales;

	}

}
