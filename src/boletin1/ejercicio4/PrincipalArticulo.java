package boletin1.ejercicio4;

public class PrincipalArticulo {
	public static void main(String[] args) {

		Articulo art1 = new Articulo("Zapatos manchados de pintura", 89.99, 3);
		Articulo art2 = new Articulo("Chicle sabor paella valenciana", 2.43, 78);

		System.out.println(art1.nombre + " - Precio:" + art1.precio + "€ - IVA:" + (int) (art1.IVA * 100) + " - PVP:"
				+ ((art1.precio * art1.IVA) + art1.precio) + "€ - Stock:" + art1.cuantosQuedan + " unidades");

		System.out.println(art2.nombre + " - Precio:" + art2.precio + "€ - IVA:" + (int) (art2.IVA * 100) + " - PVP:"
				+ ((art2.precio * art2.IVA) + art2.precio) + "€ - Stock:" + art2.cuantosQuedan + " unidades");

	}

}
