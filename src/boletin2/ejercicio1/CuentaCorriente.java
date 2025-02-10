package boletin2.ejercicio1;

public class CuentaCorriente {

	private String dni;

	private String nombre;

	private int saldo;

	Nacionalidad nacion;

	enum Nacionalidad {

		ESPAÑOLA, EXTRANJERA

	}

	public CuentaCorriente(String dni, String nombre, int saldo, String nacion) {

		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacion = Nacionalidad.valueOf(nacion);

	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		if (nombre != null && !nombre.isBlank())
			this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Nacionalidad getNacion() {
		return nacion;
	}

	public void setNacion(Nacionalidad nacion) {
		this.nacion = nacion;
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

}
