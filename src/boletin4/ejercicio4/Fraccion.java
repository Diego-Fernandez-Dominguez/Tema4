package boletin4.ejercicio4;

public class Fraccion {

	/**
	 * Numerador de la fraccion
	 */
	private int num;

	/**
	 * Denominador de la fraccion
	 */
	private int den;

	public Fraccion(int num, int den) {

		this.num = num;
		this.den = den;

	}

	public Fraccion sumar(Fraccion f2) {

		Fraccion fracTem = new Fraccion(0, 0);

		fracTem.num = this.num + f2.num;
		fracTem.den = this.den + f2.den;

		return f2;

	}

	public Fraccion simplifica() {

		Fraccion fracTem = new Fraccion(0, 0);

		return fracTem;

	}

}
