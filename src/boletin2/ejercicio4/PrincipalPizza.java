package boletin2.ejercicio4;

public class PrincipalPizza {
	public static void main(String[] args) {

		Pizza pizza1 = new Pizza(2541, "", "Funghi");
		Pizza pizza2 = new Pizza(7421, "fAMILIAR", "");
		Pizza pizza3 = new Pizza(10890, "Mediana", "cuatROqUESOS");

		System.out.println(pizza1);
		System.out.println(pizza2);
		System.out.println(pizza3);

		System.out.println();
		System.out.println("Dos entregas despues...");
		System.out.println();

		pizza2.setEstado("SERVIDA");
		pizza3.setEstado("SERVIDA");

		System.out.println(pizza2);
		System.out.println(pizza3);

		System.out.println();

		if (pizza1.equals(pizza3)) {
			System.out.println("Son la misma pizza =^o");
		} else {
			System.out.println("No son la misma pizza =^o");

		}

	}

}
