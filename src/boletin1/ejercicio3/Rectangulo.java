package boletin1.ejercicio3;

public class Rectangulo {

	/**
	 * Coordenada x1 del rectangulo
	 */
	int x1 = 0;

	/**
	 * Coordenada y1 del rectangulo
	 */
	int y1 = 0;

	/**
	 * Coordenada x2 del rectangulo
	 */
	int x2 = 5;

	/**
	 * Coordenada y2 del rectangulo
	 */
	int y2 = 5;

	/**
	 * Constructor que comprueba que los valores son validos 
	 * 
	 * @param x1 Coordenada x1 del rectangulo
	 * @param y1 Coordenada y1 del rectangulo
	 * @param x2 Coordenada x2 del rectangulo
	 * @param y2 Coordenada y2 del rectangulo
	 */
	Rectangulo(int x1, int y1, int x2, int y2) {

		if (x1 < x2) {
			this.x1 = x1;
			this.x2 = x2;
		}

		if (y1 < y2) {
			this.y1 = y1;
			this.y2 = y2;
		}
	}

}
