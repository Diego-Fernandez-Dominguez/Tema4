package boletin1.ejercicio1;

public class PrincipalPunto {
	public static void main(String[] args) {

		Punto pun1 = new Punto();
		Punto pun2 = new Punto();
		Punto pun3 = new Punto();

		pun1.x = 5;
		pun1.y = 0;

		pun2.x = 10;
		pun2.y = 10;

		pun3.x = -3;
		pun3.y = 7;

		System.out.println("Punto 1: " + pun1.x + ", " + pun1.y);
		System.out.println("Punto 2: " + pun2.x + ", " + pun2.y);
		System.out.println("Punto 3: " + pun3.x + ", " + pun3.y);
		
		pun1.x = 5-3;
		pun1.y = 0+1;

		pun2.x = 10-3;
		pun2.y = 10+87;

		pun3.x = -3+1;
		pun3.y = 7+453;
		
		System.out.println();

		System.out.println("Punto 1: " + pun1.x + ", " + pun1.y);
		System.out.println("Punto 2: " + pun2.x + ", " + pun2.y);
		System.out.println("Punto 3: " + pun3.x + ", " + pun3.y);

	}

}
