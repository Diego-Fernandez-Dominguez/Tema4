package boletin1.ejercicio4;

public class Articulo {

	/**
	 * Nombre del articulo
	 */
	String nombre = "Producto";

	/**
	 * Precio del articulo
	 */
	double precio = 0.0;

	/**
	 * IVA que se va a aplicar a todos los articulos
	 */
	final double IVA = 0.21;

	/**
	 * Cantidas de productos que quedan
	 */
	int cuantosQuedan = 0;

	/**
	 * Constructor que establece los valores a los articulos
	 * 
	 * @param nombre        del articulo
	 * @param precio        del articulo
	 * @param cuantosQuedan del articulo
	 * @param IVA
	 */
	Articulo(String nombre, double precio, int cuantosQuedan) {

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}

		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}

	}

}
