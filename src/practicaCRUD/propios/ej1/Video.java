package practicaCRUD.propios.ej1;

import java.util.Objects;

public class Video {

	private int codigo = 0;

	private String nombre = "Desconocido";

	private String desarrolladora = "Desconocido";

	private TipoVideo tipo = TipoVideo.SANDBOX;

	enum TipoVideo {
		SANDBOX, FPS, RPG, MOBA
	}

	public Video(int codigo, String nombre, String desarroladora, String tipo) {

		if (codigo > 0) {
			this.codigo = codigo;
		}

		if (nombre != null) {
			this.nombre = nombre;
		}

		if (desarrolladora != null) {
			this.nombre = nombre;
		}

		comprobarTipo(tipo);

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDesarrolladora() {
		return desarrolladora;
	}

	public void setDesarrolladora(String desarrolladora) {
		this.desarrolladora = desarrolladora;
	}

	public TipoVideo getTipo() {
		return tipo;
	}

	/**
	 * CAMBIAR TIPO
	 * 
	 * @param tipo
	 */
	public void setTipo(TipoVideo tipo) {
		this.tipo = tipo;
	}

	/**
	 * 
	 * @param tipo
	 */
	private void comprobarTipo(String tipo) {

		switch (tipo) {
		case "SANDBOX", "FPS", "RPG", "MOBA" -> {
			this.tipo = TipoVideo.valueOf(tipo);
		}
		}

	}

	@Override
	public String toString() {
		return codigo + " " + nombre + " - " + desarrolladora + " - " + tipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		return codigo == other.codigo && Objects.equals(desarrolladora, other.desarrolladora)
				&& Objects.equals(nombre, other.nombre) && tipo == other.tipo;
	}
	
	
	

}
