package boletin4.ejercicio1;

public class MainHora {
	public static void main(String[] args) {

		Hora hora1 = new Hora(1, 2, 3);
		Hora hora2 = new Hora(17, 29, 67);
		Hora hora3 = new Hora(154, 287, 389);
		Hora hora4 = new Hora(154, 287, 389);
		Hora hora5 = new Hora(1, 4, 59);
		Hora hora6 = new Hora(1, 59, 59);
		Hora hora7 = new Hora(23, 59, 59);

		System.out.println(hora1.toString());
		System.out.println(hora2.toString());
		System.out.println(hora3.toString());

		System.out.println("--------------------");

		System.out.println(hora1.equals(hora4));
		System.out.println(hora3.equals(hora4));

		System.out.println("-----------------------------");
		
		hora5.incrementarSegundo();
		hora6.incrementarSegundo();
		hora7.incrementarSegundo();

		System.out.println(hora5.toString());
		System.out.println(hora6.toString());
		System.out.println(hora7.toString());

	}

}
