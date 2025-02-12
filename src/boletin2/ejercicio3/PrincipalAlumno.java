package boletin2.ejercicio3;

public class PrincipalAlumno {
	public static void main(String[] args) {

		Alumno alum1 = new Alumno("Euseboi Tercero de la Familia", 2.1);
		Alumno alum2 = new Alumno("Daniel Diaz Uña", 9.5);
		Alumno alum3 = new Alumno("Adrian Moreno Montero", 6.7);

		System.out.println(alum1);
		System.out.println(alum2);
		System.out.println(alum3);

		System.out.println();
		System.out.println("La profesora reviso el examen y cambio las notas (mas bien dicho, una nota):");
		System.out.println();

		alum3.setMedia(4.9);
		System.out.println(alum3);

		if (alum1.equals(alum2)) {
			System.out.println("Son la misma persona =^o");
		} else {
			System.out.println("No son la misma persona =^(");
		}

	}

}
