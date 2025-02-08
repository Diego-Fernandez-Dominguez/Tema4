package boletin1.ejercicio4;

public class PrincipalArticulo {
	public static void main(String[] args) {

		Articulo art1 = new Articulo("Zapatos manchados de pintura", 89.99, 3);
		Articulo art2 = new Articulo("Chicle sabor paella valenciana", 2.43, 78);

		System.out.println(art1);

		System.out.println();

		System.out.println(art2);

		art1.setNombre("lo mismo pero le subimos el precio jajajasss");
		art1.setPrecio(art1.getPrecio() + 10.00);
		art1.setCuantosQuedan(art1.getCuantosQuedan() - 1);

		System.out.println();

		System.out.println(art1);

		System.out.println();

		System.out.println(art2);

	}

}
