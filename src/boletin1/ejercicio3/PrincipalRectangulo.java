package boletin1.ejercicio3;

public class PrincipalRectangulo {
	public static void main(String[] args) {

		Rectangulo rec1 = new Rectangulo(0, 0, 5, 5);
		Rectangulo rec2 = new Rectangulo(7, 9, 2, 3);

		int largo;
		int alto;

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

		rec1.x1 += 7;
		rec1.y1 /= 2;
		rec1.x2 += 5;
		rec1.y2 += 789;

		rec2.x1 += 7;
		rec2.y1 += 9;
		rec2.x2 *= 2;
		rec2.y2 -= 3;

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
