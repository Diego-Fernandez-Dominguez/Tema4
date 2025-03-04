package boletin4.ejercicio2;

/**
 * En la clase contador guardaremos un numero el cual representara a un contador
 * 
 * @author Diego Fernandez Dominguez
 */
public class Contador {

	/**
	 *  Atributo que va a guardar el contador del contador
	 */
	private int cont = 0;

	/**
	 * Constructor de un objeto contador
	 * 
	 * @param cont Numero de x que se le va a sumar al contador
	 */
	public Contador(int cont) {

		if (cont > 0) {
			this.cont += cont;
		}

	}

	/**
	 * Metodo para obtener el valor de contador
	 * 
	 * @return Devuelve el contador
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * Metodo para modificar el contador
	 * 
	 * @param cont Parametro por el cual se va a intercambiar el contador
	 */
	public void setCont(int cont) {
		this.cont = cont;
	}

	/**
	 * Metodo que incremente 1 al contador
	 */
	public void incrementar() {
		this.cont += 1;
	}

	/**
	 * Metodo que decrementa el contador en 1 unidad
	 */
	public void decrementar() {

		if (cont >= 1) {
			this.cont -= 1;
		}

	}

	/**
	 * Metodo para sacar el contador por pantalla
	 * 
	 * @return Devuelve una cadena con el contador
	 */
	public String toString() {

		return "- " + this.cont + " -";

	}

	/**
	 * Metodo que comprueba si dos objetos contador son iguales
	 * 
	 * @param cont2 Contador que va a ser comparado
	 * @return Devuelve true si son iguales y falso si no lo son
	 */
	public boolean equals(Contador cont2) {

		boolean iguales = false;

		if (this.cont == cont2.getCont()) {
			iguales = true;
		}

		return iguales;

	}

}
