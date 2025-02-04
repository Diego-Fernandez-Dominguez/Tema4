package boletin1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String dni;
		String nombre;
		String apellidos;
		int edad;

		String mayor;

		// Persona 1

		System.out.println("Dime el nombre");
		nombre = sc.nextLine();

		System.out.println("Dime los apellidos");
		apellidos = sc.nextLine();

		System.out.println("Dime el dni");
		dni = sc.nextLine();

		System.out.println("Dime la edad");
		edad = sc.nextInt();

		Persona per1 = new Persona(dni, nombre, apellidos, edad);

		// Persona 2

		System.out.println("Dime el nombre");
		nombre = sc.nextLine();

		System.out.println("Dime los apellidos");
		apellidos = sc.nextLine();

		System.out.println("Dime el dni");
		dni = sc.nextLine();

		System.out.println("Dime la edad");
		edad = sc.nextInt();

		Persona per2 = new Persona(dni, nombre, apellidos, edad);

		mayor = per1.edad >= 18 ? "es mayor de edad" : "no es mayor de edad";

		System.out.println(per1.nombre + " " + per1.apellidos + " con DNI " + per1.dni + " " + mayor);

		mayor = per2.edad >= 18 ? "es mayor de edad" : "no es mayor de edad";

		System.out.println(per2.nombre + " " + per2.apellidos + " con DNI " + per2.dni + " " + mayor);

		sc.close();

	}

}
