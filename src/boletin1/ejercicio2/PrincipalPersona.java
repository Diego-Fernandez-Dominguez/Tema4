package boletin1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String dni;
		String nombre;
		String apellidos;
		int edad;

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

		per1.esMayorEdad();
		per1.esJubilado();

		System.out.println(per1);

		per2.esMayorEdad();
		per2.esJubilado();

		System.out.println(per2);

		System.out.println(per1.diferenciaEdad(per2));

		sc.close();

	}

}
