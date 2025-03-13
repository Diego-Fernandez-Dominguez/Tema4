package practicaCRUD.propios.ej1;

import java.util.Objects;

/**
 * Clase que va a guardar productos juntos con sus caracteristicas
 */
public class Productos {

	/**
	 * Codigo del producto
	 */
	private int codigo = 0;

	/**
	 * Nombre del producto
	 */
	private String nombre = "Desconocido";

	/**
	 * Precio unitario del producto
	 */
	private double precioUnitario = 1;

	/**
	 * Stock disponible del producto
	 */
	private int cantidadStock = 0;

	/**
	 * Categoria del producto
	 */
	private CategoriaProd categoria = CategoriaProd.valueOf("ELECTRONICA");

	/**
	 * Posibles categorias de los productos
	 */
	enum CategoriaProd {
		ELECTRONICA, ROPA, ALIMENTOS, JUEGOS
	}

	/**
	 * Constructor que crea un objeto con sus valores principales
	 * 
	 * @param codigo Codigo del producto
	 * @param nombre Nombre del producto
	 */
	public Productos(int codigo, String nombre) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Constructor que crea un objeto con todos sus valores
	 * 
	 * @param codigo         Codigo del producto
	 * @param nombre         Nombre del producto
	 * @param precioUnitario Precio por unidad del producto
	 * @param cantidadStock  Stock del producto
	 * @param categoria      Categoria del poducto
	 */
	public Productos(int codigo, String nombre, double precioUnitario, int cantidadStock, String categoria) {

		if (codigo > 0) {
			this.codigo = codigo;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (precioUnitario > 0) {
			this.precioUnitario = precioUnitario;
		}

		if (cantidadStock > 0) {
			this.cantidadStock = cantidadStock;
		}

		comprobarCategoria(categoria);

	}

	/**
	 * Metodo para obtener el codigo de un producto
	 * 
	 * @return Devuelve un codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Metodo para modificar el codigo de un producto
	 * 
	 * @param codigo Codigo a cambiar
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Metodo para obtener el codigo de un producto
	 * 
	 * @return Devuelve un codigo
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para modificar el nombre de un producto
	 * 
	 * @param nombre Nombre por el que se quiere cambiar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para obtener el precio unitario de un producto
	 * 
	 * @return Devuelve el precio unitario
	 */
	public double getPrecioUnitario() {
		return precioUnitario;
	}

	/**
	 * Metodo para modificar el precio unitario de un producto
	 * 
	 * @param precioUnitario Precio por el que se quiere cambiar
	 */
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	/**
	 * Metodo para obtener el stock de un producto
	 * 
	 * @return Devuelve el stock de un producto
	 */
	public int getCantidadStock() {
		return cantidadStock;
	}

	/**
	 * Metodo para modificar el stock de un producto
	 * 
	 * @param cantidadStock Stock por el que se quiere cambiar
	 */
	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	/**
	 * Metodo para obtener la categoria de un producto
	 * 
	 * @return Devuelve la categoria del producto
	 */
	public CategoriaProd getCategoria() {
		return categoria;
	}

	/**
	 * Metodo para comprobar la categoria del producto y ponerle el valor correcto
	 * 
	 * @param cat Categoria del producto
	 */
	private void comprobarCategoria(String cat) {

		if (cat != null) {

			cat = cat.toUpperCase();

			switch (cat) {

			case "ELECTRONICA", "ROPA", "ALIMENTOS", "JUEGOS" -> {
				this.categoria = CategoriaProd.valueOf(cat);
			}

			}
		}
	}

	/**
	 * Metodo para calcular el valor del stock del producto
	 * 
	 * @return Devuelve el valor del stock del producto
	 */
	public double calcularValorStock() {

		return precioUnitario * cantidadStock;

	}

	/**
	 * Metodo para actualizar el stock del producto
	 * 
	 * @param num Numero de stock que se ha vendido/comprado
	 */
	public void actualizarStock(int num) {

		this.cantidadStock = cantidadStock - num;

	}

	@Override
	/**
	 * Metodo para marcar las claves principales de las listas hash de la clase
	 * Productos
	 */
	public int hashCode() {
		return Objects.hash(codigo, nombre);
	}

	@Override
	/**
	 * Metodo que compara si dos objetos son iguales
	 * 
	 * @return Devuelve true si son iguales y false si no lo son
	 */
	public boolean equals(Object obj) {

		boolean igu = false;

		Productos prod = (Productos) obj;

		if (this.codigo == prod.codigo && this.nombre.equals(prod.nombre)) {
			igu = true;
		}

		return igu;
	}

	@Override
	/**
	 * Metodo toString de la clase Productos
	 * 
	 * @return Devuelve la cadena de productos
	 */
	public String toString() {
		return codigo + " " + nombre + " " + precioUnitario + "€ " + cantidadStock + " " + categoria;
	}

}
