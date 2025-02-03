package boletin1.ejercicio3;

public class PrincipalRectangulo {
	public static void main(String[] args) {

		Rectangulo rec1 = new Rectangulo();
		Rectangulo rec2 = new Rectangulo();

		int largo;
		int alto;

		rec1.x1 = 0;
		rec1.y1 = 0;
		rec1.x2 = 5;
		rec1.y2 = 5;

		rec2.x1 = 7;
		rec2.y1 = 9;
		rec2.x2 = 2;
		rec2.y2 = 3;

		largo = Math.abs(rec1.x1 - rec1.x2);
		alto = Math.abs(rec1.y1 - rec1.y2);

		System.out.println("Rectangulo 1:\n" + rec1.x1 + " " + rec1.y1 + " " + rec1.x2 + " " + rec1.y2);
		System.out.println("Perimetro: " + ((int) (largo + largo + alto + alto)));
		System.out.println("Area: " + largo * alto);

		largo = Math.abs(rec2.x1 - rec2.x2);
		alto = Math.abs(rec2.y1 - rec2.y2);

		System.out.println("\nRectangulo 2:\n" + rec2.x1 + " " + rec2.y1 + " " + rec2.x2 + " " + rec2.y2);
		System.out.println("Perimetro: " + ((int) (largo + largo + alto + alto)));
		System.out.println("Area: " + largo * alto);

		rec1.x1 = 0 + 4;
		rec1.y1 = 0 - 3;
		rec1.x2 = 5 + 2;
		rec1.y2 = 5 + 789;

		rec2.x1 = 7 / 5;
		rec2.y1 = 9 * 5;
		rec2.x2 = 2 - 5;
		rec2.y2 = 3 + 5;

		largo = Math.abs(rec1.x1 - rec1.x2);
		alto = Math.abs(rec1.y1 - rec1.y2);

		System.out.println("Rectangulo 1:\n" + rec1.x1 + " " + rec1.y1 + " " + rec1.x2 + " " + rec1.y2);
		System.out.println("Perimetro: " + ((int) (largo + largo + alto + alto)));
		System.out.println("Area: " + largo * alto);

		largo = Math.abs(rec2.x1 - rec2.x2);
		alto = Math.abs(rec2.y1 - rec2.y2);

		System.out.println("\nRectangulo 2:\n" + rec2.x1 + " " + rec2.y1 + " " + rec2.x2 + " " + rec2.y2);
		System.out.println("Perimetro: " + ((int) (largo + largo + alto + alto)));
		System.out.println("Area: " + largo * alto);

	}

}
