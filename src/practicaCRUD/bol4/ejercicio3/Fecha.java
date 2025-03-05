package practicaCRUD.bol4.ejercicio3;

import java.util.Objects;

/**
 * En la clase fecha guardaremos los tres datos mas importantes de una fecha:
 * Dia, mes y anyo
 * 
 * @author Diego Fernandez Dominguez
 */
public class Fecha {

	/**
	 * Dia del objeto fecha
	 */
	private int dia = 1;

	/**
	 * Mes del objeto fecha
	 */
	private int mes = 1;

	/**
	 * Anyo del objeto fecha
	 */
	private int anyo = 1991;

	/**
	 * Constructor que construye la fecha
	 * 
	 * @param dia  Parametro que guarda el dia de la fecha
	 * @param mes  Parametro que guarda el mes de la fecha
	 * @param anyo Parametro que guarda el anyo de la fecha
	 */
	public Fecha(int dia, int mes, int anyo) {

		if (fechaCorrecta(dia, mes, anyo)) {
			this.dia = dia;
			this.mes = mes;
			this.anyo = anyo;
		}
		;

	}

	/**
	 * Metodo para conseguir el dia de una fecha
	 * 
	 * @return Devuelve el dia de la fecha
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Metodo para modificar el dia de la fecha
	 * 
	 * @param dia Dia de la fecha
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Metodo para conseguir el mes de una fecha
	 * 
	 * @return Devuelve el mes de la fecha
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Metodo para modificar el mes de la fecha
	 * 
	 * @param mes Mes de la fecha
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Metodo para conseguir el anyo de una fecha
	 * 
	 * @return Devuelve el anyo de la fecha
	 */
	public int getAnyo() {
		return anyo;
	}

	/**
	 * Metodo para modificar el anyo de la fecha
	 * 
	 * @param anyo Anyo de la fecha
	 */
	public void setAnyo(int anyo) {
		if (anyo > 0) {
			this.anyo = anyo;
		}

	}

	/**
	 * Metodo que comprueba si el anyo dado es bisiesto
	 * 
	 * @param anyo El anyo introducido
	 * @return Devuelve true si es bisiesto y false si no lo es
	 */
	public boolean esBisiesto(int anyo) {

		boolean esBisi = false;

		if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
			esBisi = true;
		}

		return esBisi;

	}

	/**
	 * Meto que comprueba si la fecha introducida es correcta
	 * 
	 * @param dia  de la fecha
	 * @param mes  de la fecha
	 * @param anyo de la fecha
	 * @return Devuelvo true si la fecha es correcta y false si es incorrecta
	 */
	public boolean fechaCorrecta(int dia, int mes, int anyo) {

		// Variable que va a guardar si la fecha es correcta o no
		boolean esCor = false;

		// Compruebo si el anyo es correcto
		if (anyo > 0) {

			switch (mes) {

			// Si se encuentra en uno de estos meses el dia esta bien
			case 1, 3, 5, 7, 8, 10, 12 -> {

				if (dia <= 31) {
					esCor = true;
				}

			}

			// Si esta en uno de estos meses, compruebo si el dia es correcto
			case 4, 6, 9, 11 -> {

				if (dia <= 30) {
					esCor = true;
				}

			}

			// Si llega aqui, el mes es febrero, que tiene menos dias
			case 2 -> {

				// Compruebo si el anyo es bisiesto, y tras esto compruebo el dia
				if (esBisiesto(anyo)) {

					if (dia <= 29) {
						esCor = true;
					}

				} else if (dia <= 28) {
					esCor = true;

				}
			}
			}
		}

		return esCor;

	}

	/**
	 * Metodo que le suma un dia a la fecha
	 */
	public void diaSiguiente() {

		switch (this.mes) {

		case 1, 3, 5, 7, 8, 10, 12 -> {

			if (this.dia + 1 > 31) {
				this.dia = 1;
				if (this.mes == 12) {
					this.mes = 1;
					this.anyo += 1;
				} else {
					this.mes += 1;
				}

			} else {
				this.dia += 1;
			}

		}

		case 4, 6, 9, 11 -> {

			if (this.dia + 1 > 30) {

				this.dia = 1;
				this.mes += 1;

			} else {
				this.dia += 1;
			}

		}

		default -> {

			if (esBisiesto(this.anyo)) {

				if (this.dia + 1 > 29) {
					this.dia = 1;
					this.mes += 1;
				} else {
					this.dia += 1;
				}

			} else if (this.dia + 1 > 28) {
				this.dia = 1;
				this.mes += 1;
			} else {
				this.dia += 1;
			}
		}
		}
	}

	/**
	 * Metodo para sacar la fecha por pantalla
	 * 
	 * @return Devuelve una cadena con la fecha concatenada
	 */
	public String toString() {

		String cadena = "";

		if (dia < 10) {
			cadena += "0";
		}
		cadena += dia + "-";
		if (mes < 10) {
			cadena += "0";
		}

		cadena += mes + "-" + anyo;

		return cadena;

	}

	/**
	 * Metodo hash que del objeto fecha
	 */
	public int hashCode() {
		return Objects.hash(dia, mes, anyo);
	}

	/**
	 * Metodo que va a comparar dos fechas para ver si son iguales
	 * 
	 * @param fecha2 Fecha que se va a comparar
	 * @return Devuelve true si las fechas son iguales y false si no lo son
	 */
	public boolean equals(Object obj) {

		Fecha fecha2 = (Fecha) obj;

		boolean sonIgu = false;

		if (this.dia == fecha2.dia && this.mes == fecha2.mes && this.anyo == fecha2.anyo) {

			sonIgu = true;

		}

		return sonIgu;

	}

}
