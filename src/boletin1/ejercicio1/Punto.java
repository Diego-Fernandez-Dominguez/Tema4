package boletin1.ejercicio1;

public class Punto {

	/**
	 * Coordenada x que tendra el punto
	 */
	private int x;

	/**
	 * Coordenada y que tendra el punto
	 */
	private int y;

	/**
	 * Constructor que establece las coordenadas del punto
	 * 
	 * @param x Coordenada x que tendra el punto
	 * @param y Coordenada y que tendra el punto
	 */
	public Punto(int x, int y) {

		this.x = x;
		this.y = y;

	}

	/**
	 * Devuelve el valor x del punto
	 * 
	 * @return
	 */
	public int getX() {
		return x;
	}

	/**
	 * Modificamos el valor x del punto
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Devuelve el valor y del punto
	 * 
	 * @return
	 */
	public int getY() {
		return y;
	}

	/**
	 * Modificamos el valor y del punto
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {

		this.x = x;
		this.y = y;

	}

	public void desplaza(int dx, int dy) {

		this.x = this.x + dx;
		this.y = this.y + dy;

	}

	public double distancia(Punto p) {

		double distancia;

		distancia = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));

		return distancia;

	}

	public String toString() {
		String cadena;
		cadena = "";
		cadena += "(" + x + "," + y + ")";
		return cadena;
	}

}
