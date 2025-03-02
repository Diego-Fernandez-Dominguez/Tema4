package boletin4.ejercicio4;

public class Disco {

	private int codigo = 0;

	private String autor = "Desconocido";

	private int duracion = 120;

	private GeneroDisco genero = GeneroDisco.ROCK;

	enum GeneroDisco {
		ROCK, POP, JAZZ, BLUES
	}

	public Disco(int codigo, String autor, int duracion, String genero) {

		if (codigo >= 0) {
			this.codigo = codigo;
		}

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}

		if (duracion > 0) {
			this.duracion = duracion;
		}
		comprobarGenero(genero.toUpperCase());

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo >= 0) {
			this.codigo = codigo;
		}
	}

	//

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
	}

	//

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		if (duracion > 0) {
			this.duracion = duracion;
		}
	}

	//

	public GeneroDisco getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		genero = genero.toUpperCase();
		comprobarGenero(genero);
	}

	public void comprobarGenero(String genero) {

		switch (genero) {

		case "ROCK", "POP", "JAZZ", "BLUES" -> {
			this.genero = GeneroDisco.valueOf(genero);
		}

		}

	}
	
	@Override
	public String toString() {

		String cadena = "";

		cadena += codigo + " " + autor + " " + duracion + " " + genero;

		return cadena;
	}
}
