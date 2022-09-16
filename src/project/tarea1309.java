package project;

public class tarea1309 {
	// Sacar el cuadrado de un número
	public static void main(String[] args) {

		// Aquí hago la potencia de un número a 2
		double x = 8;
		double y = Math.pow(x, 2);
		// Double es una variable para declarar números
		System.out.println(x + " elevado al cuadrado es " + y);

		// Aquí paso kilómetros a millas marinas
		double millasaconvertir = 3.5f;
		double resultado = millasaconvertir * 1.85199932587;
		System.out
				.println("El resultado de convertir " + millasaconvertir + " millas marinas a kilometros " + resultado);

		// Paso grados centigrados a celsius
		float centigrados = 1;
		float kelvin = 273.15f;
		// Con f puedo declarar decimales
		float centigradosakelvin = centigrados + kelvin;
		System.out.println("El resultado de sumar " + centigrados + " con grados kelvin (" + kelvin + ") es "
				+ centigradosakelvin);
		// Paso grados centigrados a fahrenheit
		float centigrados0 = 1;
		float tresdos = 32;
		float procesoafahrenheit = (float) ((centigrados0 * 9.0 / 5.0) + tresdos);
		System.out.println("El resultado de pasar grados centigrados a fahrenheit es " + procesoafahrenheit);
		// En caso de que quiera redondear el número, por ejemplo, usaría
		// Math.round(procesoafahrenheit)

		// Declaro las variables 10 y 3 como a y b
		int a = 10;
		int b = 3;
		int suma = a + b;
		int resta = a - b;
		int multiplicacion = a * b;
		int division = a / b;
		int restodivision = a % b;
		System.out.println("La suma es " + suma + " la resta es " + resta + " la multiplicacion es " + multiplicacion
				+ " la division es " + division + " la resta de la division es " + restodivision);

		// Saco la media de los exámenes
		float pe = 6.5f;
		float pe0 = 7.5f;
		float pe1 = 7f;
		float resultadomedia = (pe + pe0 + pe1) / 3;
		System.out.print("El resultado de la media es " + resultadomedia);
		// Saco el iva de una comida y lo sumo a este
		double pp = 5;
		double sp = 10;
		double postre = 2;
		double preciosiniva = pp + sp + postre;
		double iva = (preciosiniva * 0.21);
		double precioconiva = preciosiniva + iva;
		System.out.println(" El resultado es " + precioconiva);
	}
}