package boletin2.ejercicio4;

import java.util.Scanner;

public class PrincipalPizza {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String opc = "";

		int codigo;

		Pizza pizza;

		PizzaCRUD pizzas = new PizzaCRUD();

		Pizza piz1 = new Pizza(2541, "", "Funghi");
		Pizza piz2 = new Pizza(7421, "fAMILIAR", "");
		Pizza piz3 = new Pizza(10890, "Mediana", "cuatROqUESOS");

		PizzaCRUD.añadePizza(piz1);
		PizzaCRUD.añadePizza(piz2);
		PizzaCRUD.añadePizza(piz3);

		do {

			menu();
			System.out.println("Eliga una opcion");
			opc = sc.nextLine();

			switch (opc) {

			case "a" -> pizzas.listarPizzas();
			case "b" -> {

				pizza = creaPizza();
				if (PizzaCRUD.añadePizza(pizza)) {
					System.out.println("Pizza creada");
				} else {
					System.out.println("La pizza ya existia");
				}

			}

			case "c" -> {

				System.out.println("Digame el codigo");
				codigo = sc.nextInt();

				if (PizzaCRUD.modificarEstado(codigo)) {
					System.out.println("Modificada correctamente");
				} else {
					System.out.println("La pizza no existe");
				}

			}

			case "d" -> {
				System.out.println("Saliendo del programa...");
			}
			default -> System.out.println("Opcion no valida");
			}

		} while (!opc.equals("d"));

	}

	static void menu() {
		System.out.println("a. Listado de pizzas");
		System.out.println("b. Nuevo pedido");
		System.out.println("c. Pizza servida");
		System.out.println("d. Salir");
	}

	static Pizza creaPizza() {

		int codigo;

		String tamaño;

		String tipo;

		Pizza pi;

		System.out.println("Cual es el codigo de la pizza");
		codigo = sc.nextInt();

		System.out.println("De que tamaño es la pizza");
		tamaño = sc.nextLine();

		System.out.println("De que tipo es la pizza");
		tipo = sc.nextLine();

		pi = new Pizza(codigo, tamaño, tipo);

		return pi;
	}

}
