package boletin3.ejercicio3;

public class SumaEnteros {

	static int sumaEnteros(int numero) {

		int suma;

		if (numero == 1) {
			suma = 1;
		} else {
			suma = +numero + sumaEnteros(numero - 1);
		}

		return suma;

	}

	static int sumaEnteros(int numero1, int numero2) {

		int suma;

		if (numero2 == numero1) {
			suma = 0;
		} else {
			suma =+ numero1 + sumaEnteros(numero1 - 1, numero2);
		}

		return suma;

	}

}
