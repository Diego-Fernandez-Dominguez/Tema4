package boletin2.ejercicio3;

public class Alumno {

	private String nombre = "Desconocido";

	private double media = 0.0;

	public Alumno(String nombre, double media) {

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (media >= 0 && media <= 10) {
			this.media = media;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		if (media >= 0 && media <= 10) {
			this.media = media;
		}

	}

	@Override
	public String toString() {

		String cadena = "";

		cadena += "Nombre: " + nombre + " - Media: " + media;

		return cadena;
	}

	//@Override
	/*public boolean equals(Object obj) {

		Alumno alum2 = (Alumno) obj;
		
		boolean iguales;
		
		if(this.nombre.equalsIgnoreCase(alum2.nombre)) {
			
		}

	}*/

}
