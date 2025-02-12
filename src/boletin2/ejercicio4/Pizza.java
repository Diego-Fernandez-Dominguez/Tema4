package boletin2.ejercicio4;

public class Pizza {

	private int codigo = 0;

	private TamañoPizza tamaño = TamañoPizza.MEDIANA;

	private TipoPizza tipo = TipoPizza.MARGARITA;

	private EstadoPizza estado = EstadoPizza.PEDIDA;

	enum TamañoPizza {

		MEDIANA, FAMILIAR

	}

	enum TipoPizza {

		MARGARITA, CUATROQUESOS, FUNGHI

	}

	enum EstadoPizza {

		PEDIDA, SERVIDA

	}

	/**
	 * 
	 * @param codigo
	 * @param tamaño
	 * @param tipo
	 */
	public Pizza(int codigo, String tamaño, String tipo) {

		tamaño = tamaño.toUpperCase();
		tipo = tipo.toUpperCase();

		if (codigo >= 0) {
			this.codigo = codigo;
		}

		comprobarTamaño(tamaño);

		comprobarTipo(tipo);

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public TamañoPizza getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {

		tamaño = tamaño.toUpperCase();

		comprobarTamaño(tamaño);
	}

	public TipoPizza getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		tipo = tipo.toUpperCase();

		comprobarTipo(tipo);

	}

	public EstadoPizza getEstado() {
		return estado;
	}

	public void setEstado(String estado) {

		estado = estado.toUpperCase();

		comprobarEstado(estado);

	}

	/**
	 * 
	 * @param tamaño
	 */
	public void comprobarTamaño(String tamaño) {

		switch (tamaño) {

		case "FAMILIAR", "MEDIANA" -> {
			this.tamaño = TamañoPizza.valueOf(tamaño);
		}

		}

	}

	/**
	 * 
	 * @param tipo
	 */
	public void comprobarTipo(String tipo) {

		switch (tipo) {

		case "CUATROQUESOS", "FUNGHI", "MARGARITA" -> {
			this.tipo = TipoPizza.valueOf(tipo);

		}

		}
	}

	/**
	 * 
	 * @param estado
	 */
	public void comprobarEstado(String estado) {

		switch (estado) {

		case "SERVIDA", "PEDIDA" -> {
			this.estado = EstadoPizza.valueOf(estado);
		}
		}

	}

	/**
	 * 
	 */
	public String toString() {
		String cadena = "";

		cadena += codigo + ": " + tamaño + " - " + tipo + " - " + estado;

		return cadena;
	}

	/**
	 * 
	 */
	public boolean equals(Object obj) {

		Pizza pizza2 = (Pizza) obj;

		boolean iguales = false;

		if (codigo == pizza2.codigo) {
			iguales = true;
		}

		return iguales;

	}

}
