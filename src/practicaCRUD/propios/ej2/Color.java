package practicaCRUD.propios.ej2;

public class Color {

	private String color = "Blanco";

	private String objeto = "Peluche";

	public Color(String color, String objeto) {

		if(color!=null && !color.isBlank()) {
			this.color=color;
		}
		
		if(objeto!=null && !color.isBlank()) {
			this.color=objeto;
		}
		
	}

}
