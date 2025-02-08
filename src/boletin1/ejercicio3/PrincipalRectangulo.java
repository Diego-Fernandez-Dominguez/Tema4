package boletin1.ejercicio3;

public class PrincipalRectangulo {
	public static void main(String[] args) {

		Rectangulo rec1 = new Rectangulo(0, 0, 5, 5);
		Rectangulo rec2 = new Rectangulo(7, 9, 2, 3);

		System.out.println(rec1);

		System.out.println("Perimero rectangulo 1: " + rec1.getPerimetro());
		System.out.println("Area rectangulo 1: " + rec1.getArea());

		System.out.println();

		System.out.println(rec2);
		System.out.println("Perimero rectangulo 2: " + rec2.getPerimetro());
		System.out.println("Area rectangulo 2: " + rec2.getArea());

		rec1.setX1Y1(5, 7);
		rec1.setX2Y2(9, 10);

		rec2.setAll(8, 3, 0, 100);

		System.out.println();

		System.out.println(rec1);

		System.out.println("Perimero rectangulo 1: " + rec1.getPerimetro());
		System.out.println("Area rectangulo 1: " + rec1.getArea());

		System.out.println();

		System.out.println(rec2);
		System.out.println("Perimero rectangulo 2: " + rec2.getPerimetro());
		System.out.println("Area rectangulo 2: " + rec2.getArea());
		
	}

}
