package boletin3.ejercicio6;

public class FuncionesMatematicas {

	static int sumatorio(int numero) {

		int suma = 0;

		if (numero == 1) {

			suma = 1;

		} else {

			suma = +numero + sumatorio(numero - 1);

		}

		return suma;

	}

	static double potencia(double a, int n) {

		double potencia;

		if (n == 1) {
			potencia = 1;
		} else {
			potencia = a * potencia(a, n - 1);
		}

		return potencia;

	}

	static int serieFibonacci(int numero) {

		int resultado;

		if (numero == 1) {

			resultado = 1;

		} else {

			resultado = +numero * serieFibonacci(numero - 1);

		}

		return resultado;

	}

}
