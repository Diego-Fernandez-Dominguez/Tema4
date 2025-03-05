package practicaCRUD.bol4.ejercicio1;

import java.util.Objects;

/**
 * En la clase hora guardaremos los tres datos mas importantes de una fecha: Las
 * horas, los minutos y los segundos
 * 
 * @author Diego Fernandez Dominguez
 */
public class Hora {

	/**
	 * Variable que va a guardar la hora
	 */
	private int hora = 0;

	/**
	 * Variable que va a guardar los minutos
	 */
	private int minuto = 0;

	/**
	 * Variable que va a guardar los segundos
	 */
	private int segundo = 0;

	/**
	 * Constructor que construye un objeto hora
	 * 
	 * @param hora    Parametro que va a guadar la hora del objeto
	 * @param minuto  Parametro que va a guadar los minutos del objeto
	 * @param segundo Parametro que va a guadar los segundos del objeto
	 */
	public Hora(int hora, int minuto, int segundo) {

		// Esta restriccion obliga a la hora a estar entre 0 y 23
		if (hora <= 23 && hora >= 0) {
			this.hora = hora;
		}

		// Esta restriccion obliga a los minutos a estar entre 0 y 59
		if (minuto <= 59 && hora >= 0) {
			this.minuto = minuto;
		}

		// Esta restriccion obliga a los segundos a estar entre 0 y 59
		if (segundo <= 59 && hora >= 0) {
			this.segundo = segundo;
		}

	}

	/**
	 * Metodo para obtener la hora del objeto con el que se ha llamado
	 * 
	 * @return Devuelve la hora del objeto
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Funcion cuya utilidad es cambiar la hora del objeto con el que se ha llamado
	 * 
	 * @param hora Parametro que guarda la hora del objeto
	 */
	public void setHora(int hora) {

		// Esta restriccion obliga a la hora a estar entre 0 y 23
		if (hora <= 23 && hora >= 0) {
			this.hora = hora;
		}
	}

	/**
	 * Metodo para obtener los minutos del objeto con el que se ha llamado
	 * 
	 * @return Devuelve los minutos del objeto
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * Funcion cuya utilidad es cambiar los minutos del objeto con el que se ha
	 * llamado
	 * 
	 * @param minuto Parametro que guarda los minutos del objeto
	 */
	public void setMinuto(int minuto) {

		// Esta restriccion obliga a los minutos a estar entre 0 y 59
		if (minuto <= 59 && hora >= 0) {
			this.minuto = minuto;
		}
	}

	/**
	 * Metodo para obtener los segundos del objeto con el que se ha llamado
	 * 
	 * @return Devuelve los minutos del objeto
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * Funcion cuya utilidad es cambiar los segundos del objeto con el que se ha
	 * llamado
	 * 
	 * @param segundp Parametro que guarda los segundos del objeto
	 */
	public void setSegundo(int segundo) {

		// Esta restriccion obliga a los segundos a estar entre 0 y 59
		if (segundo <= 59 && hora >= 0) {
			this.segundo = segundo;
		}
	}

	/**
	 * Metodo que le incrementa 1 segundo a la hora
	 */
	public void incrementarSegundo() {

		/*
		 * En este if anidado compruebo si los segundos estan a 59, si es asi compruebo
		 * lo mismo con los minutos y si es asi compruebo si las horas estan a 23, si
		 * todo se cumple la hora se pondra a 0:0:0, si no solo se le sumara 1 segundo a
		 * los segundos y si estos estan a 59 se le suma 1 minuto a los minutos
		 */
		if (this.segundo == 59) {
			this.segundo = 0;

			if (this.minuto == 59) {
				this.minuto = 0;

				if (this.hora == 23) {
					this.hora = 0;
				} else {
					this.hora += 1;
				}

			} else {
				this.minuto += 1;
			}

		} else {
			this.segundo += 1;
		}

	}

	/**
	 * Metodo que va a sacar por pantalla un objeto hora
	 * 
	 * @return Devuelve una cadena con los atributos del objeto con el que se ha
	 *         llamado a la funcion
	 */
	public String toString() {

		return this.hora + ":" + this.minuto + ":" + this.segundo;

	}

	/**
	 * Metodo hash del objeto hora
	 */
	public int hashCode() {
		return Objects.hash(hora, minuto, segundo);
	}

	/**
	 * Metodo que comprueba si dos objetos horas son iguales
	 * 
	 * @param horaCom Objeto hora que va a ser comparado con la hora puesta en la
	 *                llamada a la funcion
	 * @return Devuelve si los dos objetos son iguales
	 */
	public boolean equals(Object obj) {

		Hora horaCom = (Hora) obj;

		boolean iguales = false;

		// Compruebo si todos los atributos de los objetos son iguales entre si
		if (this.hora == horaCom.hora && this.minuto == horaCom.minuto && this.segundo == horaCom.segundo) {

			iguales = true;

		}

		return iguales;

	}

}
