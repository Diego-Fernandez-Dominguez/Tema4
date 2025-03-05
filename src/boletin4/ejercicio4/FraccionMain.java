package boletin4.ejercicio4;

public class FraccionMain {
	public static void main(String[] args) {

		Fraccion fr1 = new Fraccion(1, 2);
		Fraccion fr2 = new Fraccion(1, 3);

		System.out.println("Fracción 1: " + fr1);
		System.out.println("Fracción 2: " + fr2);

		Fraccion suma = fr1.sumar(fr2);
		System.out.println("Suma: " + suma);

		Fraccion resta = fr1.resta(fr2);
		System.out.println("Resta: " + resta);

		Fraccion multiplicacion = fr1.multiplica(fr2);
		System.out.println("Multiplicación: " + multiplicacion);

		Fraccion division = fr1.division(fr2);
		System.out.println("División: " + division);

	}

}
