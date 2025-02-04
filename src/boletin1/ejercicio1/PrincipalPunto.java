package boletin1.ejercicio1;

public class PrincipalPunto {
	public static void main(String[] args) {

		Punto pun1 = new Punto(5, 0);
		Punto pun2 = new Punto(10, 10);
		Punto pun3 = new Punto(-3, 7);

		System.out.println("Punto 1: " + pun1.x + ", " + pun1.y);
		System.out.println("Punto 2: " + pun2.x + ", " + pun2.y);
		System.out.println("Punto 3: " + pun3.x + ", " + pun3.y);

		System.out.println();

		pun1.x = pun1.x + 4;
		pun2.x = pun2.x + 2;
		pun3.x = pun3.x + 9;

		pun1.y = pun1.y + 1;
		pun2.y = pun2.y - 4;
		pun3.y = pun3.y * 6;

		System.out.println("Punto 1: " + pun1.x + ", " + pun1.y);
		System.out.println("Punto 2: " + pun2.x + ", " + pun2.y);
		System.out.println("Punto 3: " + pun3.x + ", " + pun3.y);

	}

}
