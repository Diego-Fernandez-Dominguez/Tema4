package boletin3.ejercicio5;

import java.util.Random;

public class NumerosAleatorios {

	static String numerosAleatorios(int numGenerar) {

		Random rand = new Random();

		String cadena = "";

		int numerin;

		for (int i = 0; i < numGenerar; i++) {

			numerin = rand.nextInt(0, 2);

			cadena = cadena + numerin + " ";
		}

		return cadena;

	}

	static String numerosAleatorios(int numGenerar, int numMax) {

		Random rand = new Random();

		String cadena = "";

		int numerin;

		for (int i = 0; i < numGenerar; i++) {

			numerin = rand.nextInt(0, numMax + 1);

			cadena = cadena + numerin + " ";
		}

		return cadena;

	}

	static String numerosAleatorios(int numGenerar, int numMin, int numMax) {

		Random rand = new Random();

		String cadena = "";

		int numerin;

		for (int i = 0; i < numGenerar; i++) {

			numerin = rand.nextInt(numMin, numMax + 1);

			cadena = cadena + numerin + " ";
		}

		return cadena;

	}

}
