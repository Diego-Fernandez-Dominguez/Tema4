package boletin1.ejercicio2;

import java.util.Scanner;


public class PrincipalPersona {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Persona per1 = new Persona();
		Persona per2 = new Persona();

		String mayor;

		// Persona 1

		System.out.println("Dime el nombre");
		per1.nombre = sc.nextLine();

		System.out.println("Dime los apellidos");
		per1.apellidos = sc.nextLine();

		System.out.println("Dime el dni");
		per1.dni = sc.nextLine();

		System.out.println("Dime la edad");
		per1.edad = sc.nextInt();

		// Persona 2

		System.out.println("Dime el nombre");
		per2.nombre = sc.nextLine();

		System.out.println("Dime los apellidos");
		per2.apellidos = sc.nextLine();

		System.out.println("Dime el dni");
		per2.dni = sc.nextLine();

		System.out.println("Dime la edad");
		per2.edad = sc.nextInt();

		mayor = per1.edad >= 18 ? "es mayor de edad" : "no es mayor de edad";

		System.out.println(per1.nombre + " " + per1.apellidos + " con DNI " + per1.dni + " " + mayor);

		mayor = per2.edad >= 18 ? "es mayor de edad" : "no es mayor de edad";

		System.out.println(per2.nombre + " " + per2.apellidos + " con DNI " + per2.dni + " " + mayor);

		sc.close();

	}

}
