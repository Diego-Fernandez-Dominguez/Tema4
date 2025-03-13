package examen2324;

public class Empleado {

	private String dni;

	private String nombre;

	private double sueldoBase;

	private int horasExtras;

	private static double importeHorasExtras = 25;

	public Empleado(String dni) {

		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

	}

	public Empleado(String dni, String nombre, double sueldoBase, int horasExtras) {

		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (sueldoBase > 0) {
			this.sueldoBase = sueldoBase;
		}

		if (horasExtras > 0) {
			this.horasExtras = horasExtras;
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

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		if (sueldoBase > 0) {
			this.sueldoBase = sueldoBase;
		}

	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		if (horasExtras > 0) {
			this.horasExtras = horasExtras;
		}
	}

	public String getDni() {
		return dni;
	}

	public static double getImporteHorasExtras() {
		return importeHorasExtras;
	}

	public double calcularComplemento() {
		return horasExtras * importeHorasExtras;
	}

	public double sueldoBruto() {

		return sueldoBase + this.calcularComplemento();

	}

	public static void setImporteHorasExtras(double importe) {

		if (importe > 0) {
			importeHorasExtras = importe;
		}

	}

	@Override
	public String toString() {

		return this.dni + " " + this.nombre + "\nHoras Extras: " + this.horasExtras + "\nSueldo Bruto: "
				+ this.sueldoBruto();

	}

	@Override
	public boolean equals(Object o) {

		boolean sonIguales = false;

		Empleado emp1 = (Empleado) o;

		if (this.dni.equals(emp1.getDni())) {

			sonIguales = true;

		}

		return sonIguales;

	}

}
