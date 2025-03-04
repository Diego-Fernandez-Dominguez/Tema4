package boletin4.ejercicio3;

/**
 * En la clase fecha guardaremos los tres datos mas importantes de una fecha:
 * Dia, mes y anyo
 * 
 * @author Diego Fernandez Dominguez
 */
public class Fecha {

	/**
	 *  Dia del objeto fecha
	 */
	private int dia = 1;

	/**
	 *  Mes del objeto fecha
	 */
	private int mes = 1;

	/**
	 *  Anyo del objeto fecha
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

		if (anyo > 0) {
			this.anyo = anyo;
		}

		if (mes > 0 && mes <= 12)

			this.mes = mes;

		if (dia > 0 && dia <= 31) {

			switch (mes) {

			case 1, 3, 5, 7, 8, 10, 12 -> {

				this.dia = dia;

			}
			case 4, 6, 9, 11 -> {

				if (dia <= 30) {
					this.dia = dia;
				}

			}

			default -> {
				if (esBisiesto(anyo)) {

					if (dia <= 29) {
						this.dia = dia;
					}

				} else if (dia <= 28) {
					this.dia = dia;

				}
			}
			}
		}
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

		if (anyo % 4 == 0) {
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

		// Contador que si llega al numero 3 significa que la fecha es correcta
		int cont = 0;

		// Variable que va a guardar si la fecha es correcta o no
		boolean esCor = false;

		// Compruebo si el anyo es correcto
		if (anyo > 0) {
			cont++;
		}

		// Compruebo si el anyo esta en el rango correcto
		if (mes > 0 && mes <= 12)

			cont++;

		// Compruebo si los dias estan en el rango correcto
		if (dia > 0 && dia <= 31) {

			switch (mes) {

			// Si se encuentra en uno de estos meses el dia esta bien
			case 1, 3, 5, 7, 8, 10, 12 -> {

				cont++;

			}

			// Si esta en uno de estos meses, compruebo si el dia es correcto
			case 4, 6, 9, 11 -> {

				if (dia <= 30) {
					cont++;
				}

			}

			// Si llega aqui, el mes es febrero, que tiene menos dias
			default -> {

				// Compruebo si el anyo es bisiesto, y tras esto compruebo el dia
				if (esBisiesto(anyo)) {

					if (dia <= 29) {
						cont++;
					}

				} else if (dia <= 28) {
					cont++;

				}
			}
			}
		}

		// Si el contador es igual a 3, significa que la fecha es correcta
		if (cont == 3) {
			esCor = true;
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
	 * Metodo que va a comparar dos fechas para ver si son iguales
	 * 
	 * @param fecha2 Fecha que se va a comparar
	 * @return Devuelve true si las fechas son iguales y false si no lo son
	 */
	public boolean equals(Fecha fecha2) {

		boolean sonIgu = false;

		if (this.dia == fecha2.dia && this.mes == fecha2.mes && this.anyo == fecha2.anyo) {

			sonIgu = true;

		}

		return sonIgu;

	}

}
