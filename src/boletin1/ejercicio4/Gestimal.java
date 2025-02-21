package boletin1.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class Gestimal {

	// Atributo que va a ser la coleccion donde almacenar nuestros objetos
	private static Set<Articulo> articulos = new HashSet<Articulo>();

	public static void listarArticulos() {
		for (Articulo a : articulos) {
			System.out.println(a);
			System.out.println("-----------------------------");
		}
	}

	public static boolean añadeArticulo(Articulo a) {

		return articulos.add(a);

	}

	public static Articulo buscaArticulo(String nombre) {

		Articulo a = null;

		for (Articulo aBus : articulos) {
			if (aBus.getNombre().equals(nombre)) {
				a = aBus;
			}

		}

		return a;

	}

	public static boolean borrarArticulo(Articulo art) {
		return articulos.remove(art);
	}

	public static boolean modificarDatos(String nombre, double precio) {

		boolean sePudo = false;

		Articulo a = buscaArticulo(nombre);
		if (a != null) {
			a.setPrecio(precio);
			sePudo = true;
		}

		return sePudo;

	}

	public static boolean entradaMercancia(String nombre, int cantidad) {
		boolean sePudo = false;

		Articulo a = buscaArticulo(nombre);
		if (a != null) {
			a.almacenar(cantidad);
			sePudo = true;
		}

		return sePudo;
	}

	public static boolean salidaMercancia(String nombre, int cantidad) {
		boolean sePudo = false;

		Articulo a = buscaArticulo(nombre);
		if (a != null) {
			a.vendar(cantidad);
			sePudo = true;
		}

		return sePudo;
	}

}
