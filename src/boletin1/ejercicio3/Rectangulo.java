package boletin1.ejercicio3;

public class Rectangulo {

	/**
	 * Coordenada x1 del rectangulo
	 */
	private int x1 = 0;

	/**
	 * Coordenada y1 del rectangulo
	 */
	private int y1 = 0;

	/**
	 * Coordenada x2 del rectangulo
	 */
	private int x2 = 5;

	/**
	 * Coordenada y2 del rectangulo
	 */
	private int y2 = 5;

	/**
	 * Constructor que comprueba que los valores son validos
	 * 
	 * @param x1 Coordenada x1 del rectangulo
	 * @param y1 Coordenada y1 del rectangulo
	 * @param x2 Coordenada x2 del rectangulo
	 * @param y2 Coordenada y2 del rectangulo
	 */
	public Rectangulo(int x1, int y1, int x2, int y2) {

		if (x1 < x2) {
			this.x1 = x1;
			this.x2 = x2;
		}

		if (y1 < y2) {
			this.y1 = y1;
			this.y2 = y2;
		}
	}

	/**
	 * Devuelve la coordenada x1 del rectangulo
	 * 
	 * @return Coordenada x1 del rectangulo
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Modifica el valor de la coordenada x1 del rectangulo
	 * 
	 * @param x1 La coordenada x1 del rectangulo
	 */
	public void setX1(int x1) {
		if (x1 < x2) {
			this.x1 = x1;
		}
	}

	/**
	 * Devuelve la coordenada y1 del rectangulo
	 * 
	 * @return Coordenada y1 del rectangulo
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Modifica el valor de la coordenada y1 del rectangulo
	 * 
	 * @param y1 La coordenada y1 del rectangulo
	 */
	public void setY1(int y1) {
		if (y1 < y2) {
			this.y1 = y1;
		}
	}

	/**
	 * Devuelve la coordenada x2 del rectangulo
	 * 
	 * @return Coordenada x2 del rectangulo
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Modifica el valor de la coordenada x2 del rectangulo
	 * 
	 * @param x2 La coordenada x2 del rectangulo
	 */
	public void setX2(int x2) {
		if (x2 > x1) {
			this.x2 = x2;
		}
	}

	/**
	 * Devuelve la coordenada y2 del rectangulo
	 * 
	 * @return Coordenada y2 del rectangulo
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Modifica el valor de la coordenada y2 del rectangulo
	 * 
	 * @param y2 La coordenada y2 del rectangulo
	 */
	public void setY2(int y2) {
		if (y2 > y1) {
			this.y2 = y2;
		}
	}

}
