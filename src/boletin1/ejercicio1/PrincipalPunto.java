package boletin1.ejercicio1;

public class PrincipalPunto {
	public static void main(String[] args) {

		Punto pun1 = new Punto(5, 0);
		Punto pun2 = new Punto(10, 10);
		Punto pun3 = new Punto(-3, 7);

		System.out.println("Punto 1: " + pun1.getX() + ", " + pun1.getY());
		System.out.println("Punto 2: " + pun2.getX() + ", " + pun2.getY());
		System.out.println("Punto 3: " + pun3.getX() + ", " + pun3.getY());

		System.out.println();

		pun1.setX(pun1.getX() + 4);
		pun2.setX(pun2.getX() + 4);
		pun3.setX(pun3.getX() + 4);

		pun1.setY(pun1.getY() + 1);
		pun2.setY(pun2.getY() + 1);
		pun3.setY(pun3.getY() + 1);

		System.out.println("Punto 1: " + pun1.getX() + ", " + pun1.getY());
		System.out.println("Punto 2: " + pun2.getX() + ", " + pun2.getY());
		System.out.println("Punto 3: " + pun3.getX() + ", " + pun3.getY());

	}

}
