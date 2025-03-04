package boletin4.ejercicio2;

public class ContadorPrincipal {
	public static void main(String[] args) {

		Contador cont1 = new Contador(4);
		Contador cont2 = new Contador(1);
		Contador cont3 = new Contador(0);

		cont1.incrementar();
		cont2.decrementar();
		cont3.decrementar();

		System.out.println("---------------------");

		System.out.println(cont1.toString());
		System.out.println(cont2.toString());
		System.out.println(cont3.toString());

		System.out.println("---------------------");

		System.out.println(cont2.equals(cont1));
		System.out.println(cont2.equals(cont3));

	}

}
