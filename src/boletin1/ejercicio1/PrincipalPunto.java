package boletin1.ejercicio1;

public class PrincipalPunto {
	public static void main(String[] args) {

		Punto pun1 = new Punto(5, 0);
		Punto pun2 = new Punto(10, 10);
		Punto pun3 = new Punto(-3, 7);

		System.out.println("Punto 1: " + pun1);
		System.out.println("Punto 2: " + pun2);
		System.out.println("Punto 3: " + pun3);

		System.out.println();
		
		pun1.setXY(4, 8);

		pun1.desplaza(4, 1);
		pun2.desplaza(3, 3);
		pun3.desplaza(6, 78);

		System.out.println("Punto 1: " + pun1);
		System.out.println("Punto 2: " + pun2);
		System.out.println("Punto 3: " + pun3);

		System.out.println();
		System.out.println(pun1.distancia(pun2));

	}

}
