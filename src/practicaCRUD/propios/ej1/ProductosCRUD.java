package practicaCRUD.propios.ej1;

import java.util.HashSet;

public class ProductosCRUD {

	/**
	 * Lista en la que se van a guardar los productos
	 */
	private static HashSet<Productos> lisProductos = new HashSet<Productos>();

	/**
	 * Metodo para sacar los productos por pantalla
	 */
	public static void listarProductos() {
		for (Productos p : lisProductos) {
			System.out.println(p);
			System.out.println("------------------------");
		}
	}

	/**
	 * Metodo para añadir un producto a la lista
	 * 
	 * @param p Producto a añadir
	 * @return True si se ha añadido y false si no
	 */
	public static boolean añadirProducto(Productos p) {
		return lisProductos.add(p);
	}

	/**
	 * Metodo para buscar un producto en la lista
	 * 
	 * @param prod Producto a buscar en la lista
	 * @return Devuelve un producto
	 */
	private static Productos buscaProducto(Productos prod) {

		Productos p = null;

		for (Productos pMod : lisProductos) {
			if (pMod.equals(prod)) {
				p = pMod;
			}
		}

		return p;

	}

	/**
	 * Metodo para buscar modificar el stock de un producto
	 * 
	 * @param prod  Producto al que se quiere modificar
	 * @param stock Stock a cambiar
	 * @return Devuelve true si se ha cambiado y false si no
	 */
	public static boolean modificarStock(Productos prod, int stock) {

		boolean sePudo = false;

		Productos prodMod = buscaProducto(prod);

		if (prodMod != null) {
			prodMod.setCantidadStock(stock);
			sePudo = true;
		}

		return sePudo;

	}

	/**
	 * Metodo para buscar modificar el stock de un producto
	 * 
	 * @param prod   Producto al que se quiere modificar
	 * @param precio Precio a cambiar
	 * @return Devuelve true si se ha cambiado y false si no
	 */
	public static boolean modificarPrecio(Productos prod, double precio) {

		boolean sePudo = false;

		Productos prodMod = buscaProducto(prod);

		if (prodMod != null) {
			prodMod.setPrecioUnitario(precio);
			sePudo = true;
		}

		return sePudo;
	}

	/**
	 * Metodo para eliminar un producto
	 * 
	 * @param p Producto a eliminar
	 * @return True si se ha eliminado y false si no
	 */
	public static boolean eliminarProducto(Productos p) {

		return lisProductos.remove(p);

	}
}
