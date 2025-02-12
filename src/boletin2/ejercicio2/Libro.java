package boletin2.ejercicio2;

public class Libro {

	private String titulo = "No especificado";

	private String autor = "Desconocido";

	private int ejemplares = 1;

	private int ejemplaresPres = 0;

	private GeneroLibro genero = GeneroLibro.NARRATIVO;

	enum GeneroLibro {
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	}

	/**
	 * 
	 * @param titulo
	 * @param autor
	 */
	public Libro(String titulo, String autor) {

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}

	}

	/**
	 * 
	 * @param titulo
	 * @param autor
	 * @param ejemplares
	 * @param ejemplaresPres
	 */
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPres) {

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}

		if (ejemplares > 0) {

			this.ejemplares = ejemplares;

		}

		if (ejemplaresPres >= 0 && ejemplaresPres <= ejemplares) {

			this.ejemplaresPres = ejemplaresPres;

		}

	}

	/**
	 * 
	 * @param titulo
	 * @param autor
	 * @param ejemplares
	 * @param ejemplaresPres
	 * @param genero
	 */
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPres, String genero) {

		genero = genero.toUpperCase();

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}

		if (ejemplares > 0) {

			this.ejemplares = ejemplares;

		}

		if (ejemplaresPres >= 0 && ejemplaresPres <= ejemplares) {

			this.ejemplaresPres = ejemplaresPres;

		}

		comprobarGenero(genero);

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}

	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {

		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}

	}

	public int getEjemplaresPres() {
		return ejemplaresPres;
	}

	public void setEjemplaresPres(int ejemplaresPres) {

		if (ejemplaresPres >= 0 && ejemplaresPres <= ejemplares) {
			this.ejemplaresPres = ejemplaresPres;
		}
	}

	public GeneroLibro getGenero() {
		return genero;
	}

	public void setGenero(String genero) {

		genero = genero.toUpperCase();

		comprobarGenero(genero);

	}

	public void comprobarGenero(String genero) {

		switch (genero) {

		case "NARRATIVO", "LIRICO", "DRAMATICO", "DIDACTICO", "POETICO" -> {
			this.genero = GeneroLibro.valueOf(genero);
		}

		}

	}

	public boolean prestamo(int numeroPres) {

		boolean sePudo = false;

		if (numeroPres > 0 && numeroPres <= (ejemplares - ejemplaresPres)) {
			this.ejemplaresPres += numeroPres;
			sePudo = true;
		}

		return sePudo;

	}

	public boolean devolucion(int numeroPres) {

		boolean sePudo = false;

		if (numeroPres > 0 && numeroPres <= (ejemplaresPres)) {
			this.ejemplaresPres -= numeroPres;
			sePudo = true;
		}

		return sePudo;

	}

	public String toString() {

		String cadena = "";

		cadena += "Titulo: " + titulo + " - Autor: " + autor + " - Ejemplares: " + ejemplares
				+ " - Ejemplares Prestados: " + ejemplaresPres + " - Genero: " + genero;

		return cadena;

	}

	public boolean equals(Object obj) {

		Libro libro2 = (Libro) obj;

		boolean iguales = false;

		if (this.autor.equalsIgnoreCase(libro2.autor) && this.titulo.equalsIgnoreCase(libro2.titulo)) {

			iguales = true;

		}

		return iguales;

	}

}
