package practicaCRUD.bol4.ejercicio2;

import java.util.Scanner;

public class ContadorPrincipal {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int opc = 0;

		int cambio = 0;

		Contador conti;

		Contador cont1 = new Contador(4);
		Contador cont2 = new Contador(1);
		Contador cont3 = new Contador(0);
		Contador cont4 = new Contador(0);

		ContadorCRUD.anyadirCont(cont4);
		ContadorCRUD.anyadirCont(cont3);
		ContadorCRUD.anyadirCont(cont2);
		ContadorCRUD.anyadirCont(cont1);

		do {

			menu();
			System.out.println("Eliga una opcion");
			opc = reader.nextInt();
			reader.nextLine();

			switch (opc) {
			case 1 -> {
				ContadorCRUD.listarContadores();
			}
			case 2 -> {
				conti = pedirCont();
				ContadorCRUD.anyadirCont(conti);
			}
			case 3 -> {

				conti = pedirCont();
				if (ContadorCRUD.incrementar(conti)) {
					System.out.println("Se incremento el contador");
				} else {
					System.out.println("No se encontro el contador");
				}

			}
			case 4 -> {
				conti = pedirCont();
				if (ContadorCRUD.decrementar(conti)) {
					System.out.println("Se decremento el contador");
				} else {
					System.out.println("No se encontro el contador");
				}
			}
			case 5 -> {
				conti = pedirCont();
				if (ContadorCRUD.eliminarCont(conti)) {
					System.out.println("Se elimino el contador");
				} else {
					System.out.println("No se encontro el contador");
				}

			}
			case 6 -> {
				conti = pedirCont();
				if (ContadorCRUD.modificar(conti, cambio)) {
					System.out.println("Se modifico el contador");
				} else {
					System.out.println("No se encontro el contador");
				}

			}
			case 7 -> {
				System.out.println("Chao caracol");
			}
			}

		} while (opc != 7);

	}

	static void menu() {

		System.out.println("1. Listar");
		System.out.println("2. Anyadir");
		System.out.println("3. Incrementar");
		System.out.println("4. Decrementar");
		System.out.println("5. Borrar");
		System.out.println("6. Modificar");
		System.out.println("7. Adioh");

	}

	static Contador pedirCont() {

		int contador;

		Contador cont = new Contador(0);

		System.out.println("Digame el contador");

		contador = reader.nextInt();

		cont.setCont(contador);

		return cont;
	}

}
