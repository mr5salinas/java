package project;

import java.util.Scanner;

public class introducirDatos {
	public static void main(String[] ar) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Por favor introduzca su nombre: ");
			String name = teclado.nextLine();
			// Introduzco datos por medio de consola para ser usados en distintas
			// operaciones
			System.out.println("Por favor introduzca el primer plato:");
			String primerplato = teclado.nextLine();
			// 			Double preciopplato = teclado.nextDouble();teclado.nextLine(); es una posibilidad de introducir datos si me da error
			// Y también vale Double preciopplato = teclado.next();
			System.out.println("Introduzca el precio del primer plato:");
			Double preciopplato = teclado.nextDouble();teclado.nextLine();

			System.out.println("Por favor introduzca el segundo plato:");
			String segundoplato = teclado.nextLine();

			System.out.println("Introduzca el precio del segundo plato:");
			Double preciosplato = teclado.nextDouble();teclado.nextLine();

			System.out.println("Por favor introduzca el tercer plato:");
			String tercerplato = teclado.nextLine();

			System.out.println("Introduzca el precio del tercer plato:");
			Double preciotplato = teclado.nextDouble();teclado.nextLine();

			System.out.println("Nombre del cliente: " + name);
			System.out.println("---------------------------------------------------");
			System.out.println("Primer plato:");
			System.out.println(primerplato + " -> " + preciopplato + " euros");
			System.out.println(" ");
			System.out.println("Segundo plato:");
			System.out.println(segundoplato + " -> " + preciosplato + " euros");
			System.out.println(" ");
			System.out.println("Tercer plato:");
			System.out.println(tercerplato + " -> " + preciotplato + " euros");
			System.out.println("---------------------------------------------------");
			Double preciosiniva = (preciopplato + preciosplato + preciotplato);
			System.out.println("Precio comida: " + preciosiniva + " euros");
			Double iva = (preciosiniva * 0.21);
			System.out.println("Iva (21%): " + iva + " euros");
			System.out.println("---------------------------------------------------");
			Double precioconiva = (preciosiniva + iva);
			System.out.println("Total: " + precioconiva + " euros");
		}
	}
}
