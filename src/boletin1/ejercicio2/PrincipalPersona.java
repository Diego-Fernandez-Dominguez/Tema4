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

		mayor = per1.getEdad() >= 18 ? "es mayor de edad" : "no es mayor de edad";

		System.out.println(per1.getNombre() + " " + per1.getApellidos() + " con DNI " + per1.getDni() + " " + mayor);

		mayor = per2.getEdad() >= 18 ? "es mayor de edad" : "no es mayor de edad";

		System.out.println(per2.getNombre() + " " + per2.getApellidos() + " con DNI " + per2.getDni() + " " + mayor);

		per1.setEdad(edad+1);
		System.out.println(per1.getNombre() + " " + per1.getApellidos() + " con DNI " + per1.getDni() + " " + mayor);
		
		sc.close();

	}

}
