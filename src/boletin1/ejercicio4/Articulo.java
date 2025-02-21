package boletin1.ejercicio4;

public class Articulo {

	/**
	 * Nombre del articulo
	 */
	private String nombre = "Producto";

	/**
	 * Precio del articulo
	 */
	private double precio = 0.0;

	/**
	 * IVA que se va a aplicar a todos los articulos
	 */
	static public final double IVA = 21;

	/**
	 * Cantidas de productos que quedan
	 */
	private int cuantosQuedan = 0;

	/**
	 * Constructor que establece los valores a los articulos
	 * 
	 * @param nombre        del articulo
	 * @param precio        del articulo
	 * @param cuantosQuedan del articulo
	 * @param IVA
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {

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

	/**
	 * Devuelve el nombre del producto
	 * 
	 * @return El nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre del producto
	 * 
	 * @param nombre del producto
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Devuelve el precio del producto
	 * 
	 * @return El precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Modifica el precio del producto
	 * 
	 * @param precio del producto
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Devuelve el stock del producto
	 * 
	 * @return El stock del producto
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Modifica el stock del producto
	 * 
	 * @param cuantosQuedan Cantidad de productos que esan en el stock
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public double getPVP() {

		return (this.precio * (Articulo.IVA) / 100) + this.precio;

	}

	public double getPVPDescuento(int descuento) {

		return (this.precio * (descuento) / 100) + this.precio;

	}

	public boolean vendar(int ventas) {

		boolean posible = false;

		if (ventas <= this.cuantosQuedan && ventas > 0) {

			this.cuantosQuedan -= ventas;

			posible = true;

		}

		return posible;

	}

	public void almacenar(int cantidad) {

		if (cantidad > 0) {

			this.cuantosQuedan += cantidad;

		}

	}

	public String toString() {

		String cadena = "";

		cadena += this.nombre + " - Precio:" + this.precio + "€ - IVA:" + Articulo.IVA + " - PVP:" + this.getPVP()
				+ "€ - Stock:" + this.cuantosQuedan + " unidades";

		return cadena;

	}

}
