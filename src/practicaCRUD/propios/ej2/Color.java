package practicaCRUD.propios.ej2;

public class Color {

	private String color = "Blanco";

	private String objeto = "Peluche";

	public Color(String color, String objeto) {

		if (color != null && !color.isBlank()) {
			this.color = color;
		}

		if (objeto != null && !objeto.isBlank()) {
			this.objeto = objeto;
		}

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		if (objeto != null && !objeto.isBlank()) {
			this.objeto = objeto;
		}
	}

	@Override
	public boolean equals(Object obj) {

		Color col = (Color) obj;

		boolean igu = false;

		if (this.color.equals(col.color) && this.objeto.equals(col.objeto)) {
			igu = true;
		}

		return igu;

	}

	@Override
	public String toString() {
		return color + " " + objeto;
	}

}
