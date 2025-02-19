package boletin2.ejercicio3;

import java.util.Scanner;

public class PrincipalAlumno {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opc;
		int codigo;

		AlumnoCRUD alumnos =new AlumnoCRUD();
		
		Alumno alum1 = new Alumno("Euseboi Tercero de la Familia", 2.1);
		Alumno alum2 = new Alumno("Daniel Diaz Uña", 9.5);
		Alumno alum3 = new Alumno("Adrian Moreno Montero", 6.7);

		//Menu hecho con do-while y un switch
		
		do {
			menu();
			System.out.println("Elige una opcion");
			opc =sc.nextInt();
			sc.nextLine();
			
			switch (opc) {
			
			}
			
		}while(opc!=5);
		
		alumnos.listarAlumnos();
		
	}

	static void menu() {
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}

}
