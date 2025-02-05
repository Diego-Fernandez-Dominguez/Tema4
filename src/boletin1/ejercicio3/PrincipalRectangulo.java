package boletin1.ejercicio3;

public class PrincipalRectangulo {
	public static void main(String[] args) {

		Rectangulo rec1 = new Rectangulo(0, 0, 5, 5);
		Rectangulo rec2 = new Rectangulo(7, 9, 2, 3);

		int largo;
		int alto;

		largo = Math.abs(rec1.getX1() - rec1.getX2());
		alto = Math.abs(rec1.getY1() - rec1.getY2());

		System.out.println(
				"Rectangulo 1:\n" + rec1.getX1() + " " + rec1.getY1() + " " + rec1.getX2() + " " + rec1.getY2());
		System.out.println("Perimetro: " + ((int) (largo + largo + alto + alto)));
		System.out.println("Area: " + largo * alto);

		largo = Math.abs(rec2.getX1() - rec2.getX2());
		alto = Math.abs(rec2.getY1() - rec2.getY2());

		System.out.println(
				"\nRectangulo 2:\n" + rec2.getX1() + " " + rec2.getY1() + " " + rec2.getX2() + " " + rec2.getY2());
		System.out.println("Perimetro: " + ((int) (largo + largo + alto + alto)));
		System.out.println("Area: " + largo * alto);

		rec1.setX1(rec1.getX1() + 7);
		rec1.setY1(rec1.getY1() / 2);
		rec1.setX2(rec1.getX2() + 5);
		rec1.setY2(rec1.getY2() + 789);

		rec2.setX1(rec1.getX1() + 7);
		rec2.setY1(rec1.getY1() + 9);
		rec2.setX2(rec1.getX2() * 2);
		rec2.setY2(rec1.getY2() - 3);

		largo = Math.abs(rec1.getX1() - rec1.getX2());
		alto = Math.abs(rec1.getY1() - rec1.getY2());

		System.out.println(
				"Rectangulo 1:\n" + rec1.getX1() + " " + rec1.getY1() + " " + rec1.getX2() + " " + rec1.getY2());
		System.out.println("Perimetro: " + ((int) (largo + largo + alto + alto)));
		System.out.println("Area: " + largo * alto);

		largo = Math.abs(rec2.getX1() - rec2.getX2());
		alto = Math.abs(rec2.getY1() - rec2.getY2());

		System.out.println(
				"\nRectangulo 2:\n" + rec2.getX1() + " " + rec2.getY1() + " " + rec2.getX2() + " " + rec2.getY2());
		System.out.println("Perimetro: " + ((int) (largo + largo + alto + alto)));
		System.out.println("Area: " + largo * alto);

	}

}
