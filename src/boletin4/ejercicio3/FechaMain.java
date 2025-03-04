package boletin4.ejercicio3;

public class FechaMain {
	public static void main(String[] args) {

		Fecha fe1 = new Fecha(1, 6, 2025);
		Fecha fe2 = new Fecha(29, 2, 2023);
		Fecha fe3 = new Fecha(29, 2, 2024);
		Fecha fe4 = new Fecha(32, 13, 2024);
		Fecha fe5 = new Fecha(31, 11, 2024);
		Fecha fe6 = new Fecha(31, 12, 2024);

		System.out.println("-----------FECHAS---------");
		System.out.println(fe1.toString());
		System.out.println(fe2.toString());
		System.out.println(fe3.toString());
		System.out.println(fe4.toString());
		System.out.println(fe5.toString());

		System.out.println();

		System.out.println("-----------SUMAR 1 DIA---------");

		System.out.println("Antes: " + fe3.toString());
		fe3.diaSiguiente();
		System.out.println("Despues: " + fe3.toString());

		System.out.println("------------------------");

		System.out.println("Antes: " + fe4.toString());
		fe4.diaSiguiente();
		System.out.println("Despues: " + fe4.toString());

		System.out.println("------------------------");

		System.out.println("Antes: " + fe6.toString());
		fe6.diaSiguiente();
		System.out.println("Despues: " + fe6.toString());

	}

}
