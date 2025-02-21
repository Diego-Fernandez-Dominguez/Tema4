package boletin2.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class PizzaCRUD {

	private static Set<Pizza> pizzas = new HashSet<Pizza>();

	public void listarPizzas() {

		for (Pizza p : pizzas) {
			System.out.println(p);
			System.out.println("-------------------------");
		}

	}

	public static boolean añadePizza(Pizza p) {

		return pizzas.add(p);

	}

	public static Pizza buscarPizza(int codigo) {

		Pizza p = null;

		for (Pizza pBusqueda : pizzas) {
			if (pBusqueda.getCodigo() == codigo) {
				p = pBusqueda;
			}
		}

		return p;

	}

	public static boolean modificarEstado(int codigo) {

		boolean res = false;

		Pizza p = buscarPizza(codigo);
		if (p != null) {
			p.setEstado("SERVIDA");
			res = true;
		}

		return res;
	}

}
