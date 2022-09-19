package project;

import java.util.Scanner;

public class ejercicio8Gasolina {
	public static void main(String[] ar) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Por favor introduzca el kilometraje original: ");
			Double kilometrajeoriginal = teclado.nextDouble();
			teclado.nextLine();
			System.out.println("Por favor introduzca el kilometraje actual: ");
			Double kilometrajeactual = teclado.nextDouble();
			teclado.nextLine();
			System.out.println("Por favor introduzca el repostaje original: ");
			Double repostajeoriginal = teclado.nextDouble();
			teclado.nextLine();
			System.out.println("Por favor introduzca el repostaje actual: ");
			Double repostajeactual = teclado.nextDouble();
			teclado.nextLine();
			Double kilometrajerecorrido = kilometrajeoriginal - kilometrajeactual;
			Double repostajeusado = repostajeoriginal - repostajeactual;
			System.out.println("Kilometraje recorrido: " + kilometrajerecorrido + " kilometros");
			System.out.println("Gasolina gastada: " + repostajeusado + " litros");
			Double consumomedio = (repostajeusado * 100) / kilometrajerecorrido;
			System.out.println("Consumo medio cada 100 km: " + consumomedio + " litros");
		}
	}
}