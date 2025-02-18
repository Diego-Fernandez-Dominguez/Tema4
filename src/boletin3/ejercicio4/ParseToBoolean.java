package boletin3.ejercicio4;

public class ParseToBoolean {

	static boolean parseToBoolean(int num) {

		boolean bit = false;

		if (num == 0) {
			bit = false;
		} else if (num == 1) {
			bit = true;
		}

		return bit;

	}
	
	static boolean parseToBoolean(String num) {

		boolean bit = false;

		if (num.equalsIgnoreCase("false")) {
			bit = false;
		} else if (num.equalsIgnoreCase("true")) {
			bit = true;
		}

		return bit;

	}

}
