package boletin4.ejercicio4;

import java.util.Objects;

/**
 * En la clase fecha guardaremos el denominador y el numerador de una fraccion
 * 
 * @author Diego Fernandez Dominguez
 */
public class Fraccion {

	/**
	 * Numerador de la fraccion
	 */
	private int num;

	/**
	 * Denominador de la fraccion
	 */
	private int den;

	/**
	 * 
	 * @param num
	 * @param den
	 */
	public Fraccion(int num, int den) {

		this.num = num;
		this.den = den;

	}

	/**
	 * Metodo que va a sumar dos fracciones y devolver el resultado de esta
	 * 
	 * @param f2 Fraccion la cual se va a sumar
	 * @return Devuelve la suma de las dos fracciones sin modificar ninguna de las
	 *         dos
	 */
	public Fraccion sumar(Fraccion f2) {

		Fraccion fracTem = new Fraccion(0, 0);

		fracTem.num = this.num * f2.den + this.den * f2.num;
		fracTem.den = this.den * f2.den;

		fracTem.simplificar();

		return f2;

	}

	/**
	 * Metodo que va a restar dos fracciones y devolver el resultado de esta
	 * 
	 * @param f2 Fraccion la cual se va a restar
	 * @return Devuelve la resta de las dos fracciones sin modificar ninguna de las
	 *         dos
	 */
	public Fraccion resta(Fraccion f2) {
		Fraccion fracTem = new Fraccion(0, 0);

		fracTem.num = this.num * f2.den - this.den * f2.num;
		fracTem.den = this.den * f2.den;

		fracTem.simplificar();

		return f2;
	}

	/**
	 * Metodo que va a multiplicar dos fracciones y devolver el resultado de esta
	 * 
	 * @param f2 Fraccion la cual se va a multiplicar
	 * @return Devuelve la multiplicacion de las dos fracciones sin modificar
	 *         ninguna de las dos
	 */
	public Fraccion multiplica(Fraccion f2) {
		Fraccion fracTem = new Fraccion(0, 0);

		fracTem.num = this.num * f2.num;
		fracTem.den = this.den * f2.den;

		fracTem.simplificar();

		return f2;
	}

	/**
	 * Metodo que va a dividir dos fracciones y devolver el resultado de esta
	 * 
	 * @param f2 Fraccion la cual se va a dividir
	 * @return Devuelve la division de las dos fracciones sin modificar ninguna de
	 *         las dos
	 */
	public Fraccion division(Fraccion f2) {
		Fraccion fracTem = new Fraccion(0, 0);

		if (f2.num != 0) {
			fracTem.num = num * f2.den;
			fracTem.den = den * f2.num;
		}

		return fracTem;
	}

	private int mcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	/**
	 * Metodo que simplifica una fraccion
	 * 
	 * @return Devuelve la fraccion simplificada
	 */
	public Fraccion simplificar() {

		Fraccion fracTem = new Fraccion(0, 0);

		int divisorComún;

		divisorComún = mcd(num, den);

		num /= divisorComún;
		den /= divisorComún;

		if (den < 0) {
			num = -num;
			den = -den;
		}

		return fracTem;

	}

	@Override
	/**
	 * 
	 */
	public String toString() {
		return this.num + "/" + this.den;
	}

	/**
	 * Metodo hash del objeto fraccion
	 */
	public int hashCode() {
		return Objects.hash(num, den);
	}

	/**
	 * Metodo que comprueba si dos fracciones son iguales
	 * 
	 * @param f2 Fraccin que se va a comparar
	 * @return Devuelve true si las fracciones son iguales y false si no lo son
	 */
	public boolean equals(Object obj) {

		boolean sonIguales = false;

		return sonIguales;

	}

}
