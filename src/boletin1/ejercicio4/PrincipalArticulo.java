package boletin1.ejercicio4;

public class PrincipalArticulo {
	public static void main(String[] args) {

		Articulo art1 = new Articulo();

		art1.nombre = "Zapatos manchados de pintura";
		art1.precio = 89.99;
		art1.cuantosQuedan = 3;

		System.out.println(art1.nombre + " - Precio:" + art1.precio + "€ - IVA:" + (int) (art1.IVA * 100) + " - PVP:"
				+ art1.precio * art1.IVA + "€ - Stock:" + art1.cuantosQuedan + " unidades");

	}

}
