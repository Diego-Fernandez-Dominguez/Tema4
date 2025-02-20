package boletin1.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class Gestimal {

	// Atributo que va a ser la coleccion donde almacenar nuestros objetos
	private Set<Articulo> articulos = new HashSet<Articulo>();

	public void listarArticulos() {
		for (Articulo a : articulos) {
			System.out.println(a);
			System.out.println("-----------------------------");
		}
	}

	public boolean añadeArticulo(Articulo a) {

		return articulos.add(a);

	}

	public Articulo buscaArticulo(String nombre) {

		Articulo a = null;

		for (Articulo aBus : articulos) {
			if (aBus.getNombre().equals(nombre)) {
				a = aBus;
			}

		}

		return a;

	}
	
	public boolean borrarArticulo(Articulo art) {
		return articulos.remove(art);
	}

}
