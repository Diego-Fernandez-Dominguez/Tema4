package practicaCRUD.bol4.ejercicio1;

import java.util.Scanner;

public class MainHora {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		Hora horita;

		int opc = 0;

		Hora hora1 = new Hora(1, 2, 3);
		Hora hora2 = new Hora(17, 29, 67);
		Hora hora3 = new Hora(154, 287, 389);
		Hora hora4 = new Hora(154, 287, 389);
		Hora hora5 = new Hora(1, 4, 59);
		Hora hora6 = new Hora(1, 59, 59);
		Hora hora7 = new Hora(23, 59, 59);

		HoraCRUD.anyadeHora(hora1);
		HoraCRUD.anyadeHora(hora2);
		HoraCRUD.anyadeHora(hora3);
		HoraCRUD.anyadeHora(hora4);
		HoraCRUD.anyadeHora(hora5);
		HoraCRUD.anyadeHora(hora6);
		HoraCRUD.anyadeHora(hora7);

		do {

			menu();
			System.out.println("Introduzca una opcion");
			opc = reader.nextInt();
			reader.nextLine();

			switch (opc) {
			case 1 -> {
				
				//Llamada a la funcion que va a sacar por pantalla la lista de horas
				HoraCRUD.listarHoras();
			}
			case 2 -> {

				horita = pedirDatos();

				HoraCRUD.anyadeHora(horita);
			}
			case 3 -> {
				horita = pedirDatos();

				if (HoraCRUD.incremenarSeg(horita)) {
					System.out.println("Se le aumento 1 segundo a la hora");
				} else {
					System.out.println("No se encontro la hora");
				}

			}
			case 4 -> {
				horita = pedirDatos();
				if (HoraCRUD.eliminarHora(horita)) {
					System.out.println("Se pudo eliminar la hora");
				} else {
					System.out.println("No se encontro la hora");
				}
			}
			case 5 -> {
				System.out.println("Saliendo de las horitas...");
			}
			}

		} while (opc != 5);

	}

	// Menu que se va a sacar por pantalla
	static void menu() {

		System.out.println("1. Listar");
		System.out.println("2. Anyadir");
		System.out.println("3. Sumarle 1");
		System.out.println("4. Borrar");
		System.out.println("5. Adioh");

	}

	// Metodo que va a pedir los datos al usuario y va a crear un objeto hora a
	// partir de esos datos
	static Hora pedirDatos() {

		int hora;
		int minuto;
		int segundo;

		System.out.println("Dime la hora");
		hora = reader.nextInt();

		System.out.println("Dime los minutos");
		minuto = reader.nextInt();

		System.out.println("Dime los segundos");
		segundo = reader.nextInt();

		Hora h = new Hora(hora, minuto, segundo);

		return h;

	}

}
